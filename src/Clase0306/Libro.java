package Clase0306;

import java.util.Scanner;

public class Libro {

    //Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;

    //Constructor
    public Libro(String titulo, String autor, int anioPublicacion ){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;

    }

    public void prestar(){

        if(!this.prestado){
            this.prestado = true;
            System.out.println("El libro " + titulo + " ha sido prestado.");
        }else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver(){
        if(this.prestado){
            this.prestado = false;

            System.out.println("El libro " + titulo + " ha sido devuelto.");
        }else {
            System.out.println("El libro no está prestado.");
        }
    }

    public void mostrarInfo(){

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("¿Prestado?: " + (prestado ? "Sí" : "No"));
    }
}
