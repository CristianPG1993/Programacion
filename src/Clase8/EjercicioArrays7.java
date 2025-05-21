package Clase8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EjercicioArrays7 {

    public static void main(String[] args) {

//        7. Copiar sin duplicados
//        Dado un array con posibles números repetidos, crea un nuevo array que contenga los
//        mismos elementos sin duplicados.
//        Ejemplo: {1, 2, 2, 3, 4, 4, 5} → {1, 2, 3, 4, 5}.


        int[] array = {1, 2, 2, 3, 3, 4, 4, 5, 5, 3, 3, 3, 2};

        System.out.println("Lista con números duplicados: " + Arrays.toString(array));

        HashSet<Integer> arraySinDuplicados = new HashSet<>();

        for (int numero : array) {
            arraySinDuplicados.add(numero);
        }

        int[] arrayNuevo = new int[arraySinDuplicados.size()];
        int i = 0;
        for (int numero : arraySinDuplicados) {

            arrayNuevo[i++] = numero;
        }
        System.out.println("Array sin duplicados: " + Arrays.toString(arrayNuevo));

    }
}
