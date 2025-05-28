package Clase2705;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        String name = "Ana";
//        String name2 = "Luis";
//        saludar();
//        saludar(name);
//        System.out.println(saluda2(name2));
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce un numero:");
        int num2 = scanner.nextInt();

        System.out.println("La suma de los números es: " + sumar(num1,num2));
        System.out.println(sumar(2,3,4,5,6,7,4));

//       if(esPar(num2)){
//           System.out.println("El número es par");
//       }else{
//           System.out.println("EL número no es par");
//       }
//
//       System.out.println(!esPar(num2) ? "No es par" : "Es par");

        int[] numeros = {1,2,3,6,42,1};

        System.out.println("La media es : " + String.format("%.2f", calcularMedia(numeros)));

    }

    //1.Imprimir algo por pantalla

    public static void saludar(){

        System.out.println("Hola");
    }

    public static void saludar(String nombre){

        System.out.println("Hola " + nombre + "!");
    }

    public static String saluda2(String nombre){

        return ("Hola, " + nombre + "!");
    }

    public static int sumar(int a,int b){

        return a + b;

    }

    public static int sumar(int ...numeros){

        int suma = 0;

        for(int n : numeros){
            suma += n;
        }
        return suma;
    }

    public static boolean esPar(int n1){

        if(n1%2 == 0){
            return true;

        }else {
            return false;
        }
    }

    public static double calcularMedia(int[] numeros){

        int suma = 0;

        for (int n : numeros){

            suma += n;

        }

        return (double) (suma / numeros.length);
    }


}
