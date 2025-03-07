package Clase2;

public class MainClase2 {
    public static void main(String[] args) {
        //DECLARAS UNA CONSTANTE CON LA PALABRA FINAL
        final double PI = 3.1416;
        final  int mayoriaEdad = 18;


        System.out.println("El valor de PI es: " + PI );
        System.out.println("Mayoría de edad: " + mayoriaEdad);


        int numero1 = 5;
        int numero2 = 10;

        int suma = numero1 + numero2;
        int resta = numero2 - numero1;

        numero1 = 9;
        int division = numero2 / numero1;
        int multiplicacion = numero2 * numero1;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("División: " + division);
        System.out.println("Multiplicación: " + multiplicacion);




        //OPERADORES RELACIONALES

        int x = 10;
        int y = 20;

        System.out.println("¿Es x igual a y?: " + (x==y));
        System.out.println("¿Es x diferente a y?: " + (x!=y));
        System.out.println("¿Es x mayor que y?: " + (x>y));
        System.out.println("¿Es x menor que y?: " + (x<y));


        //OPERADORES LÓGICOS= COMBINAN EXPRESIONES LÓGICAS

        boolean a = true;
        boolean b = false;

        System.out.println("a AND b: " + (a && b)); //Y
        System.out.println("a OR b: " + (a || b)); // O
        System.out.println("NOT a: " + (!a));
        System.out.println("NOT b:" + (!b));
        System.out.println();


        //EXPRESIONES Y/O EVALUACIONES

        int resultado = (10 + 5) * 2/3;
        int resultado2 = 10 + 5 * 2 / 3;
        System.out.println("El resultado de la expresión 1 es: " + resultado);
        System.out.println("El resultado de la expresión 2 es: " + resultado2);

    }
}
