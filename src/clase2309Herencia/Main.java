package clase2309Herencia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pago> pagos = new ArrayList<>();



        pagos.add(new PagoTarjeta(20,"28374673"));
        pagos.add(new Paypal(40, "ejejejeje@gmail.com"));
        pagos.add(new PagoTarjeta(20, "28283474782"));



        for( Pago p : pagos){

            System.out.println("Cantidad: " + p);


        }

    }






}
