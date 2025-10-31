package GestionBiblioteca.src.main.java.biblioteca.simple.servicios;

import GestionBiblioteca.src.main.java.biblioteca.simple.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private final List<Producto> productos = new ArrayList<>();

    public void alta (Producto p){

        productos.add(p);

    }

    public List<Producto> listar(){return new ArrayList<>(productos);}


    public List<Producto> buscar(String titulo){

        List<Producto> res = new ArrayList<>();

        for (Producto p : productos) {
            if (p.getTitulo().toLowerCase().contains(titulo.toLowerCase())) res.add(p);
        }
        return res;
    }

    public List<Producto> buscar(int anio){

        List<Producto> res = new ArrayList<>();

        for (Producto p : productos) {
            if ( Integer.parseInt(p.getAnio()) == anio) res.add(p);
        }

        return res;
    }
}
