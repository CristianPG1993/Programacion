package Clase1006.GestionBancaria;

public class Main {
    public static void main(String[] args) {

        // Crear banco
        Banco banco = new Banco("Banco Estrella");

        // Crear clientes
        Cliente laura = new Cliente("Laura Pérez", "12345678A", 1500.00);
        Cliente carlos = new Cliente("Carlos Ruiz", "87654321B", 800.00);

        // Agregar clientes
        banco.agregarCliente(laura);
        banco.agregarCliente(carlos);

        // Mostrar todos los clientes
        System.out.println("\nClientes en el banco:");
        banco.mostrarTodosLosClientes();

        // Transferencia
        System.out.println("\nRealizando transferencia de 200€ de Laura a Carlos...");
        banco.transferir("12345678A", "87654321B", 200.00);

        // Mostrar clientes después de la transferencia
        System.out.println("\nClientes en el banco:");
        banco.mostrarTodosLosClientes();
    }
}
