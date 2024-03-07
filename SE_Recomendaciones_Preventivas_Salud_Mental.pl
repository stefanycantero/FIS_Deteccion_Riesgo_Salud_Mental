% Hechos sobre los riesgos y recomendaciones
riesgo(ansiedad).
riesgo(depresion).
riesgo(trastorno_personalidad).
nivel(bajo).
nivel(medio).
nivel(alto).
nivel(muy_alto).

% Hechos sobre los tipos de posibles casos
caso(ansiedad, bajo).
caso(depresion, bajo).
caso(trastorno_personalidad, bajo).
caso(ansiedad, medio).
caso(depresion, medio).
caso(trastorno_personalidad, medio).
caso(ansiedad, alto).
caso(depresion, alto).
caso(trastorno_personalidad, alto).

% Reglas para hacer preguntas y dar recomendaciones
preguntar_riesgo(Riesgo) :-
    write('¿Cuál es el riesgo en el que estás interesado? (ansiedad/depresion/trastorno_personalidad)'),
    read(Riesgo).

preguntar_nivel(Nivel, Riesgo) :-
    write('¿Cuál es el nivel de riesgo de '), write(Riesgo), write('? (bajo, medio, alto, muy_alto) '),
    read(Nivel),
    preguntas_especificas(Nivel, Riesgo).

preguntas_especificas(bajo, _) :-
    pregunta_nivel_bajo.

preguntas_especificas(medio, Riesgo) :-
    pregunta_nivel_medio(Riesgo).

preguntas_especificas(alto, Riesgo) :-
    pregunta_nivel_alto(Riesgo).

preguntas_especificas(muy_alto, _) :-
    pregunta_nivel_muy_alto.

pregunta_nivel_bajo :-
    write('Aunque tu riesgo sea bajo, es importante cuidar tu bienestar emocional y buscar apoyo si consideras que lo necesitas.'),
    nl.

pregunta_nivel_medio(Riesgo) :-
    pregunta_nivel_medio_1(Riesgo),
    pregunta_nivel_medio_2(Riesgo),
    pregunta_nivel_medio_3(Riesgo).

pregunta_nivel_medio_1(ansiedad) :-
    write('¿Experimentas frecuentemente sensaciones de nerviosismo, intranquilidad o angustia? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Te aconsejo intentar practicar técnicas de relajación como la respiración profunda, la meditación o el yoga para reducir el nivel de estrés y promover la calma mental. Si estas sensaciones persisten y se intensifican, no dudes en acudir a un profesional.');
        true),
    (Respuesta == no ->  
    write('Excelente, igual si no meditas, sería bueno que lo empezaras a hacer.');
    true),
    nl.

pregunta_nivel_medio_1(depresion) :-
    write('¿Has experimentado pérdida de interés en actividades que solías disfrutar? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Te invito a reflexionar sobre cuál puede ser la causa de esa pérdida de interés. Si es por aburrimiento o falta de motivación, puedes añadirle algo nuevo a lo que hacías antes o recompensarte cuando finalices cada actividad para hacerla más llamativa.');
        true),
    (Respuesta == no ->  
    write(' Esa es una buena señal. Sigue disfrutando de tus actividades favoritas.');
    true),
    nl.

pregunta_nivel_medio_1(trastorno_personalidad) :-
    write('¿Experimentas dificultades para relacionarte con los demás? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Experimentar dificultades para relacionarte con los demás puede ser una señal de que necesitas trabajar en tus habilidades sociales. Buscar actividades donde puedas practicar la interacción con otras personas, como grupos de apoyo, clases de habilidades sociales o terapia individual.');
        true),
    (Respuesta == no ->  
    write('Esto indica que estás manejando bien esta área.');
    true),
    nl.

pregunta_nivel_medio_2(ansiedad) :-
    write('¿Te cuesta quedarte dormido o te despiertas varias veces? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Te aconsejo establecer una rutina relajante antes de acostarte, como leer un libro, meditar o practicar ejercicios de respiración. Limita la exposición a dispositivos electrónicos una hora antes de dormir y mantén tu cuarto organizado, procura tender la cama en las mañanas.');
        true),
    (Respuesta == no ->  
    write('Muy bien, continúa manteniendo una buena higiene del sueño y practica técnicas de relajación para promover un descanso adecuado y reparador.\n');
    true),
    nl.

pregunta_nivel_medio_2(depresion) :-
    write('¿Realizas actividades o tienes pasatiempos fuera de la vida académica? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Si esas actividades ya no resultan satisfactorias, siempre hay lugar para cambios. Puedes explorar con otros pasatiempos que se ajusten mejor a tus intereses actuales.');
        true),
    (Respuesta == no ->  
    write('Te recomiendo realizar alguna de estas actividades que se ajusten a tus gustos y ritmo de vida: practicar un deporte o ir al gimnasio, leer, pintar, meditar, dibujar, ver series o películas, aprender algo nuevo como un idioma o a tocar un instrumento.');
    true),
    nl.

pregunta_nivel_medio_2(trastorno_personalidad) :-
    write('¿Experimentas cambios bruscos de humor? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('La terapia cognitivo-conductual puede ser especialmente útil en este caso, aprender técnicas de regulación emocional, como la meditación y el mindfulness para ayudarte a manejar mejor tus emociones.');
        true),
    (Respuesta == no ->  
    write('Continúa practicando el autocontrol emocional y desarrollando estrategias para enfrentar desafíos emocionales si surgen en el futuro.');
    true),
    nl.

pregunta_nivel_medio_3(ansiedad) :-
    write('¿Sientes una preocupación constante por el futuro, problemas que no han ocurrido u otras cosas por el estilo? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Trata de practicar la atención plena o mindfulness para mantener tu enfoque en el presente y reducir la tendencia a preocuparte por el futuro. Además, es útil establecer límites de tiempo para preocuparse y buscar actividades para distraerte, el ejercicio es muy útil.');
        true),
    (Respuesta == no ->  
    write('Genial, igual te recomiendo mantenerte alerta ante cualquier cambio en tus patrones de pensamiento y buscar apoyo si comienzas a experimentar preocupaciones persistentes.');
    true),
    nl.

pregunta_nivel_medio_3(depresion) :-
    write('¿Tienes una rutina diaria? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Tal vez haya acciones en tu rutina que no se adaptan a tus necesidades diarias. Puedes modificarla o ser más flexible para encontrar un balance que permita regular el ritmo cotidiano y mejorar tu estado de ánimo.');
        true),
    (Respuesta == no ->  
    write('Intenta establecer una rutina diaria que te permita realizar hábitos básicos de cuidado personal y alimentación para regular los ritmos cotidianos y mejorar el estado de ánimo.');
    true),
    nl.

pregunta_nivel_medio_3(trastorno_personalidad) :-
    write('¿Experimentas pensamientos obsesivos o compulsivos? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('La ayuda profesional como la terapia de exposición y prevención de respuesta es una opción para aprender a controlar estos pensamientos y comportamientos.');
        true),
    (Respuesta == no ->  
    write('Es importante valorar y mantener este equilibrio mental.');
    true),
    nl.

pregunta_nivel_alto(Riesgo) :-
    pregunta_nivel_alto_1(Riesgo),
    pregunta_nivel_alto_2(Riesgo),
    pregunta_nivel_alto_3(Riesgo).

pregunta_nivel_alto_1(ansiedad) :-
    write('¿Experimentas miedo o ataques de pánico cuando estás en un lugar donde hay muchas personas?(si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Buscar ayuda profesional para abordar estos ataques de pánico, ya sea a través de terapia cognitivo-conductual (TCC), técnicas de exposición gradual o medicación bajo la supervisión de un médico especializado. También puedes recurrir a las líneas de salud mental, las puedes consultar acá: https://www.colpsic.org.co/wp-content/uploads/2021/08/Directorio-salud-mental-Colombia.pdf.');
        true),
    (Respuesta == no ->  
    write('Excelente, sin embargo, es importante estar atento a cualquier cambio en tus síntomas y no dudes en buscar ayuda si comienzas a experimentarlos en el futuro.');
    true),
    nl.

pregunta_nivel_alto_1(depresion) :-
    write('¿Has tenido pensamientos o ideas suicidas? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Tu integridad tanto física como mental son importantes. Diseña un plan de emergencia que incluya hablar con una persona de confianza sobre cómo te sientes, tener a la mano el número de la línea amiga saludable 444-44-4, alejar cualquier objeto peligroso en tu hogar y realizar la técnica Debate de pensamientos. Considera buscar ayuda profesional y evita el alcohol y otro tipo de droga.');
        true),
    (Respuesta == no ->  
    write('Recuerda que una buena salud mental es un pilar para una buena vida. En caso de emergencias, llama a la línea amiga saludable 444-44-48 y busca ayuda de un profesional en salud mental.');
    true),
    nl.

pregunta_nivel_alto_1(trastorno_personalidad) :-
    write('¿Te resulta difícil controlar tus impulsos?(si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Te sugiero trabajar con un terapeuta especializado en trastornos de control de impulsos, quien puede ayudarte a identificar las causas subyacentes de tus impulsos y desarrollar estrategias para manejarlos de manera más efectiva.');
        true),
    (Respuesta == no ->  
    write('Sigue cultivando esta habilidad mediante la práctica del autocontrol y la toma de decisiones conscientes en situaciones desafiantes.');
    true),
    nl.

pregunta_nivel_alto_2(ansiedad) :-
    write('¿Has experimentado palpitaciones cardíacas, dificultad para respirar, sudoración excesiva o mareos en momentos de mucho estrés?(si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Es importante que te tomes un momento para respirar profundo y tratar de calmarte, es bueno estar acompañado de alguien de confianza para poder afrontar estas situaciones, y lo más importante, busca ayuda profesional para que te ayuden a controlar estos síntomas desde la visión de un experto y poder saber mejor por qué te pasa eso.');
        true),
    (Respuesta == no ->  
    write('Excelente, sin embargo, es importante estar atento a cualquier cambio en tus síntomas y no dudes en buscar ayuda si comienzas a experimentarlos en el futuro.');
    true),
    nl.

pregunta_nivel_alto_2(depresion) :-
    write('¿Sueles tener pensamientos negativos sobre ti o sobre la percepción que tienen de ti las demás personas? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Realiza la técnica Debate de pensamientos. Sé compasivo contigo mismo, agradécete por dar lo mejor de ti cada día, concéntrate en lo que haces bien y eres bueno. Considera buscar ayuda profesional y llama a la línea amiga saludable  444-44-48 en caso de emergencias.');
        true),
    (Respuesta == no ->  
    write('Recuerda que una buena salud mental es un pilar para una buena vida. En caso de emergencias, llama a la línea amiga saludable 444-44-48 y busca ayuda de un profesional en salud mental.');
    true),
    nl.

pregunta_nivel_alto_2(trastorno_personalidad) :-
    write('¿Sientes que tus emociones son intensas y difíciles de manejar? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Practica ejercicios de respiración profunda, visualización o relajación muscular. Si sientes que tus emociones son intensas y difíciles de manejar, te recomendaría buscar ayuda de un terapeuta especializado.');
        true),
    (Respuesta == no ->  
    write('Continúa practicando estrategias de regulación emocional y manteniendo un equilibrio emocional saludable en tu vida diaria.');
    true),
    nl.

pregunta_nivel_alto_3(ansiedad) :-
    write('¿Evitas situaciones o actividades que te generan ansiedad, incluso si son importantes o significativas para ti? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write(' Es comprensible que quieras evitar situaciones que te generan ansiedad, pero enfrentarlas gradualmente puede ayudarte a superar tus miedos, habla con un terapeuta para recibir apoyo y aprender estrategias para enfrentar estas situaciones de manera más segura y que puedas mejorar.');
        true),
    (Respuesta == no ->  
    write('Excelente, sin embargo, es importante estar atento a cualquier cambio en tus síntomas y no dudes en buscar ayuda si comienzas a experimentarlos en el futuro.');
    true),
    nl.

pregunta_nivel_alto_3(depresion) :-
    write('¿Tienes una percepción negativa o desesperanzadora sobre el futuro? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('En ocasiones las experiencias negativas del pasado pueden hacer crecer el miedo a la repetición en el futuro, recuerda que las acciones que realices hoy serán la base para que suceda algo mejor. Establece metas realistas y acciones para cumplirlas que se ajusten a lo que sí está en tus manos, intenta cambiar el enfoque de tus pensamientos, recuerda que no puedes controlar todo lo que pase, pero sí cómo te enfrentas a ello. Considera buscar ayuda profesional y llama a la línea amiga saludable  444-44-48 en caso de emergencias.');
        true),
    (Respuesta == no ->  
    write('Recuerda que una buena salud mental es un pilar para una buena vida. En caso de emergencias, llama a la línea amiga saludable 444-44-48 y busca ayuda de un profesional en salud mental.');
    true),
    nl.

pregunta_nivel_alto_3(trastorno_personalidad) :-
    write('¿Has tenido dificultades para mantener relaciones estables? (si/no) '),
    read(Respuesta),
    (Respuesta == si ->
        write('Un terapeuta puede ayudarte a identificar patrones de comportamiento que puedan estar interfiriendo en tus relaciones, así como a desarrollar habilidades de comunicación y resolución de conflictos para mejorar tus relaciones en el futuro.');
        true),
    (Respuesta == no ->  
    write('Esto puede reflejar una comunicación efectiva, empatía y compromiso en tus relaciones.');
    true),
    nl.

pregunta_nivel_muy_alto :-
    write('Busca ayuda de inmediato, comunícate con una línea de ayuda de emergencia como: https://www.colpsic.org.co/wp-content/uploads/2021/08/Directorio-salud-mental-Colombia.pdf o busca atención médica urgente en un hospital o centro de salud mental. No estás solo, hay profesionales capacitados listos para brindarte apoyo.').

% Reglas para ejecutar el sistema experto
iniciar :-
    preguntar_riesgo(Riesgo),
    preguntar_nivel(_, Riesgo),
    reiniciar.

reiniciar :-
  write('¿Desea hacer otra consulta? (si/no) '),
  read(Respuesta),
  (Respuesta == si ->
    iniciar;
  Respuesta == no ->
    write('Gracias por utilizar el sistema experto. Hasta luego.'),
  abort).
:- iniciar.