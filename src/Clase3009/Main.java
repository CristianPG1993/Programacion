package Clase3009;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        System.out.println("Inicio de demo NovaSoft");

        Proyecto quimera = new Proyecto("Chimera", new Date(), 100000);
        Tarea backend = new Tarea("DesarrolloBackend", 1000);
        Tarea api =  new Tarea("Desarrollar Api", 300);
        quimera.anadirTarea(backend);;
        backend.anadirSubtarea(api);

        System.out.println("La tarea " +  api.getTitulo() +
                " es hija de " + api.getPadre().getTitulo() + " y tiene el estado " + api.getEstado());


    }
}
