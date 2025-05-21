package Clase2005;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2Mapas {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("Francia", "París");
        capitales.put("España  ", "Madrid");
        capitales.put("Portugal", "Oporto");
        capitales.put("Suiza", "Berna");
        capitales.put("Inglaterra", "Londres");

        System.out.println("Introduce un país: ");
        String pais = scanner.nextLine();


        if(capitales.containsKey(pais)){

            System.out.println("La capital de " + pais + " es: " + capitales.get(pais));
        }else{

            System.out.println(pais + " no se encuentra en la lista.");
        }

        scanner.close();
    }
}
