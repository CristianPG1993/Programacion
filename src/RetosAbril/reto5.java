package RetosAbril;

import java.util.Scanner;

public class reto5 {

    public static void main(String[] args) {


//        Jordi nunca se acuerda de abrir las exclamaciones.
//        Él dice que es porque en catalán no se abren las exclamaciones,
//        pero yo creo que simplemente no sabe escribir.
//        Vamos a crear un programa que asegure que hay tantos abrir exclamación (¡)
//        como cerrar exclamación (!) para flamearlo.
//
//        Ejemplo
//        Entrada = ¡¡¡Caramba!!! Hola!
//        Salida = Si No


        // Creamos el objeto Scanner para leer la frase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();  // Leemos la frase completa con espacios y símbolos

        // Declaramos los caracteres que vamos a buscar
        char exclamacionAbierta = '¡';
        char exclamacionCerrada = '!';

        // Inicializamos contadores para cada tipo de exclamación
        int contadorAbiertas = 0;
        int contadorCerradas = 0;

        // Recorremos cada carácter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i); // Obtenemos el carácter actual

            // Si es exclamación de apertura, sumamos al contador
            if (letra == exclamacionAbierta) {
                contadorAbiertas++;
            }
            // Si es exclamación de cierre, sumamos al otro contador
            else if (letra == exclamacionCerrada) {
                contadorCerradas++;
            }
        }

        // Comprobamos si están balanceadas las exclamaciones
        if (contadorAbiertas == contadorCerradas) {
            System.out.println("Eres un pro de la gramática.");
        } else {
            System.out.println("Te faltan exclamaciones en la frase.\nVete a estudiar la RAE!!");
        }

        // Cerramos el Scanner
        scanner.close();

    }
}
