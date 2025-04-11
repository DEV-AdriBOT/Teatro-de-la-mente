package neon.dev.teatro_de_la_mente;

public class Assets {

    // TITULOS DE ACTOS
    public static final String ACTO_I_TITULO = "✦ EL DESPERTAR ✦";
    public static final String ACTO_II_TITULO = "✦ LA INFANCIA OLVIDADA ✦";
    public static final String ACTO_III_TITULO = "✦ DECISIONES RENCOROSAS ✦";
    public static final String ACTO_IV_TITULO = "✦ EL ESPEJO FINAL ✦";

    // INTRODUCCIONES
    public static final String ACTO_I_INTRO = """
            Te despiertas sobre madera vieja.
            El silencio pesa más que el aire.
            Una tenue luz se cuela por el telón cerrado.
            El escenario está vacío... pero sientes que alguien observa.
            """;

    public static final String ACTO_II_INTRO = """
            Muñecos polvorientos.
            Canciones sin letra.
            Una habitación que no debería seguir aquí... pero aún lo está.
            Los recuerdos no mueren. Se esconden.
            """;

    public static final String ACTO_III_INTRO = """
            Sillas alineadas como jueces.
            Una marioneta con tu cara.
            Escuchas tu propia voz… juzgándote.
            Aquí, cada error es un eco. Cada mentira, un actor.
            """;

    public static final String ACTO_IV_INTRO = """
            No hay público.
            No hay aplausos.
            Solo un espejo.
            Y tú, por fin… sin guión.
            """;

    // DIÁLOGOS INICIALES
    public static final String ACTO_I_DIALOGO = """
            VOZ MISTERIOSA: “¿Sabes dónde estás… o solo finges que no lo recuerdas?”
            TÚ (pensando): “¿Esto es real...? ¿O solo una escena más de algo que no escribí yo?”
            """;

    public static final String ACTO_II_DIALOGO = """
            VOZ MISTERIOSA: “La niñez es un acto que nadie ensaya. Y aún así, lo repetimos toda la vida.”
            TÚ: “Algo está mal… esa cuna no debería estar vacía.”
            """;

    public static final String ACTO_III_DIALOGO = """
            VOZ MISTERIOSA: “¿Y si cada decisión que tomaste... nunca fue tuya?”
            TÚ: “...Yo solo hacía lo que podía. ¿No?”
            """;

    public static final String ACTO_IV_DIALOGO = """
            VOZ MISTERIOSA: “Llegaste al final. Pero dime… ¿te atreverás a mirarte sin máscara?”
            TÚ: “Solo si el reflejo no miente.”
            """;

    // MARCADORES DE IMAGEN (para sustituir luego por rutas reales)
    public static final String IMG_PORTADA = "imagenX_portada";
    public static final String IMG_ESCENA_1 = "imagenX_escena1";
    public static final String IMG_ESCENA_2 = "imagenX_escena2";
    public static final String IMG_MIRROR = "imagenX_espejo";

    // ESTILOS GENERALES (por si quieres usarlos en varias pantallas)
    public static final String FONT_TITLE_STYLE = "-fx-font-size: 36px; -fx-fill: white;";
    public static final String FONT_SUBTITLE_STYLE = "-fx-font-size: 20px; -fx-fill: gray;";
    public static final String FONT_DIALOG_STYLE = "-fx-font-size: 16px; -fx-fill: white;";
}
