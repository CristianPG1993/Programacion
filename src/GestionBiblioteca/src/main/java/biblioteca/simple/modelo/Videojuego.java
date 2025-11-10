package GestionBiblioteca.src.main.java.biblioteca.simple.modelo;

import GestionBiblioteca.src.main.java.biblioteca.simple.contratos.Prestable;

public class Videojuego extends Producto implements Prestable {

    protected String plataforma;
    protected String genero;
    private boolean prestado;
    private Usuario prestadoA;

    //Constructor para recibir los datos de la BBDD
    public Videojuego(int id, String titulo, String anio, Formato formato, String plataforma, String genero) {
        super(id, titulo, anio, formato);
        this.plataforma = plataforma;
        this.genero = genero;
    }

    //Constructor para crear nuevos productos desde la app


    public Videojuego(String titulo, String anio, Formato formato, String plataforma, String genero) {
        super(titulo, anio, formato);
        this.plataforma = plataforma;
        this.genero = genero;
    }

    public String getPlataforma(){
        return plataforma;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "plataforma='" + plataforma + '\'' +
                ", genero='" + genero + '\'' +
                ", id=" + id +
                ", anio='" + anio + '\'' +
                ", titulo='" + titulo + '\'' +
                ", formato=" + formato +
                '}';
    }

    @Override
    public void prestar(Usuario u) {
        if (prestado) throw new IllegalStateException("Ya prestado.");
        prestado = true;
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
}
