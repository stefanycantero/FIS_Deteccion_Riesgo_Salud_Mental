package fis_deteccion_riesgo_salud_mental;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

public class FIS_System {

    final private String path_FIS = "src\\fis_deteccion_riesgo_salud_mental\\FCL_DRSM.fcl"; 
    final private FIS fis_var;

    public FIS_System() {
        this.fis_var = FIS.load(this.path_FIS, true);
        if (this.fis_var == null) {
            System.out.println("Error al cargar el FIS");
        }
    }

    public double[] evaluar(double estado_animo, double energia, double horas_sueno_diario, double productividad, double cambios_comportamiento, double consumo_sustancias, double interaccion_social) {

        this.fis_var.setVariable("estado_animo", estado_animo);
        this.fis_var.setVariable("energia", energia);
        this.fis_var.setVariable("horas_sueno_diario", horas_sueno_diario);
        this.fis_var.setVariable("productividad", productividad);        
        this.fis_var.setVariable("cambios_comportamiento", cambios_comportamiento);
        this.fis_var.setVariable("consumo_sustancias", consumo_sustancias);
        this.fis_var.setVariable("interaccion_social", interaccion_social);

        this.fis_var.evaluate();

        JFuzzyChart.get().chart(this.fis_var.getFunctionBlock("detector"));

        double riesgo_ansiedad = this.fis_var.getVariable("riesgo_ansiedad").getLatestDefuzzifiedValue();
        double riesgo_depresion = this.fis_var.getVariable("riesgo_depresion").getLatestDefuzzifiedValue();
        double riesgo_trastorno_personalidad = this.fis_var.getVariable("riesgo_trastorno_personalidad").getLatestDefuzzifiedValue();

        return new double[] {riesgo_ansiedad, riesgo_depresion, riesgo_trastorno_personalidad};
    }

    public String getCD() {

        String[] variables_salida = {"riesgo_ansiedad", "riesgo_depresion", "riesgo_trastorno_personalidad"};
        String[] CD_salida = {"muy_bajo", "bajo", "medio", "alto", "muy_alto"};
        String resultado = "";

        for (String variable : variables_salida) {
            for (String vl : CD_salida) {
                if (this.fis_var.getVariable(variable).getMembership(vl) > 0) {
                    resultado += variable + ": " + vl + "\n";
                }
            }
        }

        resultado = resultado.strip();
        StringBuilder sb = new StringBuilder(resultado);
        sb.deleteCharAt(resultado.length() - 1);

        return sb.toString();
    }
}