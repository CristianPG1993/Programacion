package RetosAbril;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto10 {

    public static void main(String[] args) {

//        Una tienda de galletas artesanales vende al por mayor en su página web.
//        Cada caja de galletas cuesta 6€. Solicita la cantidad de cajas de galletas en cada venta
//        y dependiendo de la cantidad introducida se realizan los siguientes pasos:
//        Si la cantidad de cajas de galletas vendidas es menor a 5: no se permiten compras inferiores a 5 cajas de galletas.
//        Si la cantidad de cajas de galletas es mayor o igual a 5, pero menor a 15: los gastos de envío son de 10€.
//        Si la cantidad de cajas de galletas es mayor a 15: El envío es gratuito.
//
//        Promociones:
//        Si el precio total es inferior a 120€ no hay promociones.
//        Si el precio total supera los 120€ pero es menor a 250€: Tiene un descuento del 5%.
//        Si el precio total supera los 250€: Tiene un descuento del 10%.
//
//        Muestra al cliente un mensaje por pantalla según la cantidad de cajas de galletas que quiera comprar:
//        Número total de cajas a comprar.
//        Total € de la compra.
//        Gastos de envío (si los tiene o si es gratuito)
//        Descuento por compra (Indicar al cliente cuántos € falta para entrar en una promoción
//        si la compra es <100€ o el importe de descuento generado si es superior)


        // Creamos el objeto Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario la cantidad de cajas que desea comprar
        System.out.println("Introduzca el importe de la compra: ");
        int valorCompra = 6; // El precio de cada caja de galletas
        int cajasGalletas = 0;
        double gastosEnvio = 10; // Los gastos de envío estándar para compras entre 5 y 14 cajas

        // Excepciones en caso de que el usuario no ingrese un número válido
        try {
            // Pedimos la cantidad de cajas a comprar
            System.out.println("¿Cuántas cajas de galletas desea(min. pedido: 5 cajas)?");
            cajasGalletas = scanner.nextInt();

            // Calculamos el precio sin IVA
            double precioSinIva = valorCompra * cajasGalletas;
            // Calculamos el precio con IVA (21%)
            double precioTotalConIva = (double) (Math.round(precioSinIva * 1.21) * 100) / 100;
            // Calculamos el IVA
            double iva = precioTotalConIva - precioSinIva;

            // Precio total con envío si es necesario
            double precioToTalConIvaEnvio = precioTotalConIva + gastosEnvio;

            // Calcular cuánto falta para entrar en la promoción si el precio es menor a 120€
            double cantidadFaltantePromocion = 120 - precioTotalConIva;

            // Condición para comprobar si el pedido es válido (mínimo 5 cajas)
            if ((cajasGalletas >= 5) && (cajasGalletas < 15)) {
                // Si el precio total es menor a 100€
                if(precioTotalConIva < 100) {
                    System.out.println("El pedido que has realizado tiene " + cajasGalletas + " cajas de galletas. Cada caja tiene un precio de " + valorCompra +
                            ". El coste de la compra es el siguiente:\n1. Precio sin IVA = " + precioSinIva + " €.\n2. Precio con IVA =  " +
                            precioTotalConIva + " €.\n3. Precio IVA = " + iva + " €.\n4. Precio gastos de envío = " + gastosEnvio + " €.\n5. Precio total más gastos de envío = " + precioToTalConIvaEnvio + " €.\n6. Para tener un descuento del 5% necesitas añadir = " + cantidadFaltantePromocion + " € a la compra.");
                } else if ((precioTotalConIva >= 100) && precioTotalConIva <= 120){
                    System.out.println("El pedido que has realizado tiene " + cajasGalletas + " cajas de galletas. Cada caja tiene un precio de " + valorCompra +
                            ". El coste de la compra es el siguiente:\n1. Precio sin IVA = " + precioSinIva + " €.\n2.Precio con IVA =  " +
                            precioTotalConIva + " €.\n3. Precio IVA = " + iva + " €.\n4. Precio total más gastos de envío = " + precioToTalConIvaEnvio + " €.");
                }
            }
            // Condición para pedidos con más de 15 cajas (envío gratuito)
            else if ((cajasGalletas >= 15)) {
                // Descuento del 5% si el precio total es entre 120€ y 250€
                if ((precioTotalConIva > 120) && (precioTotalConIva < 250)) {
                    double descuento5 = precioTotalConIva * 0.05;
                    double preciototalConDescuento5 = precioTotalConIva - descuento5;

                    System.out.println("El pedido que has realizado tiene " + cajasGalletas +
                            ". El coste de la compra es el siguiente:\n1. Precio sin IVA = " + precioSinIva + " €.\n2. Precio con IVA =  " +
                            precioTotalConIva + " €.\n3. Precio IVA = " + iva  + " €.\n4. Precio total sin gastos de envío = " + precioTotalConIva + " €.\n5. Descuento 5% = " + descuento5 +
                            " €.\n6. Precio total + gastos de envío + descuento 5% = " + preciototalConDescuento5 + " €.");
                }
                // Descuento del 10% si el precio total supera los 250€
                else if (precioTotalConIva >= 250) {
                    double descuento10 = precioTotalConIva * 0.10;
                    double preciototalConDescuento10 = precioTotalConIva - descuento10;

                    System.out.println("El pedido que has realizado tiene " + cajasGalletas +  " cajas de galletas. Cada caja tiene un precio de " + valorCompra +
                            ". El coste de la compra es el siguiente:\n1. Precio sin IVA = " + precioSinIva + " €.\n2. Precio con IVA = " +
                            precioTotalConIva +" €.\n3. Precio IVA = " + iva + " €.\n4. Precio total sin gastos de envío =  = " + precioTotalConIva + " €.\n5. Descuento 10% = " + descuento10 +
                            " €.\n6. Precio total + gastos de envío + descuento 10% = " + preciototalConDescuento10 + " €.");
                } else {
                    System.out.println("El pedido que has realizado tiene " + cajasGalletas + " cajas de galletas. Cada caja tiene un precio de " + valorCompra +
                            ". El coste de la compra es el siguiente:\n1. Precio sin IVA = " + precioSinIva + " €.\n2. Precio con IVA =  " +
                            precioTotalConIva + " €.\n3. Precio IVA = " + iva + " €.\n4. Precio gastos de envío = " + gastosEnvio + " €.\n5. Precio total más gastos de envío = " + precioToTalConIvaEnvio + " €.");
                }
            }
            // Si el pedido es menor de 5 cajas, se avisa de que no se puede realizar el pedido
            else {
                System.out.println("NO puedes realizar el envio. Pedido mínimo de 5 cajas.");
            }

        } catch (InputMismatchException e) {
            // Si el usuario ingresa un valor incorrecto, mostramos un mensaje de error
            System.out.println("Debes introducir un número en el campo.");
        } finally {
            // Este bloque se ejecuta siempre, independientemente de si hay error o no
            System.out.println("Programa finalizado!");
        }

        // Cerramos el scanner para liberar el recurso
        scanner.close();



    }
}
