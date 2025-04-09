package Clase7;

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumeroAleatorio {

    public static void main(String[] args) {

        Random random = new Random();
        int secreto = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);

        try {


            System.out.print("Adivina el número (1-10): ");
            String intentoTexto = scanner.nextLine();

            int intento = Integer.parseInt(intentoTexto);

            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            }
        } catch (NumberFormatException e){

            System.out.println("El dato introducido deber ser un número.");

        }finally {

            System.out.println("Juego finalizado!");

        }


        scanner.close();


    }
}
