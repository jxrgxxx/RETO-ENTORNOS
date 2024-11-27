package personajes;

/**
 * Jorge Lei
 */
public class LeonardoDaVinci {
    public static String nombre;
    public static String descripcionFisica;
    public static String historia;
    public static String fraseTipica;

    static {
        LeonardoDaVinci.nombre = "";
        LeonardoDaVinci.descripcionFisica = "";
        LeonardoDaVinci.historia = "";
        LeonardoDaVinci.fraseTipica = "";
    }

    public static void main(String[] args) {
        System.out.println(LeonardoDaVinci.nombre + "\n");
        System.out.println(LeonardoDaVinci.descripcionFisica + "\n");
        System.out.println(LeonardoDaVinci.historia + "\n");
        System.out.println(LeonardoDaVinci.fraseTipica + "\n");
    }
}