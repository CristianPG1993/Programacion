package clase2309Herencia;

public class Paypal extends Pago {

    private String email;


    public Paypal(double cantidad, String email){

        super(cantidad);
        this.email = email;

    }

    @Override
    public void procesarPago() {

        System.out.println("Procesar pago con Paypal: " + this.email +
                "cantidad: " + this.cantidad);
    }

}
