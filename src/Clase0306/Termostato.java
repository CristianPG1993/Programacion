package Clase0306;

import java.util.ArrayList;

public class Termostato {

    //Atributos
    private double temperaturaDeseada;
    private Termometro termometro;
    private ArrayList<Split> splits;

    //Constructor
    public Termostato(double tDeseada, Termometro termo){
        this.temperaturaDeseada = tDeseada;
        this.termometro = termo;
        this.splits = new ArrayList<>();

    }

    public void añadirSplit(Split s){

        this.splits.add(s);
    }

    public void comprobarTemperatura(){

        double actual = termometro.leerTemperatura();

        if(actual > this.temperaturaDeseada){

            for (Split s : splits){
                s.enceder();
            }
        }else {
            for(Split s : splits){
                s.enceder();
            }
        }
    }
}
