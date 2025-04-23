package Clase8;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays5 {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){

            System.out.println("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

        }

        System.out.println("Los numeros del array son:" + Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println("Los numeros del array ordenados de menor a mayor son: "
        + Arrays.toString(numeros));






    }
}
