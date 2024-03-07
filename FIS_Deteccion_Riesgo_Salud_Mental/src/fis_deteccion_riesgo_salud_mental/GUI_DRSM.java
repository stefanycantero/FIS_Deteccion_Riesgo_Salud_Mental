package fis_deteccion_riesgo_salud_mental;

import javax.swing.JOptionPane;

public class GUI_DRSM extends javax.swing.JFrame {
    
    FIS_System fis = new FIS_System();

    public GUI_DRSM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        instruccionLabel = new javax.swing.JLabel();
        estadoAnimoLabel = new javax.swing.JLabel();
        energiaLabel = new javax.swing.JLabel();
        cambiosComportamientoLabel = new javax.swing.JLabel();
        consumoSustanciasLabel = new javax.swing.JLabel();
        horasSuenoLabel = new javax.swing.JLabel();
        productividadLabel = new javax.swing.JLabel();
        interaccionSocialLabel = new javax.swing.JLabel();
        evaluarButton = new javax.swing.JButton();
        estadoAnimoTextField = new javax.swing.JTextField();
        energiaTextField = new javax.swing.JTextField();
        cambiosComportamientoTextField = new javax.swing.JTextField();
        consumoSustanciasTextField = new javax.swing.JTextField();
        horasTextField = new javax.swing.JTextField();
        productividadTextField = new javax.swing.JTextField();
        interaccionTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultadoTextArea = new javax.swing.JTextArea();
        resultadosLabel = new javax.swing.JLabel();
        pertenenciaLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pertenenciaTextArea = new javax.swing.JTextArea();
        salirButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calcular riesgo de desarrollo de transtorno mental", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12))); // NOI18N

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloLabel.setText("FIS Dectección de Riesgos en Salud Mental");

        instruccionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        instruccionLabel.setText("Ingrese cómo se siente en cada uno de los siguientes aspectos:");

        estadoAnimoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estadoAnimoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estadoAnimo.png"))); // NOI18N
        estadoAnimoLabel.setText("Estado de ánimo");

        energiaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        energiaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/energia.png"))); // NOI18N
        energiaLabel.setText("Energía");

        cambiosComportamientoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cambiosComportamientoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cambiosComportamiento.png"))); // NOI18N
        cambiosComportamientoLabel.setText("Cambios de comportamiento");

        consumoSustanciasLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        consumoSustanciasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consumoSustancias.png"))); // NOI18N
        consumoSustanciasLabel.setText("Consumo de sustancias");

        horasSuenoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        horasSuenoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/horas.png"))); // NOI18N
        horasSuenoLabel.setText("Horas de sueño");

        productividadLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productividadLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productividad.png"))); // NOI18N
        productividadLabel.setText("Productividad");

        interaccionSocialLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        interaccionSocialLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/interaccionSocial.png"))); // NOI18N
        interaccionSocialLabel.setText("Interacción social");

        evaluarButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        evaluarButton.setText("Evaluar");
        evaluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarButtonActionPerformed(evt);
            }
        });

        estadoAnimoTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estadoAnimoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                estadoAnimoTextFieldKeyPressed(evt);
            }
        });

        energiaTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        energiaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                energiaTextFieldKeyPressed(evt);
            }
        });

        cambiosComportamientoTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cambiosComportamientoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cambiosComportamientoTextFieldKeyPressed(evt);
            }
        });

        consumoSustanciasTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consumoSustanciasTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consumoSustanciasTextFieldKeyPressed(evt);
            }
        });

        horasTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        horasTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                horasTextFieldKeyPressed(evt);
            }
        });

        productividadTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productividadTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productividadTextFieldKeyPressed(evt);
            }
        });

        interaccionTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        interaccionTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                interaccionTextFieldKeyPressed(evt);
            }
        });

        resultadoTextArea.setEditable(false);
        resultadoTextArea.setColumns(20);
        resultadoTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resultadoTextArea.setRows(5);
        jScrollPane2.setViewportView(resultadoTextArea);

        resultadosLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resultadosLabel.setText("Resultados");

        pertenenciaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pertenenciaLabel.setText("Pertenencia a cada conjunto");

        pertenenciaTextArea.setEditable(false);
        pertenenciaTextArea.setColumns(20);
        pertenenciaTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pertenenciaTextArea.setRows(5);
        jScrollPane3.setViewportView(pertenenciaTextArea);

        salirButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(tituloLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(energiaLabel)
                                                    .addComponent(horasSuenoLabel)
                                                    .addComponent(productividadLabel)
                                                    .addComponent(consumoSustanciasLabel)
                                                    .addComponent(cambiosComportamientoLabel)
                                                    .addComponent(interaccionSocialLabel))
                                                .addGap(279, 279, 279)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(interaccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(horasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(energiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(productividadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cambiosComportamientoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(consumoSustanciasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(evaluarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(estadoAnimoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(estadoAnimoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(instruccionLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(resultadosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pertenenciaLabel)
                        .addGap(88, 88, 88)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addComponent(instruccionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoAnimoLabel)
                    .addComponent(estadoAnimoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(energiaLabel)
                    .addComponent(energiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horasSuenoLabel)
                    .addComponent(horasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productividadLabel)
                    .addComponent(productividadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambiosComportamientoLabel)
                    .addComponent(cambiosComportamientoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consumoSustanciasLabel)
                    .addComponent(consumoSustanciasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(interaccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interaccionSocialLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(evaluarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultadosLabel)
                            .addComponent(pertenenciaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void evaluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluarButtonActionPerformed
        
        double estado_animo = Double.parseDouble(estadoAnimoTextField.getText().replace(",","."));
        double energia = Double.parseDouble(energiaTextField.getText().replace(",","."));
        double horas_sueno_diario = Double.parseDouble(horasTextField.getText().replace(",","."));
        double productividad = Double.parseDouble(productividadTextField.getText().replace(",","."));        
        double cambios_comportamiento = Double.parseDouble(cambiosComportamientoTextField.getText().replace(",","."));
        double consumo_sustancias = Double.parseDouble(consumoSustanciasTextField.getText().replace(",","."));
        double interaccion_social = Double.parseDouble(interaccionTextField.getText().replace(",","."));                
        
        double[] resultado = fis.evaluar(estado_animo, energia, horas_sueno_diario, productividad, cambios_comportamiento, consumo_sustancias, interaccion_social);
        String[] riesgos = {"Riesgo ansiedad", "Riesgo de depresion", "Riesgo transtorno personalidad"};

        StringBuilder resultadosText = new StringBuilder();
        for (int i = 0; i < resultado.length; i++) {
            resultadosText.append(riesgos[i]).append(": ").append(resultado[i]).append("\n");
        }
        resultadoTextArea.setText(resultadosText.toString());

        pertenenciaTextArea.setText(fis.getCD());

    }//GEN-LAST:event_evaluarButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirButtonActionPerformed

    private void estadoAnimoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estadoAnimoTextFieldKeyPressed
        verificar(evt);
    }//GEN-LAST:event_estadoAnimoTextFieldKeyPressed

    private void energiaTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_energiaTextFieldKeyPressed
        verificar(evt);
    }//GEN-LAST:event_energiaTextFieldKeyPressed

    private void cambiosComportamientoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cambiosComportamientoTextFieldKeyPressed
        verificar(evt);
    }//GEN-LAST:event_cambiosComportamientoTextFieldKeyPressed

    private void consumoSustanciasTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consumoSustanciasTextFieldKeyPressed
        verificar(evt);
    }//GEN-LAST:event_consumoSustanciasTextFieldKeyPressed

    private void horasTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horasTextFieldKeyPressed
        verificar(evt);
    }//GEN-LAST:event_horasTextFieldKeyPressed

    private void productividadTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productividadTextFieldKeyPressed
        verificar(evt);
    }//GEN-LAST:event_productividadTextFieldKeyPressed

    private void interaccionTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_interaccionTextFieldKeyPressed
        verificar(evt);
    }//GEN-LAST:event_interaccionTextFieldKeyPressed
                                           

    private void verificar(java.awt.event.KeyEvent evt){
        char v = evt.getKeyChar();
        if (Character.isLetter(v)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, """
                                                    Valor inv\u00e1lido. Ingrese solo n\u00fameros dentro de los rangos permitidos:
                                                    [0,7]: cambios de comportamiento, consumo de sustancias psicoactivas, interacci\u00f3n social
                                                    [0, 10]: estado de \u00e1nimo, energ\u00eda, productividad, riesgo de depresi\u00f3n, riesgo de ansiedad, riesgo de trastorno de personalidad
                                                    [0, 15]: horas de sue\u00f1o""");
        }
    }
        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_DRSM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cambiosComportamientoLabel;
    private javax.swing.JTextField cambiosComportamientoTextField;
    private javax.swing.JLabel consumoSustanciasLabel;
    private javax.swing.JTextField consumoSustanciasTextField;
    private javax.swing.JLabel energiaLabel;
    private javax.swing.JTextField energiaTextField;
    private javax.swing.JLabel estadoAnimoLabel;
    private javax.swing.JTextField estadoAnimoTextField;
    private javax.swing.JButton evaluarButton;
    private javax.swing.JLabel horasSuenoLabel;
    private javax.swing.JTextField horasTextField;
    private javax.swing.JLabel instruccionLabel;
    private javax.swing.JLabel interaccionSocialLabel;
    private javax.swing.JTextField interaccionTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pertenenciaLabel;
    private javax.swing.JTextArea pertenenciaTextArea;
    private javax.swing.JLabel productividadLabel;
    private javax.swing.JTextField productividadTextField;
    private javax.swing.JTextArea resultadoTextArea;
    private javax.swing.JLabel resultadosLabel;
    private javax.swing.JButton salirButton;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
