package Clase3009Bigotitos.Ejercicio6;

public class ProductoFisico extends Producto{

    private double costeEnvio;


    public ProductoFisico(String nombre, double precioBase,double costeEnvio ){
        super(nombre,precioBase);
        this.costeEnvio = costeEnvio;
    }

    @Override
    public double calcularPrecioFinal() {

        return getPrecioBase() + this.costeEnvio;

    }
}
