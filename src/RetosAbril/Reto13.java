package RetosAbril;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto13 {

    public static void main(String[] args) {

//        ¿Alguna vez te has levantado con la necesidad de crear un cronómetro? Tranquilo, no eres el único.
//        Hoy vas a poder hacer tu sueño realidad.
//        Crea un programa que: Pida al usuario que ingrese el número de segundos que desea contar.
//        Usa un bucle para contar desde el primer segundo hasta el número total de segundos indicado por el usuario.
//        Cada vez que el cronómetro llegue a 60 segundos, debe reiniciar los segundos a 0 y sumar 1 minuto.
//        Cuando los minutos lleguen a 60, debe reiniciar los minutos a 0 y sumar 1 hora.
//        El cronómetro debe mostrar el tiempo en formato hh:mm:ss, donde hh son las horas,
//        mm los minutos y ss los segundos.
//
//        PISTA: Para que el cronómetro se actualice cada segundo, puedes utilizar la función time.sleep(1).
//        Esto hará que el programa espere 1 segundo entre cada iteración del bucle,
//        imitando el comportamiento de un cronómetro real.
//
//        Ejemplo:
//        -------------------------------
//        00:00:01
//        00:00:02
//        00:00:03
//        etc.

        // Creamos el Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedimos al usuario cuántos segundos quiere contar
            System.out.println("Introduce el número de segundos que deseas contar: ");
            int segundosUsuario = scanner.nextInt(); // Leemos un número entero

            // Bucle que cuenta desde 1 hasta el número introducido
            for (int i = 1; i <= segundosUsuario; i++) {

                // Calculamos las horas completas (3600 segundos = 1 hora)
                int horas = i / 3600;

                // Calculamos los minutos del resto de segundos que no llegaron a una hora
                int minutos = (i % 3600) / 60;

                // Calculamos los segundos que no llegaron a formar un minuto completo
                int segundos = i % 60;

                // Mostramos el tiempo en formato hh:mm:ss, con dos dígitos por bloque
                System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

                // Esperamos 1 segundo entre cada iteración para simular el cronómetro real
                try {
                    Thread.sleep(1000); // 1000 ms = 1 segundo
                } catch (InterruptedException e) {
                    // Capturamos posibles interrupciones del hilo de ejecución
                    System.out.println("Cronómetro interrumpido.");
                }
            }

            // Mensaje final cuando termina el conteo
            System.out.println("¡Tiempo completado!");

        } catch (InputMismatchException e) {
            // Si el usuario no introduce un número entero válido
            System.out.println("El dato introducido debe ser un número entero.");
        }

        // Cerramos el scanner al final del programa
        scanner.close();

    }
}
