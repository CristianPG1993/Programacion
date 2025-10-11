package Clase3009Bigotitos.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Reproducible> reproducibles = new ArrayList<>();

        reproducibles.add(new Cancion("La cucaracha"));
        reproducibles.add(new Video("El pollito pio"));

        for (Reproducible r: reproducibles){

            r.reproducir("Reproducción en curso... ");
            r.confirmar();
        }
    }
}
