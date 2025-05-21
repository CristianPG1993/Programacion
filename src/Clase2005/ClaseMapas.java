package Clase2005;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ClaseMapas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Crear un mapa y obtener la lista del mapa
        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Ana", 8.5);
        notas.put("Ana", 7.0);
        notas.put("Pepe", 6.0);
        notas.put("Juan", 4.5);


        for(Map.Entry<String, Double> entrada : notas.entrySet()){

            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }

        System.out.println("Hascode de Ana" + " = " + "Ana".hashCode());
        System.out.println("Hascode de Pepe" + " = " +"Pepe".hashCode());
        System.out.println("Hascode de Juan" + " = " +"Juan".hashCode());


        System.out.println("Introduce nombre: ");
        String nombre = scanner.nextLine();


        if(notas.containsKey(nombre)){

            System.out.println(nombre + " tiene una nota de: " + notas.get(nombre));

        }else{
            System.out.println("Estudiante no encontrado.");
        }
        //Datos ordenados con TreeMap
        TreeMap<String, Double> notasOrdenadas = new TreeMap<>(notas);

        for(Map.Entry<String, Double> entrada : notasOrdenadas.entrySet()){

            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }

        System.out.println("Suma = " + sumar(4,6));



        scanner.close();
    }

    public static int sumar(int n1, int n2){

        return n1 + n2;
    }


}
