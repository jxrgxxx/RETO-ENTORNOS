
public class Dialogo {
    public static String Escenario;
    public static String Conversacion;
    public static String Desenlace;

    static {
        Dialogo.Escenario = "";
        Dialogo.Conversacion = "";
        Dialogo.Desenlace = "";
    }

    public static void main(String[] args) {
        System.out.println(Dialogo.Escenario);
        System.out.println(Dialogo.Conversacion);
        System.out.println(Dialogo.Desenlace);
    }
}