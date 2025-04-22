package RetosAbril;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto12 {

    public static void main(String[] args) {

//        Pide al usuario que introduzca varios números enteros (uno por uno, y que indique "fin" para terminar).
//        El programa debe verificar si cada número introducido es un "número de la suerte".
//        Se considera un número de la suerte si es múltiplo de 7 (el resto de la división entre 7 es 0).
//        Por cada número de la suerte encontrado, el programa imprimirá "¡[número] es un número de la suerte!".
//        Al final, mostrará cuántos números de la suerte se encontraron en total.
//
//        Pista: No olvides usar el try/catch 🙂

        // Creamos el objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int contador = 0;  // Contador para los números de la suerte encontrados

        System.out.println("Introduce números enteros uno por uno. Escribe 'fin' para terminar.");

        // Bucle infinito que se rompe solo si el usuario escribe "fin"
        while (true) {
            System.out.print("Introduce un número: ");
            String entrada = scanner.nextLine(); // Leemos la entrada como texto

            // Si el usuario escribe "fin", salimos del bucle
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                // Intentamos convertir la entrada a número entero
                int numero = Integer.parseInt(entrada);

                // Verificamos si el número es múltiplo de 7
                if (numero % 7 == 0) {
                    System.out.println("¡" + numero + " es un número de la suerte!");
                    contador++; // Aumentamos el contador si lo es
                } else {
                    System.out.println(numero + " no es un número de la suerte.");
                }

            } catch (NumberFormatException e) {
                // Si no se puede convertir a número (por ejemplo, letras), mostramos error
                System.out.println("Debes introducir un número válido o 'fin' para salir.");
            }
        }

        // Mostramos el total de números de la suerte encontrados
        System.out.println("\nHas encontrado " + contador + " número(s) de la suerte.");
        System.out.println("Programa finalizado!!");

        // Cerramos el Scanner al terminar el programa
        scanner.close();

    }
}
