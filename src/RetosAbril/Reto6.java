package RetosAbril;

import java.util.Scanner;



public class Reto6 {

    public static void main(String[] args) {


//        Juan está trabajando en un mercadona en el que no hay cajero automático,
//        él siempre calcula el cambio de los clientes de cabeza.
//        ¿Se te ocurre alguna forma de hacerle la vida más sencilla al pobre chaval?
//
//        Crea un programa que:
//        Reciba la cantidad de dinero (double) que el usuario ha entregado para pagar.
//        Compare la cantidad entregada con el precio del producto y calcule la diferencia.
//        Súmale el IVA porque esto es españa, redondeado a dos décimas (+21%)
//        Devuelva el valor utilizando la menor cantidad de billetes y monedas posibles siendo
//        estos billete de 500 €, billete de 200 €, billete de 100 €, billete de 50 €, billete de 20 €,
//        billete de 10 €, billete de 5 €, moneda de 2 €, moneda de 1 €, moneda de 50 cnts, moneda de 20 cnts,
//        moneda de 10 cnts, moneda de 2 cnts y moneda de 1 cnt.
//
//        Pero cuidado, si un cliente intenta pagar con menos dinero del necesario…
//        ¡tendrás que avisarle antes de que se lleve el producto gratis!
//
//        Ejemplo:
//        El producto cuesta 17 €.
//        El cliente te da 20 pavos.
//        El cambio es de 1 moneda de 1 euro y 1 moneda de 2 euros.


        Scanner scanner = new Scanner(System.in);
        // Pedimos al usuario el importe de la compra y la cantidad entregada por el cliente
        System.out.println("Introduzca el importe de la compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Introduzca la cantidad de dinero dada por el cliente: ");
        double dineroCliente = scanner.nextDouble();

        // Calculamos el precio con IVA incluido y lo redondeamos a dos decimales
        double precioConIva = Math.round((valorCompra * 1.21) * 100.0) / 100.0;

        // Comprobamos si el cliente tiene suficiente dinero
        if (dineroCliente < precioConIva) {
            System.out.println("No tienes dinero suficiente");
        } else {
            // Calculamos el cambio
            double cambio = dineroCliente - precioConIva;
            System.out.println("Cambio a devolver: " + cambio + " €");

            // Convertimos el cambio a céntimos para evitar problemas con decimales
            int cambioCts = (int) Math.round(cambio * 100);
            System.out.println(cambioCts);

            // Array de los valores de los billetes y monedas disponibles (en céntimos)
            int[] billetesYMonedas = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 2, 1};
            String[] denominaciones = {"billetes de 500€", "billetes de 200€", "billetes de 100€", "billetes de 50€",
                    "billetes de 20€", "billetes de 10€", "billetes de 5€", "monedas de 2€",
                    "monedas de 1€", "monedas de 50cts", "monedas de 20cts", "monedas de 10cts",
                    "monedas de 2cts", "monedas de 1ct"};

            // Recorremos las denominaciones para calcular cuántos billetes y monedas necesitamos
            for (int i = 0; i < billetesYMonedas.length; i++) {
                int cantidad = cambioCts / billetesYMonedas[i]; // Número de billetes/monedas
                if (cantidad > 0) {
                    System.out.println("Devolver " + cantidad + " " + denominaciones[i]);
                }
                cambioCts %= billetesYMonedas[i]; // Calculamos el resto de céntimos
            }
        }

        // Cerramos el scanner
        scanner.close();
    }
}
