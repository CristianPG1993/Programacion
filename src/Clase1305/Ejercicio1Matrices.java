package Clase1305;

public class Ejercicio1Matrices {
    public static void main(String[] args) {

        int [][] matriz1 = {{2,4,5}, {5,7,6}, {9,2,4}};
        int [][] matriz2 = {{4,3,2}, {7,6,4},{9,2,3}};

        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){


                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz 2: ");
        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){


                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nLa suma de las matrices es: ");
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){

                System.out.print(matriz1[i][j] + matriz2[i][j] + " ");

            }
            System.out.println();
        }




    }
}
