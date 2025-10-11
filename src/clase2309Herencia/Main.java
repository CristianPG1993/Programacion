package clase2309Herencia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pago pago1 = new PagoTarjeta(150, "3837374732");
        Pago pago2 = new Paypal(300, "jdjfjfj@gmail.com");

        Pago[] pagos = { pago1, pago2};

        for (Pago p: pagos){

            p.procesarPago();
            p.mostrarCantidad();
        }

    }






}
