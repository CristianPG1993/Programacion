package Clase1305;

import java.util.Random;

public class Ejercicio2Matrices {

    public static void main(String[] args) {

        int [][] matriz = new int[4][4];

        Random random = new Random();


        System.out.println("\nLa matriz rellena con números aleatorios es: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){

                matriz[i][j] = random.nextInt(1,100);
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println();
        }


    }
}
