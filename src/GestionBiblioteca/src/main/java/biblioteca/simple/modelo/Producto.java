package GestionBiblioteca.src.main.java.biblioteca.simple.modelo;

public abstract class Producto {

    protected int id;
    protected String titulo;
    protected String anio;
    protected Formato formato;


    //Constructor para recibir objetos en la BBDD
    protected Producto(int id, String titulo, String anio, Formato formato) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.formato = formato;
    }

    //Constructor para crear nuevos productos desde la app
    public Producto(String titulo, String anio, Formato formato) {
        this.titulo = titulo;
        this.anio = anio;
        this.formato = formato;
    }


    protected int getId() {
        return id;
    }

    protected String getTitulo() {
        return titulo;
    }

    protected String getAnio() {
        return anio;
    }

    protected Formato getFormato() {
        return formato;
    }



    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anio='" + anio + '\'' +
                ", formato=" + formato +
                '}';
    }
}
