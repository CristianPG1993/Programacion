package Clase8;

import java.util.Arrays;

public class EjercicioArrays6 {

    public static void main(String[] args) {

//        6. Invertir un array
//        Crea un programa que invierta los elementos de un array.
//        Por ejemplo, si el array es {1,2, 3, 4, 5},
//        el resultado debe ser {5, 4, 3, 2, 1}.

        int [] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(array));

        for (int i = 0, j = array.length - 1; i  < j; i++, j--){

            int temp = 0;
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;

        }

        System.out.println("Array invertido: " + Arrays.toString(array));



    }
}
