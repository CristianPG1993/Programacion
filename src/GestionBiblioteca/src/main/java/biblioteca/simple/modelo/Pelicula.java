package GestionBiblioteca.src.main.java.biblioteca.simple.modelo;

import GestionBiblioteca.src.main.java.biblioteca.simple.contratos.Prestable;

public class Pelicula extends Producto implements Prestable {

    private String director;
    private int duracion;
    private boolean prestado;
    private Usuario prestadoA;


    //Constructor para añadir objeto en la BBDD
    public Pelicula(int id, String titulo, String anio, Formato formato, String director, int duracion){

        super(id, titulo, anio, formato);
        this.director = director;
        this.duracion = duracion;
    }


    //Constructor para crear el producto desde la app
    public Pelicula(String titulo, String anio, Formato formato, String director, int duracion) {
        super(titulo, anio, formato);
        this.director = director;
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public void prestar(Usuario u) {

        if(prestado) throw new IllegalStateException("Ya prestado");
        this.prestado = true;
        this.prestadoA = u;

    }

    @Override
    public void devolver() {

        this.prestado = false;
        this.prestadoA = null;

    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", duracion=" + duracion +
                ", id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anio='" + anio + '\'' +
                ", formato=" + formato +
                '}';
    }



}
