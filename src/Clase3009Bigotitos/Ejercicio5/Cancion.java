package Clase3009Bigotitos.Ejercicio5;

public class Cancion implements Reproducible{

    private String nombreCancion;

    public Cancion(String nombre){

        this.nombreCancion = nombre;

    }


    @Override
    public void reproducir(String mensaje) {

        System.out.println("La cancion " +  this.nombreCancion + " se está reproduciendo.");

    }

}
