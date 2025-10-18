package GestionBiblioteca.src.main.java.biblioteca.simple.modelo;

import GestionBiblioteca.src.main.java.biblioteca.simple.contratos.Prestable;

public class Libro extends Producto implements Prestable {

    private String ISBN;
    private String autor;
    private boolean prestado;
    private Usuario prestadoA;

    //Constructor para recibir objeto en la BBDD
    public Libro(int id, String titulo, String anio, Formato formato, String ISBN, String autor) {
        super(id, titulo, anio, formato);
        this.ISBN = ISBN;
        this.autor = autor;
    }

    //Constructor para crear nuevos productos desde la app
    public Libro(String titulo, String anio, Formato formato, String ISBN, String autor) {
        super(titulo, anio, formato);
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", autor='" + autor + '\'' +
                ", id=" + id +
                ", anio='" + anio + '\'' +
                ", titulo='" + titulo + '\'' +
                ", formato=" + formato +
                '}';
    }

    @Override
    public void prestar(Usuario u) {

        if (prestado) throw new IllegalStateException("Ya prestado");
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
}
