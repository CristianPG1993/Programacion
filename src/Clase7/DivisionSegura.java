package Clase7;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisionSegura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {

            System.out.println("Introduce el dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.println("Introduce el divisor: ");
            int divisor = scanner.nextInt();

            int division = dividendo /divisor;

            System.out.println("Resultado: " + division);

        } catch (ArithmeticException e) {

            System.out.println("El divisor no puede ser 0.");

        } catch (InputMismatchException e){

            System.out.println("Debes introducir un número para realizar la división." );
        } finally {
            System.out.println("Programa finalizado!");
        }



        scanner.close();
    }
}
