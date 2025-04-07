package RetosAbril;

import java.util.Random;
import java.util.Scanner;

public class Reto7 {

    /*Imagina una emocionante carrera entre caracoles cibernéticos.
     Cada caracol tiene una velocidad aleatoria entre 1 y 5 (¡qué emoción!).
     Escribe un programa que simule una carrera de 20 "pasos" entre dos caracoles.
     En cada paso, la posición de cada caracol aumenta según su velocidad.
     Al final, ¡declara al caracol ganador (o si hay un emocionante empate)!
     */


    public static void main(String[] args) {

        // Variables que almacenan la posición total recorrida por cada caracol
        int posicionCaracol1 = 0;
        int posicionCaracol2 = 0;

        // Objetos para generar números aleatorios y leer datos desde consola
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("Bienvenido a la carrera más emocionante de caracoles!\n ");

        // Se pide al usuario la cantidad de pasos de la carrera (es decir, la duración)
        System.out.println("¿Qué distancia tiene la carrera?");
        int pasos = scanner.nextInt();

        // Utilizamos un bloque try-catch porque Thread.sleep puede lanzar una excepción
        try {
            // Bucle que simula cada uno de los "pasos" de la carrera
            for (int i = 0; i < pasos; i++) {

                // Se genera una velocidad aleatoria entre 1 y 5 para cada caracol
                int velocidadCaracol1 = random.nextInt(5) + 1;
                int velocidadCaracol2 = random.nextInt(5) + 1;

                // Se suman esas velocidades a las posiciones acumuladas
                posicionCaracol1 += velocidadCaracol1;
                posicionCaracol2 += velocidadCaracol2;

                // Mostramos el estado actual después del paso
                System.out.println("Paso: " + (i + 1));
                System.out.println("Caracol 1 avanza " + velocidadCaracol1 + " -> Total: " + posicionCaracol1);
                System.out.println("Caracol 2 avanza " + velocidadCaracol2 + " -> Total: " + posicionCaracol2);
                System.out.println("-----------------------------------");

                // Pausa visual entre cada paso (600 milisegundos = 0.6 segundos)
                Thread.sleep(900);
            }

            // Después del bucle, se determina el ganador comparando las posiciones finales
            if (posicionCaracol1 > posicionCaracol2) {
                System.out.println("El ganador es el caracol 1.");
            } else if (posicionCaracol2 > posicionCaracol1) {
                System.out.println("El ganador es el caracol 2.");
            } else {
                System.out.println("Empateeee!!");
            }

        } catch (InterruptedException e) {
            // Si ocurre una interrupción durante Thread.sleep, se captura y se notifica
            System.out.println("La carrera fue interrumpida 🐌💥");
        }

        // Cerramos el scanner para liberar recursos del sistema
        scanner.close();
    }
    }

