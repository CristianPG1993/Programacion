package Clase8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EjercicioArrays10 {

    public static void main(String[] args) {

//        10. Frecuencia de elementos
//        Dado un array de enteros, muestra cuántas veces se repite cada valor.
//        Ejemplo: {1, 2, 2, 3, 1, 1} →
//        1 aparece 3 veces
//        2 aparece 2 veces
//        3 aparece 1 vez


        // Declaramos el array original con posibles números repetidos
        int[] array = {1, 2, 2, 3, 1, 1};

        System.out.println("Array original: " + Arrays.toString(array));

        // Creamos un HashMap para contar las apariciones de cada número
        HashMap<Integer, Integer> frecuencias = new HashMap<>();

        // Recorremos el array
        for (int num : array) {
            if (frecuencias.containsKey(num)) {
                // Si el número ya está en el mapa, aumentamos su contador en 1
                frecuencias.put(num, frecuencias.get(num) + 1);
            } else {
                // Si es la primera vez que aparece, lo añadimos con valor 1
                frecuencias.put(num, 1);
            }
        }

        // Mostramos los resultados
        System.out.println("\nFrecuencia de cada número:");
        for (Map.Entry<Integer, Integer> entry : frecuencias.entrySet()) {
            System.out.println(entry.getKey() + " aparece " + entry.getValue() + " veces");
        }

    }
}
