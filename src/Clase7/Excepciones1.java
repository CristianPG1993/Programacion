package Clase7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 2){

        System.out.println("1. Saludar\n2.Salir");

        System.out.println("Elige una opción(Poner 2 para salir del programa): ");


        try{
            opcion = scanner.nextInt();
            int resultado = 5 /opcion; // al introducir un valor y genera una excepción se procesa más del try


            switch (opcion) {

                case 1 -> {
                    System.out.println("Hola.");
                    System.out.println("Hola.");
                }
                case 2 -> {
                    System.out.println("Has pulsado salir!\nQue tengas buen día!");
                }

                default -> System.out.println("Opción incorrecta.\n Seleccionar el número 2 para salir del programa");
            }
        } catch (InputMismatchException e) {

            System.out.println("Tienes que introducir un número. ");

        } catch (ArithmeticException e){

            System.out.println("No puedes dividir por 0. ");

        } finally {

            System.out.println("Fin!");

        }
        }
        scanner.close();
        }


}
