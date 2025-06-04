package Clase0306;

public class Pelota {

    //Atributos
    private String color;
    private double diametro;
    private int rebotes;

    //Constructor
    public Pelota(String color, double diametro){
        this.color = color;
        this.diametro = diametro;
        this.rebotes = 0;

    }

    public void rebotar(){
        this.rebotes++;
    }

    public int getRebotes(){

    return this.rebotes;
    }

    public void reiniciar(){

        this.rebotes = 0;

    }
}
