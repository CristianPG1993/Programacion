package Clase3009.EDD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Proyecto {

    private String nombre;
    private Date fechaInicio;
    private int presupuesto;
    private ArrayList<Tarea> listaTarea;
    private Equipo equipo;

    public Proyecto(String nombre, Date fechaInicio, int presupuesto) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.presupuesto = presupuesto;
        this.listaTarea = new ArrayList<>();
        this.equipo = null;
    }

    public void anadirTarea(Tarea t){

        listaTarea.add(t);

    }

    public void anadirEquipo(Equipo e){

        this.equipo = e;
    }

    public List<Tarea> getListaTarea() {
        return Collections.unmodifiableList(listaTarea);
    }

    public void imprimirTareas(){

        for (Tarea t: listaTarea){

            System.out.println("Tarea: " + t);

        }

        System.out.println("---------------------------");
    }
}
