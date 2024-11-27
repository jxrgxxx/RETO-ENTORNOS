package personajes;

/**
 * Oscar Sanchez
 */
public class JuanaDeArco {
    public static String nombre;
    public static String descripcionFisica;
    public static String historia;
    public static String fraseTipica;

    static {
        JuanaDeArco.nombre = "";
        JuanaDeArco.descripcionFisica = "";
        JuanaDeArco.historia = "";
        JuanaDeArco.fraseTipica = "";
    }

    public static void main(String[] args) {
        System.out.println(JuanaDeArco.nombre + "\n");
        System.out.println(JuanaDeArco.descripcionFisica + "\n");
        System.out.println(JuanaDeArco.historia + "\n");
        System.out.println(JuanaDeArco.fraseTipica + "\n");
    }
}