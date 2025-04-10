package RetosAbril;

import java.util.Scanner;


public class reto9 {

    public static void main(String[] args) {

//        Los alumnos de Prometeo que cursan DAM/DAW + Master andan muy liados
//        y no tienen claro cuando tienen clase y cuando no.
//        Haz un programa que les indique si tienen clase de FP, de Máster,
//        o de las dos en un conjunto de fechas dado. El usuario introduce un número N,
//        que indica el número de días que quiere ver, se deberá imprimir el número del día,
//        si no tienen nada en esa fecha, FP si tiene clase de un módulo de DAM/DAW o Máster
//        si ese día tiene clase de máster.
//        Los días múltiplos de 3 tienen clase de FP.
//        Los días múltiplos de 5, de máster.
//        Los días que son múltiplos de 3 y 5 tienen clase de las dos.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al calendario de Prometeo.\nIntroduce el número de días que " +
                "quieres comprobar: ");
        int dias = scanner.nextInt();


        for (int i = 0; i < dias; i++){

            if ((i % 5 == 0) && (i % 3 == 0)){

                System.out.println("Día " + (i + 1) + ": FP + Máster.");

            } else if (i % 5 == 0) {

                System.out.println("Día " + (i + 1) + ": Máster.");


            }else if (i % 3 == 0){

                System.out.println("Día " + (i + 1) + ": FP");

            }else {
                System.out.println("Día " + (i + 1) + ": Juego libre." );
            }
        }

        scanner.close();


    }
}
