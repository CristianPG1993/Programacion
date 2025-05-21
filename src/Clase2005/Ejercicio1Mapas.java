package Clase2005;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1Mapas {

    public static void main(String[] args) {

        HashMap<String, Integer> notas = new HashMap<>();

        notas.put("Juan", 9);
        notas.put("Pepe", 7);
        notas.put("Luis", 6);
        notas.put("Alberto", 3);
        notas.put("Paco", 9);

        for (Map.Entry<String, Integer> entrada : notas.entrySet()){

            System.out.println(entrada.getKey() + " = " + entrada.getValue());


        }
    }
}
