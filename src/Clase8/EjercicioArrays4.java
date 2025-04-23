package Clase8;

import java.util.Scanner;

public class EjercicioArrays4 {

    public static void main(String[] args) {

        int [] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){

            System.out.println("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

        }

        System.out.println("Introduce el numero que desea buscar: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++){

            if (numeroBuscado == numeros[i]){
                encontrado = true;

                System.out.println("El numero " + numeroBuscado + " se encuentra en la posición " + (i +1));
                break;

            }
        }
        if(!encontrado){

            System.out.println("El numero " + numeroBuscado + " no se encuentra en el array.");

        }
        scanner.close();

    }
}
