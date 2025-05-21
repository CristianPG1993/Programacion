package Clase1305;

import java.util.Random;

public class Ejercicio4Matrices {

    public static void main(String[] args) {

        int [][] matriz = new int[2][3];

        Random random = new Random();


        System.out.println("\nLa matriz rellena con números aleatorios es: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){

                matriz[i][j] = random.nextInt(1,100);
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println();
        }

        int[][] matrizTranspuesta = new int[3][2];

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {

                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nLa matriz traspuesta es:");
        for(int i = 0; i < matrizTranspuesta.length; i++){
            for(int j = 0; j < matrizTranspuesta[i].length; j++){

                System.out.print(matrizTranspuesta[i][j] + "\t");

            }

            System.out.println();

        }


    }
}
