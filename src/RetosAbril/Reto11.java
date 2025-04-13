package RetosAbril;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Random;

public class Reto11 {

    public static void main(String[] args) {

//        El programa elige una palabra secreta (por ejemplo, "programar").
//        El usuario tiene 5 intentos para adivinar la palabra.
//        En cada intento, el programa compara la palabra introducida por el usuario con la palabra secreta.
//        Si son iguales, muestra un mensaje de felicitación y termina.
//        Si no son iguales, indica cuántos intentos le quedan.
//        Si se agotan los intentos sin adivinar, muestra la palabra secreta y un mensaje de "¡Game Over!".

        // Lista de palabras posibles
        String[] palabrasSecreta = {"manzana", "pera", "naranja", "pomelo", "fresa"};

        // Generador de palabra secreta aleatoria
        Random random = new Random();
        String palabraSecreta = palabrasSecreta[random.nextInt(palabrasSecreta.length)];

        // Preparamos el Scanner para leer lo que escribe el usuario
        Scanner scanner = new Scanner(System.in);
        String palabra;  // Variable para la palabra introducida por el usuario
        int intentos = 0; // Contador de intentos

        // Bucle principal: máximo 5 intentos
        while (intentos < 5) {
            System.out.println("Introduce la fruta secreta: ");
            palabra = scanner.nextLine().toLowerCase();  // Convertimos a minúscula para comparación

            // Si el usuario acierta la palabra
            if (palabra.equals(palabraSecreta)) {
                System.out.println("Palabra introducida = " + palabra);
                System.out.println("Palabra aleatoria = " + palabraSecreta);
                System.out.println("¡Has acertado la palabra!");
                break; // Salimos del bucle
            } else {
                intentos++;  // Sumamos un intento fallido
                int intentosRestantes = 5 - intentos;

                if (intentosRestantes > 0) {
                    System.out.println("No has acertado. Te quedan " + intentosRestantes + " intento(s).");
                }
            }
        }

        // Si se agotan todos los intentos sin acertar
        if (intentos == 5) {
            System.out.println("La palabra secreta era " + palabraSecreta + ".");
            System.out.println("GAME OVER!!");
        }

        scanner.close();  // Cerramos el Scanner
    }
}
