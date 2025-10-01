package clase2309Herencia;

public abstract class Pago {

    protected double cantidad;


    public Pago(double cantidad){

        if (cantidad <= 0){
            throw new IllegalArgumentException("La cantidad debe de ser mayor que 0");
        }

        this.cantidad = cantidad;

    }

    public abstract void  procesarPago();

    public void mostrarCantidad(){

        System.out.println("Cantidad: " + cantidad);
    }
}
