package Clase3009Bigotitos.Ejercicio6;

public abstract class  Producto implements Vendible{

    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase){

        this.nombre = nombre;
        this.precioBase = precioBase;

    }

    public abstract double calcularPrecioFinal();

    @Override
    public double calcularImporte() {
        return calcularPrecioFinal();
    }

    public String getNombre() {

        return nombre;

    }

    public double getPrecioBase() {
        return precioBase;
    }

}
