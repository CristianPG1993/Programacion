package Clase3009Bigotitos;

public class Telegram implements Enviable{

    private String movil;

    public Telegram(String movil){

        this.movil = movil;

    }

    @Override
    public void enviar(String mensaje) {

        System.out.println("Enviando mensaje al telegram del " + this.movil
        + " :" + mensaje);
    }

}
