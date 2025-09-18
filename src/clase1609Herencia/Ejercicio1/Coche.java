package clase1609Herencia.Ejercicio1;

public class Coche extends Vehiculo{

    private int caballos;

    public Coche(String nombre, double velocidadMaxima, double consumo, int caballos){

        super(nombre, velocidadMaxima, consumo);
        this.caballos = caballos;

    }

    public int getCaballos(){ return this.caballos;}

    @Override
    public double calcularVelocidadMaxima() {

        return caballos * 1.5;
    }

    @Override
    public double calcularConsumo(){

        return caballos * 0.05;
    }
}
