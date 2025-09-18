package clase1609Herencia.Ejercicio1;

public class Bicicleta extends Vehiculo{

    private int numeroMarchas;

    public Bicicleta(String nombre, double velocidadMaxima, double consumo, int numeroMarchas){

        super(nombre, velocidadMaxima, consumo);
        this.numeroMarchas = numeroMarchas;

    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return numeroMarchas * 3;

    }

    @Override
    public double calcularConsumo(){

        return 0;
    }
}
