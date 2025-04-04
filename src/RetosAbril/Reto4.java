package RetosAbril;
import java.util.Scanner;


public class Reto4 {
    public static void main(String[] args) {

//        Un resplandor y hace ¡BOOM! y digo, ains ya está aquí la guerra
//        Como dice la señora del famoso meme (link), un día estalló la guerra. Haz un programa que, dado un número que se pasa por entrada, haga una cuenta atrás y acabe con un ¡BOOM!.
//
//        Ejemplo de entrada:
//        -----------------------------
//                5
//
//        Ejemplo de salida:
//        -----------------------------
//                5
//        4
//        3
//        2
//        1
//        ¡BOOM!

        //Pedimos al usuario un número entero y guardamos el número en una variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int numero = scanner.nextInt();

        //Iniciamos el bucle for para realizar la cuenta atrás
        for(int i = numero; i > 0; i--){

            System.out.println("La bomba explotará en: " + i);

            }

        System.out.println("¡BOOOM!");
        System.out.println("Fin del programa!");
        scanner.close();
        }

}
