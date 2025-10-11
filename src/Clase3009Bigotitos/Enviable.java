package Clase3009Bigotitos;

public interface Enviable {

    void enviar(String mensaje);

    default void confirmar(){

        System.out.println("Mensaje enviado correctamente");
    }
}
