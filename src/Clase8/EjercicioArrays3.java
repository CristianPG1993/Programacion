package Clase8;

import java.util.Scanner;

public class EjercicioArrays3 {

    public static void main(String[] args) {

        int [] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){

            System.out.println("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

        }

        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];

        for (int i = 0; i < numeros.length; i++){

            if(numeros[i] > numeroMayor){

                numeroMayor = numeros[i];

            }
        }

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] < numeroMenor){

                numeroMenor = numeros[i];

            }
        }

        System.out.println("El numero mayor del array es: " + numeroMayor);
        System.out.println("El numero menor del array es: " + numeroMenor);
        scanner.close();
    }
}
