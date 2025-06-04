package Clase0306;

public class Split {

    private boolean encendido;
    private String ubicacion;

    public Split(String ubicacion){

        this.encendido = false;
        this.ubicacion = ubicacion;

    }

    public boolean estaEncendido(){
        return encendido;

    }

    public void enceder(){

        if(!this.encendido) {
            this.encendido = true;
            System.out.println("Split de " + ubicacion + "encendido.");
        }

    }
    public void apagar(){

        if(this.encendido) {
            this.encendido = false;
            System.out.println("Split de " + ubicacion + "apagado.");
        }

    }
}
