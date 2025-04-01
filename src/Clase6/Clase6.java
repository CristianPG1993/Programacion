package Clase6;

import java.util.Scanner;

public class Clase6 {

    public static void main(String[] args) {
//        Ejercicio 1. Salir de un bucle while con break.
//        Pedir al usuario números enteros positivos.El programa
//        debe terminar cuando el usuario introduzca el número 0.

//        Scanner scanner = new Scanner(System.in);
//        int numero;
//
//        while (true){
//
//            System.out.println("Introduce un número positivo y pon 0 para salir: ");
//            numero = scanner.nextInt();
//
//        if(numero == 0){
//            //si es cero, se sale del bucle
//            break;
//        }
//            System.out.println("Has introducido: " + numero);
//
//        }
//
//        System.out.println("Programa finalizado!");
//
//        scanner.close();


//        Ejercicio 2. Saltarse los múltiplos de 3 con continue
//            Escribe un programa que muestre los números del 1 al 10 expecto los múltiplos
//            de 3.

//        for (int i = 0; i <= 10; i++ ){
//            if(i % 3 == 0){
//                continue;
//            }else {
//                System.out.println("El número " + i + " no es múltiplo de 3.");
//            }
//        }

//        Ejercicio 3. Finalizar un bucle for al encontrar un número concreto

//        for (int i = 0; i <= 20; i++){
//            if(i == 7){
//                System.out.println("Se ha encontrado el número " + i);
//                System.out.println("Programa finalizado!");
//                break;
//            }else {
//                System.out.println("El número encontrado es el " + i);
//            }
//        }

//        Ejercicio 4. Evitar mostras las vocales con continue.

        String palabra = "PROGRAMACION";

        for(int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);

            if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                continue;
            }
            System.out.println(letra);
        }



    }
}
