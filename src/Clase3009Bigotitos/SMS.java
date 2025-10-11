package Clase3009Bigotitos;

public class SMS implements Enviable{

    private String movil;

    public SMS(String movil){

        this.movil = movil;

    }

    @Override
    public void enviar(String mensaje){

        System.out.println("Enviando SMS al " + this.movil +
                " :" + mensaje);
    }


}
