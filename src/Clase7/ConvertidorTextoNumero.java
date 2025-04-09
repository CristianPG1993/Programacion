package Clase7;

import java.util.Scanner;

public class ConvertidorTextoNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Escribe un número (en texto): ");
            String texto = scanner.nextLine();

            int numero = Integer.parseInt(texto);
            System.out.println(numero + " x 10: " + (numero * 10));

        } catch (NumberFormatException e){

            System.out.println("Debes introducir un número.");
        } finally {
            System.out.println("Programa finalizado!");
        }

        scanner.close();
    }


}
