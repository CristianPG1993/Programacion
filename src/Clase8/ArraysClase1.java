package Clase8;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClase1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){

            System.out.println("Introduce el numero " + ( i + 1) + ": ");
            numeros[i] = scanner.nextInt();

        }

        System.out.println("\nRecorrido con FOR: ");
        for (int i = 0; i < numeros.length; i++){

            System.out.println("El numero " + (i + 1) + " es: " + numeros[i]);
        }

        System.out.println("\nRecorrido con FOR-EACH: ");
        int contador = 1;
        for (int numero : numeros){
            System.out.println("Numero " + contador + ": " + numero);
            contador++;
        }

        System.out.println("\nRecorrido con WHILE: ");
        int i = 0;
        while(i < numeros.length){
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
            i++;
        }

        System.out.println("\nRecorrido con STREAM: ");
        Arrays.stream(numeros).forEach(numero -> System.out.println("Elemento: " + numero));

        scanner.close();

    }
}
