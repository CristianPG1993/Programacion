package GestionBiblioteca.src.main.java.biblioteca.simple.contratos;

import GestionBiblioteca.src.main.java.biblioteca.simple.modelo.Usuario;

//La interfaz Prestable define el comportamiento que deben tener los objetos que pueden ser prestados
public interface Prestable {

    //Mé_todo para prestar el objeto a un usuario. Cada clase que implemente esta interfaz decidirá como gestionarlo internamente.
    void prestar (Usuario u);

    //Me_todo para devolver el objeto prestado. void debe de dejar el objeto como "no prestado"
    void devolver ();

    //Mé_todo que indica sí el objeto está actualmente prestado o no
    boolean estaPrestado();


}
