package RetosAbril;

import java.util.Scanner;


public class Reto8 {

    public static void main(String[] args) {

//        Escribe un programa que le pregunte al usuario su nombre.
//        Si el nombre comienza con la letra "A" (mayúscula o minúscula),
//        el robot responderá con un saludo entusiasta como: ¡Hola, Asombroso/a "Nombre"!.
//        Si el nombre tiene más de 7 letras, el robot dirá: ¡Vaya, "Nombre", ¡qué nombre tan largo y sofisticado!.
//        Para cualquier otro nombre, el robot simplemente dirá: Saludos, "Nombre".
//        ¡Prepara al robot para to_do tipo de nombres! Como un saludo especial a un nombre que empiece por A y
//        tenga 7 letras, o que cuente un chiste si saluda a Jaimito...


        // Importamos la clase Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

// Pedimos al usuario que ingrese su nombre
        System.out.println("Bienvenido, terrícola, ¿Puedes decirme como te llamas?: ");
        String nombre = scanner.nextLine();  // Guardamos la entrada del usuario en la variable 'nombre'

// Empezamos el bloque try para manejar excepciones
        try {

            // Comprobamos si el nombre contiene solo letras (mayúsculas y minúsculas)
            if (!nombre.matches("[a-zA-Z]+")) {
                // Si contiene algo que no sea letra, lanzamos una excepción IllegalArgumentException
                throw new IllegalArgumentException();
            }

            // Si el nombre empieza con 'a' y tiene más de 7 letras, mostramos un saludo especial
            if ((nombre.toLowerCase().charAt(0) == 'a') && (nombre.length() > 7)) {
                System.out.println("Bienvenido, " + nombre + ". Ese nombre es excepcional, empieza por a y es muy largo!!");

                // Si el nombre empieza con 'a' pero no tiene más de 7 letras, mostramos otro saludo
            } else if (nombre.toLowerCase().charAt(0) == 'a') {
                System.out.println("Hola, Asombroso/a " + nombre);

                // Si el nombre tiene más de 7 letras, pero no empieza con 'a', damos otro saludo
            } else if (nombre.length() > 7) {
                System.out.println("¡Vaya, " + nombre + ", ¡qué nombre tan largo y sofisticado!");

                // Para cualquier otro nombre, simplemente saludamos normalmente
            } else {
                System.out.println("Saludos, " + nombre);
            }

// Si el nombre no contiene solo letras, se captura la excepción y mostramos un mensaje de error
        } catch (IllegalArgumentException e) {
            System.out.println("El nombre solo debe contener letras.");

        } finally {
            // Este bloque se ejecutará siempre, independientemente de si hubo una excepción o no
            System.out.println("Programa finalizado!");
        }

// Cerramos el scanner para liberar el recurso
        scanner.close();

    }
}
