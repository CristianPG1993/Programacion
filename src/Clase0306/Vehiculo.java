package Clase0306;

public class Vehiculo {

    //Atributos
    private String marca;
    private String modelo;
    private String matricula;
    private double kilometraje;

    //Constructor
    public Vehiculo(String m,String model,String matric, double kilometros){

        this.marca = m;
        this.modelo = model;
        this.matricula = matric;
        this.kilometraje = kilometros;
    }

    public double recorrer(double km){

        this.kilometraje += km;
        return this.kilometraje;

    }

    public void mostrarVehiculo(){

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Kilometraje: " + kilometraje);
    }
}
