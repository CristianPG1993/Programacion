package GestionBiblioteca.src.main.java.biblioteca.simple.contratos;

import GestionBiblioteca.src.main.java.biblioteca.simple.modelo.Usuario;

public interface Prestable {

    void prestar (Usuario u);
    void devolver ();
    boolean estaPrestado();


}
