package Clase8;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrays7 {

    public static void main(String[] args) {

        ArrayList<String> tareas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++){

            System.out.println("Escribe la tarea a realizar: ");
            tareas.add(scanner.nextLine().toLowerCase());

        }

        System.out.println("Las tareas a realizar son: ");
        for (String tarea : tareas){

            System.out.println("Tarea: " + tarea);
        }

        System.out.println("Tarea que desea eliminar: ");
        String eliminarTarea = scanner.nextLine().toLowerCase();

        if(tareas.contains(eliminarTarea)){

            tareas.remove(eliminarTarea);
            System.out.println("La tarea " + eliminarTarea + " ha sido eliminada con exito.");

        } else {

            System.out.println("No se ha encontrado la tarea que desea eliminar. ");
        }


        System.out.println("Las tareas a realizar son: ");
        for (String tarea : tareas){

            System.out.println("Tarea: " + tarea);

        }

        scanner.close();
    }
}
