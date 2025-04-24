package Clase8;


import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioFinal {

    public static void main(String[] args) {

        ArrayList<String> listaCompra = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menú principal con do-while para repetir hasta que se elija salir
        do {
            System.out.println("\nLista de la compra");
            System.out.println("1. Añadir productos");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Eliminar producto por nombre");
            System.out.println("4. Mostrar en orden la lista");
            System.out.println("5. Salir");
            System.out.print("\n¿Qué desea hacer? (1-5): ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpieza de buffer tras nextInt()

            switch (opcion) {
                case 1:
                    // Añadir productos
                    System.out.print("\n¿Cuántos productos desea añadir? ");
                    int cantidadProductos = scanner.nextInt();
                    scanner.nextLine(); // Limpieza de buffer

                    for (int i = 0; i < cantidadProductos; i++) {
                        System.out.print("Introduce el nombre del producto: ");
                        String producto = scanner.nextLine().toLowerCase();
                        listaCompra.add(producto);
                        System.out.println("----------------------------------");
                    }
                    break;

                case 2:
                    // Mostrar todos los productos
                    System.out.println("\nProductos en la lista:");
                    for (String producto : listaCompra) {
                        System.out.println("Producto: " + producto);
                    }
                    break;

                case 3:
                    // Eliminar un producto por nombre
                    System.out.print("\n¿Qué producto deseas eliminar? ");
                    String productoAQuitar = scanner.nextLine().toLowerCase();

                    if (listaCompra.contains(productoAQuitar)) {
                        listaCompra.remove(productoAQuitar);
                        System.out.println("El producto \"" + productoAQuitar + "\" ha sido eliminado correctamente.");
                    } else {
                        System.out.println("El producto \"" + productoAQuitar + "\" no se ha encontrado en la lista.");
                    }
                    break;

                case 4:
                    // Mostrar la lista en orden alfabético
                    System.out.println("\nProductos ordenados alfabéticamente:");
                    listaCompra.sort(null);
                    for (String producto : listaCompra) {
                        System.out.println("Producto: " + producto);
                    }
                    break;

                case 5:
                    // Salir del programa
                    System.out.println("\nSaliendo del menú.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 5);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
