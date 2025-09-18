package clase1609Herencia.Ejercicio1;

public class Vehiculo {

    protected String nombre;
    protected double velocidadMaxima;
    protected double consumo;

    public Vehiculo(String nombre, double velocidadMaxima, double consumo){

        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
        this.consumo = consumo;

    }

    public double calcularVelocidadMaxima(){
        System.out.println("No implementado");

        return 0;
    }

    public double calcularConsumo(){
        System.out.println("No implementado");

        return 0;
    }
}
