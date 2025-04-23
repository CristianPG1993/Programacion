package Clase8;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[5];
        int total = 0;

        for (int i = 0; i < numeros.length; i++){

            System.out.println("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

        }

        for (int numero : numeros){

            total += numero;

        }

        System.out.println("\nLa suma de todos los numeros con FOR-EACH es: " + total);

        int sumastream = 0;
        sumastream = Arrays.stream(numeros).sum();

        System.out.println("\nLa suma de todos los numeros con Stream es: " + sumastream);
    }
}
