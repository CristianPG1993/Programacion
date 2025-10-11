package Clase3009Bigotitos.Ejercicio5;

public class Video implements Reproducible{

    private String nombreVideo;

    public Video(String nombre){

        this.nombreVideo = nombre;
    }

    @Override
    public void reproducir(String nombreVideo){

        System.out.println("El vídeo "+  this.nombreVideo +  " se está reporduciendo.");
    }
}
