package Clase7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Clase7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número mayor que 5: ");
            int numero = scanner.nextInt();

            if (numero < 5) {
                System.out.println(numero + " Es menor que 5.");
            } else {
                System.out.println("Número correcto.");
            }

        } catch (Exception e) {
            System.out.println("Dato ingresado no válido.");
        }finally {
            scanner.close();
            System.out.println("Programa finalizado!");
        }
    }
}
