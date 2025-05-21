package Clase8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrayList9 {

    public static void main(String[] args) {

        int [] numeros = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){

            System.out.println("Introduce el numero " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();

        }

        System.out.println("El array tiene estos numeros: " + Arrays.toString(numeros));

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++){

            listaNumeros.add(numeros[i]);


        }

        System.out.println("Lista de numeros: " + listaNumeros);




    }
}
