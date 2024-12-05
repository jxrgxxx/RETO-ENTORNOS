
public class Dialogo {
    public static String Escenario;
    public static String Conversacion;
    public static String Desenlace;

    static {
        Dialogo.Escenario = "Los personajes han sido transportados a una habitación misteriosa llena de objetos extraños.\nEntre ellos, una tarjeta antigua, un ábaco, un imán, y una máscara con expresión triste.\nTesla intenta explicar cómo sus experimentos los reunieron.\n";

        Dialogo.Desenlace = "Al activar el sistema, una explosión de luz devuelve a cada personaje a su tiempo,\ncon la lección de que incluso los objetos más simples tienen un propósito en las manos adecuadas.\n";
    }

    public static void main(String[] args) {
        System.out.println(Dialogo.Escenario);

        //conversación
        System.out.println("Tesla: Lamento la confusión, pero parece que mi máquina ha abierto un portal en el tiempo. La electricidad es el alma del universo, y ahora compartimos este momento fuera de nuestras épocas.");
        System.out.println("Leonardo: Tranquilo, todo está conectado. La mecánica del universo a veces da lugar a encuentros inesperados, como este.");    
        System.out.println("Cleopatra:Me interesa saber quién está detrás de este fenómeno, porque el poder no se concede, se toma");
        System.out.println("Juana: (Mirando la máscara triste) ¿Será esto una prueba divina? Dios guía mi espada, pero también mi propósito.");
        System.out.println("Leonardo: Este objeto, el ábaco, parece una herramienta para los números. Tal vez aquí reside una clave para regresar.");
        System.out.println("Cleopatra: (Señalando la tarjeta) Un mensaje, tal vez una orden. Lo que significa que debemos descubrirlo.");

        System.out.println(Dialogo.Desenlace);
    }
}