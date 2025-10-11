package Clase3009Bigotitos.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vendible> productos = new ArrayList<>();

        productos.add(new ProductoFisico("Patatas", 10.40, 5));
        productos.add(new ProductoDigital("FIFA26", 70, 0.10));


        for (Vendible v: productos){

            Producto p = (Producto) v;

            System.out.println(p.getNombre() + "->" + v.calcularImporte() + " $");
        }
    }
}
