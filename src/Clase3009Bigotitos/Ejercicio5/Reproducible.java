package Clase3009Bigotitos.Ejercicio5;

public interface Reproducible {

    void reproducir(String mensaje);

    default void confirmar() {

        System.out.println("Reproducción con éxito");

    }
}
