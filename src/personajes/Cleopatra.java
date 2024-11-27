package personajes;

/**
 * Victor Cebollada
 */
public class Cleopatra {
    public static String nombre;
    public static String descripcionFisica;
    public static String historia;
    public static String fraseTipica;

    static {
        Cleopatra.nombre = "";
        Cleopatra.descripcionFisica = "";
        Cleopatra.historia = "";
        Cleopatra.fraseTipica = "";
    }

    public static void main(String[] args) {
        System.out.println(Cleopatra.nombre + "\n");
        System.out.println(Cleopatra.descripcionFisica + "\n");
        System.out.println(Cleopatra.historia + "\n");
        System.out.println(Cleopatra.fraseTipica + "\n");
    }
}