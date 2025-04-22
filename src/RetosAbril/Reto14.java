package RetosAbril;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Clase principal que contiene el programa
public class Reto14 {

    // Clase interna Flashcard que representa una tarjeta con pregunta y respuesta
    public static class Flashcard {
        String pregunta;   // Campo para la pregunta
        String respuesta;  // Campo para la respuesta

        // Constructor de la clase Flashcard
        public Flashcard(String pregunta, String respuesta) {
            this.pregunta = pregunta;
            this.respuesta = respuesta;
        }
    }

    public static void main(String[] args) {
        // Creamos una lista para almacenar todas las flashcards
        List<Flashcard> flashcards = new ArrayList<>();

        // Creamos el Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para permitir al usuario añadir nuevas tarjetas
        while (true) {
            System.out.println("¿Quieres añadir otra tarjeta? (si/no)");
            String seguir = scanner.nextLine();

            // Si el usuario escribe "no", salimos del bucle
            if (seguir.equalsIgnoreCase("no")) break;

            // Pedimos la pregunta
            System.out.println("Introduce la pregunta: ");
            String pregunta = scanner.nextLine();

            // Pedimos la respuesta
            System.out.println("Introduce la respuesta: ");
            String respuesta = scanner.nextLine();

            // Añadimos una nueva flashcard a la lista
            flashcards.add(new Flashcard(pregunta, respuesta));
        }

        // Variables para contar cuántas respuestas ha acertado o fallado el usuario
        int preguntasAcertadas = 0;
        int preguntasFalladas = 0;

        // Bucle de práctica: se repite hasta que el usuario escriba "salir"
        while (true) {
            // Generamos una tarjeta aleatoria de la lista
            Random random = new Random();
            Flashcard tarjeta = flashcards.get(random.nextInt(flashcards.size()));

            // Mostramos la pregunta de la tarjeta
            System.out.println("Pregunta: " + tarjeta.pregunta);

            // Leemos la respuesta del usuario
            System.out.println("Tu respuesta: ");
            String respuestaUsuario = scanner.nextLine();

            // Comparamos la respuesta del usuario con la correcta
            if (respuestaUsuario.equalsIgnoreCase(tarjeta.respuesta)) {
                preguntasAcertadas++; // Sumamos un acierto si es correcta
                System.out.println("¡Correcto!");
            } else {
                preguntasFalladas++; // Sumamos un fallo si es incorrecta
                System.out.println("Incorrecto. La respuesta era: " + tarjeta.respuesta);
            }

            // Preguntamos si el usuario quiere seguir o salir
            System.out.println("¿Quieres volver a ser preguntado? (si para seguir o salir para terminar)");
            respuestaUsuario = scanner.nextLine();

            // Si el usuario escribe "salir", terminamos el bucle
            if (respuestaUsuario.equalsIgnoreCase("salir")) break;
        }

        // Mostramos los resultados finales
        System.out.println("Has acertado " + preguntasAcertadas + " tarjetas.");
        System.out.println("Has fallado " + preguntasFalladas + " tarjetas.");

        // Cerramos el scanner
        scanner.close();
    }
}
