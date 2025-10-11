package Clase3009Bigotitos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Enviable> servicios = new ArrayList<>();

        servicios.add(new Email("cliente@gmail.com"));
        servicios.add(new SMS("+34678573847"));
        servicios.add(new Telegram("+2644774747447"));


        for (Enviable s: servicios){

            s.enviar("Pedido enviado");
            s.confirmar();
        }
    }
}
