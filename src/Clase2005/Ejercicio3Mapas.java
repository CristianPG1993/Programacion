package Clase2005;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3Mapas {

    public static void main(String[] args) {

        TreeMap<Integer, String> colores = new TreeMap<>();

        colores.put(1, "Blanco");
        colores.put(2, "Gris");
        colores.put(3,"azul");
        colores.put(4,"amarillo");

        for(Map.Entry<Integer, String> entrada : colores.entrySet()){

            System.out.println(entrada.getKey() + " = " + entrada.getValue());

        }

        System.out.println();

        colores.remove(2);

        for(Map.Entry<Integer, String> entrada : colores.entrySet()){

            System.out.println(entrada.getKey() + " = " + entrada.getValue());

        }
    }
}
