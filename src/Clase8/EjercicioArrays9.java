package Clase8;


import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays9 {

    public static void main(String[] args) {

//        9. Comparar arrays
//        Pide al usuario que introduzca dos arrays de enteros del mismo tamaño y muestra
//        cuántos elementos coinciden en la misma posición.
//         Ejemplo:
//        Array 1: {1, 2, 3, 4, 5}
//        Array 2: {1, 4, 3, 0, 5}
//        Coinciden en 3 posiciones (índices 0, 2 y 4).

        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario cuántos números va a introducir
        System.out.println("\n¿Cuántos números deseas introducir?");
        int cantidadNumeros = scanner.nextInt();

        // Creamos dos arrays con el tamaño introducido
        int[] arrayUno = new int[cantidadNumeros];
        int[] arrayDos = new int[cantidadNumeros];

        // Pedimos los valores del primer array
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Introduce el número " + (i + 1) + " del primer array: ");
            arrayUno[i] = scanner.nextInt();
        }

        // Pedimos los valores del segundo array
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Introduce el número " + (i + 1) + " del segundo array: ");
            arrayDos[i] = scanner.nextInt();
        }

        // Mostramos ambos arrays para que el usuario los vea
        System.out.println("\nArray 1: " + Arrays.toString(arrayUno));
        System.out.println("Array 2: " + Arrays.toString(arrayDos));

        // Contador de coincidencias en la misma posición
        int contadorCoincidencias = 0;

        // Usamos StringBuilder para guardar los índices donde coinciden
        StringBuilder posicionesCoinciden = new StringBuilder();

        // Recorremos ambos arrays comparando cada posición
        for (int i = 0; i < cantidadNumeros; i++) {
            if (arrayUno[i] == arrayDos[i]) {
                contadorCoincidencias++;              // Aumentamos el contador
                posicionesCoinciden.append(i).append(" "); // Guardamos el índice
            }
        }

        // Mostramos cuántas coincidencias hubo
        if (contadorCoincidencias == 1){

            System.out.println("\nCoinciden en " + contadorCoincidencias + " posición.");

        }else{

            System.out.println("\nCoinciden en " + contadorCoincidencias + " posiciones.");
        }


        // Si hubo coincidencias, mostramos las posiciones exactas
        if (contadorCoincidencias > 0) {
            System.out.println("Índices donde coinciden: " + posicionesCoinciden.toString().trim());
        }

        scanner.close();
    }
}
