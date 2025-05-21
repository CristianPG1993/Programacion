package Clase1305;

public class ClaseMatrices {
    public static void main(String[] args) {

        int [][] matriz1 = new int[3][4];

        int [][] matriz2 = {
                {1,2,3},
                {5,6,7},
                {9,10,11},
                {4,5,7}
        };

        System.out.println("Número de filas: " + matriz2.length);
        System.out.println("Número de columnas: " + matriz2[1].length);

        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[i].length; j++) {

                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nMatriz con FOR EACH: ");
        for (int[] fila : matriz2){
            for(int valor : fila){

                System.out.print(valor + " ");

            }
            System.out.println();
        }

    }
}
