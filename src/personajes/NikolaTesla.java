package personajes;

/**
 * Luca Soler
 */
public class NikolaTesla {
    public static String nombre;
    public static String descripcionFisica;
    public static String historia;
    public static String fraseTipica;

    static {
        NikolaTesla.nombre = "";
        NikolaTesla.descripcionFisica = "";
        NikolaTesla.historia = "";
        NikolaTesla.fraseTipica = "";
    }

    public static void main(String[] args) {
        System.out.println(NikolaTesla.nombre + "\n");
        System.out.println(NikolaTesla.descripcionFisica + "\n");
        System.out.println(NikolaTesla.historia + "\n");
        System.out.println(NikolaTesla.fraseTipica + "\n");
    }
}