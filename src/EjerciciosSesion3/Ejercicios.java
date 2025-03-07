package EjerciciosSesion3;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {


        //1️⃣ Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla.

        final double GRAVEDAD = 9.81;

        System.out.println("La fuerza de la Gravedad tiene un valor de: " + GRAVEDAD + " m/s2.");

        // 2️⃣ Declara dos variables a = 25 y b = 7.
        // Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.

        int a = 25;
        int b = 7;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;


        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);


        //3️⃣ Declara una variable edad e imprime si la persona
        // es mayor de edad (>= 18) o menor de edad (< 18).


        int edad = 25;


        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }

        //4️⃣ Crea un programa que reciba dos números
        // y determine cuál es mayor, menor o si son iguales.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor: " + numero1 + " > " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El segundo número es mayor: " + numero1 + " < " + numero2);

        } else {
            System.out.println("Los números son iguales: " + numero1 + " = " + numero2);
        }


        // 5️⃣ Escribe un programa que evalúe
        // la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?


        System.out.println("Resultado expresión lógica: " + ((5 > 3) && (10 < 20)));

        //6️⃣ Modifica el programa anterior
        // y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenidos.

        System.out.println("Resultado expresión lógica: " + ((5 > 3) || (10 < 20)));
        // También devuelve TRUE porque el signo || significa que al menos una de las dos condiciones
        // sea verdadera.


        // 7️⃣ Declara tres variables
        // x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.

        int x = 10;
        int y = 20;
        int z = 30;


        System.out.println("¿La comparación " + x + " + " + y + " = " + z + " es correcta?: " + (x + y == z));

        // 8️⃣ Crea un programa que pida al usuario
        // dos números y evalúe si son múltiplos (num1 % num2 == 0).

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1 = scanner1.nextInt();

        System.out.println("Introdcue el segundo número: ");
        int num2 = scanner1.nextInt();


        if (num1 % num2 == 0) {

            System.out.println("Los números " + num1 + " y " + num2 + " son múltiplos.");

        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son múltiplos.");
        }


        // 9️⃣ Escribe un código
        // que reciba un número e indique si es par o impar usando el operador módulo (%).


        Scanner scanner9 = new Scanner(System.in);

        System.out.println("Introduce un número para comprobar si es par o impar: ");
        int num9 = scanner9.nextInt();


        if ( num9 % 2 == 0){
            System.out.println("El número " + num9 + "es par.");
        } else {
            System.out.println("El número " + num9 + " es impar.");
        }

        // 🔟 Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro).
        // Convierte una cantidad de dólares ingresada por el usuario a euros.

        final double tasaCambio = 1.12;


        Scanner scanner10 = new Scanner(System.in);

        System.out.println("Introduce los dólares para saber la conversión a euros: ");
        double dolares = scanner10.nextDouble();

        double euros = tasaCambio * dolares;


        System.out.println("$" + dolares + " son: " + euros + " €." );



    }



}
