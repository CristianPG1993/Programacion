package Clase3009.EDD;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Empleado> listaEmpleados;

    public Equipo(String nombre){

        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();

    }

    public void agregarEmpleado(Empleado e){

        listaEmpleados.add(e);

    }

}
