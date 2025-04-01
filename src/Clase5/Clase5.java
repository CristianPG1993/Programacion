package Clase5;
import java.util.Scanner; //Importamos Scanner para introducir datos

public class Clase5 {
    public static void main(String[] args) {


        //Ejercicio 1. Números positivos y negativos
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Introduce un número: ");
//        int numero = scanner.nextInt(); //Lee el número del usuario
//
//
//
//        //Estructura del if-else
//
//        if (numero > 0 ) {
//            System.out.println("El número " + numero + " es positivo.");
//        } else if (numero < 0) {
//            System.out.println("El número " + numero + " es negativo.");
//        } else {
//            System.out.println(" El número es 0. ");
//        }
//        scanner.close();

        //Ejercicio 2. Menú interactivo con Switch


//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("* Menú de opciones * ");
//        System.out.println("1. Saludar");
//        System.out.println("2. Mensaje motivacional");
//        System.out.println("3. Salir");
//
//
//        System.out.println("Selecciona una opción: ");
//        int opcion = scanner2.nextInt();
//
//        switch (opcion){
//            case 1:
//                System.out.println("Hola, Bienvenido");
//                break;
//            case 2:
//                System.out.println("Tu puedes con ello.");
//                break;
//            case 3:
//                System.out.println("Hasta luego Lucas!");
//                break;
//            default:
//                System.out.println("Opción no válida. Inténtalo de nuevo.");
//        }
//        scanner2.close();


//        // Ejercicio 3. Utilizar for para los primeros 10 números
//        // Usar un bucle para Contar del 1 al 10
//
//        for (int i=1; i<=10;i++){
//            System.out.println("Número: " + i);
//        }

//        //Ejercicio 4. while para contar hasta que el usuario ingrese 0
//
//        Scanner scanner4 = new Scanner(System.in);
//        int numero;
//        System.out.println("Introduce un número y pon 0 para salir: ");
//        numero = scanner4.nextInt();
//
//        while(numero != 0) {
//            System.out.println("Has introducido: " + numero);
//            System.out.println("Introduce otro número.");
//            numero = scanner4.nextInt();
//
//        }
//        System.out.println("Programa finalizado. ");
//        scanner4.close();

          //Ejercicio 5. Pide contraseña y que el usuario no pueda entrar hasta que ponga java123

          Scanner scanner = new Scanner(System.in);
          String password;

          //Bucle do - while

          do {
              System.out.println("Introduce tu contraseña: ");
              password = scanner.nextLine();
          }while (!password.equals("java123"));

        System.out.println("Acceso concedido");
        scanner.close();

   }
}
