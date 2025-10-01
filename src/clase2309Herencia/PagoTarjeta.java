package clase2309Herencia;

public class PagoTarjeta extends Pago {

    private String numTarjeta;

    public PagoTarjeta(double cantidad,String numTarjeta) {
        super(cantidad);
        this.numTarjeta = numTarjeta;
    }


    @Override
    public void procesarPago() {

        System.out.println("Procesar pago con tarjeta " + this.numTarjeta +
                "cantidad: " + this.cantidad);


    }
}
