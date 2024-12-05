
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
        System.out.println("Tesla: (Examinando el imán) Este dispositivo contiene un magnetismo natural. Podría interactuar con el resto de los objetos.");
        System.out.println("Juana: (A Leonardo) ¿Qué crees que representa esta máscara? Su tristeza parece un mensaje de advertencia.");
        System.out.println("Leonardo: (Examinando la tarjeta) Qué diseño tan curioso. Quizás algún código esté escondido aquí.");
        System.out.println("Cleopatra: En mi tiempo, el cálculo y la lógica eran claves para la victoria. Ese ábaco me intriga.");
        System.out.println("Tesla: Mis experimentos buscaban crear energía ilimitada. Tal vez hemos liberado algo más grande.");
        System.out.println("Juana: Dios guía mi espada, pero también mi mente. Pienso que debemos unirnos para resolver esto.");
        System.out.println("Leonardo: Tesla, explícanos cómo estas fuerzas invisibles pueden unirnos.");
        System.out.println("Cleopatra: (A Leonardo) Tu mente ingeniosa debe encontrar un diseño para esto. Yo lideraré al grupo.");
        System.out.println("Tesla: La electricidad fluye entre estos objetos. Tal vez podamos usarlos para activar algo.");
        System.out.println(Dialogo.Desenlace);
    }   
}