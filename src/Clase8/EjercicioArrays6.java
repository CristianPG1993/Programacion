package Clase8;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrays6 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){

            System.out.println("Introduce el nombre " + (i + 1) + ": ");
            nombres.add(scanner.nextLine());

        }

        for (String nombre : nombres){

            System.out.println("Nombre: " + nombre);

        }
        scanner.close();
    }
}
