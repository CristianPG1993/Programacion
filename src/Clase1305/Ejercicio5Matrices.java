package Clase1305;

import java.util.Random;

public class Ejercicio5Matrices {

    public static void main(String[] args) {

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        Random random = new Random();

        System.out.println("Matriz 1: ");
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){

                matriz1[i][j] = random.nextInt(1,10);
                System.out.print(matriz1[i][j] + "\t");

            }
            System.out.println();
        }

        System.out.println("Matriz 2: ");
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){

                matriz2[i][j] = random.nextInt(1,10);
                System.out.print(matriz2[i][j] + "\t");

            }
            System.out.println();
        }

        int [][] matrizMultiplicada = new int[2][2];

        System.out.println("La matriz obtenida de la multiplicación de las dos matrices es:");
        for(int i = 0; i < matrizMultiplicada.length; i++){
            for(int j = 0; j < matrizMultiplicada[i].length;j++){

                matrizMultiplicada[i][j] = matriz1[i][j]*matriz2[i][j];
                System.out.print(matrizMultiplicada[i][j] + "\t");

            }
            System.out.println();
        }


    }
}
