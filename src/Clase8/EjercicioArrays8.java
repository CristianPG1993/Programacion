package Clase8;

import java.util.Arrays;

public class EjercicioArrays8 {

    public static void main(String[] args) {

//        8. Rotar elementos
//        Escribe un programa que rote los elementos de un array una posición hacia la derecha.
//        Ejemplo: {1, 2, 3, 4, 5} → {5, 1, 2, 3, 4}.

        int [] array = {1, 2, 3, 4, 5};

        int ultimo = array.length;

        for(int i = array.length - 1; i > 0; i--){

            array[i] = array[i - 1];

        }
        array[0] = ultimo;

        System.out.println(Arrays.toString(array));
    }
}
