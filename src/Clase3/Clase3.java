package Clase3;

public class Clase3 {

    public static void main(String[] args) {

        //1. Conversión implícita de int a double

        int numeroEntero = 25;
        double numeroDecimal = numeroEntero;

        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Numero convertido a un double: " + numeroDecimal);


        //2. Conversión explícita double a int con truncamiento

        double valorDecimal = 8.80;
        //conversión explicita de double a int

        int valorEntero = (int) valorDecimal;

        System.out.println("Valor original, double: " + valorDecimal);
        System.out.println("Valor convertido con el int: " + valorEntero);


        //3. Desbordamiento. Int a Byte

        int numeroGrande = 130;
        //COnversión explicita a byte
        byte numeroPequeño = (byte) numeroGrande;

        System.out.println("Número original: " + numeroGrande);
        System.out.println("Número convertido a byte: " + numeroPequeño);

        //4. Conversion de String a int con integer.parseInt()

        String texto = "123";
        int numero = Integer.parseInt(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Número convertido: " + numero);

        //Haz el cambio al revés


        //5. Convertir un int a String

        int numerito = 456;
        String textito = String.valueOf(numerito);

        System.out.println("Valor de numerito: " + numerito);
        System.out.println("Valor convertido a texto: " + textito);

        //6. Conversion double a String

        double precio = 99.99;
        String textoPrecio = Double.toString(precio);
        System.out.println("Precio como String: " + textoPrecio);

        //7. COnversión boolean a String

        boolean activo = true;
        //conversión a String
        String estado = String.valueOf(activo);
        System.out.println("Estado convertido: " + estado);

        //8. Conversión para operaciones matemáticas

        int a = 5, b = 2;
        System.out.println("División entera: " + (a/b));

        //Conversión a double para tener decimales

        double resultado = (double)a/b;

        System.out.println("Double con casting: " + resultado);

        //9. Conversión de long a int y de float a int

        long numeroLargo = 1000000000L;

        //Convertir de Long a int
        int numeroEnterito = (int)numeroLargo;
        System.out.println("Numero con cambio de Long a int:" + numeroEnterito);

        //Declaramos un número float con decimales

        float numeroDecimalito = 9.99f;

        //Convertimos float a int

        int numeroSinDecimal = (int)numeroDecimalito;

        System.out.println("Número original (float): " + numeroDecimalito);
        System.out.println("Número convertido a int de float: " + numeroSinDecimal);








    }


}
