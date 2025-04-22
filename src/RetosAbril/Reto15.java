package RetosAbril;

import java.util.Scanner;

public class Reto15 {

//    Resulta que nos piden que programemos un validador de contraseñas.
//    Algo fácil para los alumnos de Prometeo. Solo tenemos que decir si,
//    una contraseña introducida por terminal es válida o no.
//    Para que una contraseña sea válida debe:
//    Tener al menos 8 caracteres.
//    Tener al menos una letra minúscula.
//    Tener al menos una letra mayúscula.
//    Tener al menos un número.
//    Tener al menos un símbolo especial  de entre los siguientes *, ?, !, ^, “, $.
//    No contener la palabra GIT, en ningún formato
//    (ni GIT, ni git, ni gIt, ni giT, ni Git, ni GIt, ni gIT, ni GiT). Odiamos Git.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedimos la contraseña al usuario
        System.out.print("Introduce tu contraseña para validarla: ");
        String contraseña = scanner.nextLine();

        // Comprobamos si tiene al menos 8 caracteres
        boolean longitudValida = contraseña.length() >= 8;

        // Comprobamos si contiene al menos una minúscula
        boolean tieneMinuscula = contraseña.matches(".*[a-z].*");

        // Comprobamos si contiene al menos una mayúscula
        boolean tieneMayuscula = contraseña.matches(".*[A-Z].*");

        // Comprobamos si contiene al menos un número
        boolean tieneNumero = contraseña.matches(".*[0-9].*");

        // Comprobamos si contiene al menos un símbolo especial permitido
        boolean tieneSimbolo = contraseña.matches(".*[\\*\\?\\!\\^\\\"\\$].*");

        // Comprobamos que NO contenga "git" en ningún formato
        boolean noContieneGit = !contraseña.toLowerCase().contains("git");

        // Evaluamos si cumple todos los criterios
        if (longitudValida && tieneMinuscula && tieneMayuscula && tieneNumero && tieneSimbolo && noContieneGit) {
            System.out.println("✅ ¡Contraseña válida!");
        } else {
            System.out.println("❌ Contraseña inválida. Motivos:");

            if (!longitudValida)
                System.out.println("- Debe tener al menos 8 caracteres.");
            if (!tieneMinuscula)
                System.out.println("- Debe contener al menos una letra minúscula.");
            if (!tieneMayuscula)
                System.out.println("- Debe contener al menos una letra mayúscula.");
            if (!tieneNumero)
                System.out.println("- Debe contener al menos un número.");
            if (!tieneSimbolo)
                System.out.println("- Debe contener al menos un símbolo especial: *, ?, !, ^, \", $");
            if (!noContieneGit)
                System.out.println("- No debe contener la palabra GIT en ningún formato.");
        }

        scanner.close();
    }

}
