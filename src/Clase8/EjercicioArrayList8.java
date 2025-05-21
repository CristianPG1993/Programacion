package Clase8;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList8 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){

            System.out.println("Introduce el nombre " + (i + 1) + ": ");
            nombres.add(scanner.nextLine().toLowerCase());


        }

        for (String nombre : nombres){

            System.out.println("Nombre: " + nombre);

        }

        System.out.println("¿De que nombre desea conocer la posicion en la lista?");
        String buscarNombre = scanner.nextLine().toLowerCase();

        int posicion = nombres.indexOf(buscarNombre); // busca la posición

        if (posicion != -1) {
            System.out.println("El nombre '" + buscarNombre + "' está en la posición " + posicion + " de la lista.");
        } else {
            System.out.println("El nombre '" + buscarNombre + "' no se encuentra en la lista.");
        }



        scanner.close();

    }

}
