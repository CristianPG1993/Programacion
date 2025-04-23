package Clase8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EjercicioArrays10 {

    public static void main(String[] args) {

        // Creamos una ArrayList con números enteros, incluyendo varios duplicados
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(
                1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 7, 7, 7, 8, 5, 43, 3, 3, 4, 5
        ));

        // Mostramos la lista original, que contiene elementos repetidos
        System.out.println("Lista con duplicados: " + numeros);

        // Creamos un conjunto (Set) a partir de la lista original
        // El Set elimina automáticamente los elementos duplicados
        Set<Integer> conjuntoDuplicados = new HashSet<>(numeros);

        // Mostramos el conjunto, que ya no contiene elementos duplicados
        System.out.println("Lista sin duplicados: " + conjuntoDuplicados);


    }
}
