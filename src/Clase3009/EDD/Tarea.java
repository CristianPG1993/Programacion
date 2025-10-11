package Clase3009.EDD;

import java.util.ArrayList;

public class Tarea {

    public static enum  Estado{
        PENDIENTE, HACIENDO, HECHA
    }

    private String titulo;
    private int horasEstimadas;
    private Estado estado;
    private ArrayList<Tarea> listaSubtareas;
    private Tarea padre;


    public Tarea(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.estado = Estado.PENDIENTE;
        this.listaSubtareas = new ArrayList<Tarea>();
        this.padre = null;
    }

    public void actualizarEstadoPendiente(){

        this.estado = Estado.PENDIENTE;


    }

    public void actualizarEstadoHaciendo(){

        this.estado = Estado.HACIENDO;


    }
    public void actualizarEstadoHecha(){

        this.estado = Estado.HECHA;
    }

    public void anadirSubtarea(Tarea subtarea){

        /*
            Tarea.listaSubtareas <---- subtarea
            Subtarea.padre <------???
         */

        if (listaSubtareas.contains(subtarea))
            throw new IllegalArgumentException("La tarea ya existe");

        listaSubtareas.add(subtarea);

        subtarea.padre = this;


    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getEstado() {
        switch (estado){

            case PENDIENTE -> {
                return "Pendiente";
            }
            case HACIENDO -> {
                return "Haciendo";
            }
            case HECHA -> {
                return "Hecha";

            }

        }
        return "Estado desconocido";

    }

    public ArrayList<Tarea> getListaSubtareas() {
        return listaSubtareas;
    }

    public Tarea getPadre() {
        return padre;
    }
}
