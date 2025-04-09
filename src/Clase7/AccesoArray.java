package Clase7;

import java.util.Scanner;

public class AccesoArray {

    public static void main(String[] args) {

        String [] frutas = {"Manzanas", "Bananas", "Naranja"};
        Scanner scanner = new Scanner(System.in);


        try{

        System.out.println("Introduce un número entre 0 y 2: ");
        int posicion = scanner.nextInt();


        System.out.println("Has elegido la fruta: " + frutas[posicion]);

        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Debes introducir un número entre 0 y 2. ");
        } finally {
            System.out.println("Programa finalizado!");
        }

        scanner.close();
    }

}
