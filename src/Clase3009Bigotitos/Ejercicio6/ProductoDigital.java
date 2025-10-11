package Clase3009Bigotitos.Ejercicio6;

public class ProductoDigital extends Producto{

    private double descuento;

    public ProductoDigital(String nombre, double precioBase, double descuento){

        super(nombre, precioBase);
        this.descuento = descuento;

    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * (1 - this.descuento);
    }
}
