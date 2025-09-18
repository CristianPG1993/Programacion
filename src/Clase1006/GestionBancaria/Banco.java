package Clase1006.GestionBancaria;

import java.util.ArrayList;

public class Banco {

    //Atributos
    private String nombre;
    private ArrayList<Cliente> clientes;

    //Constructor
    public Banco(String nombre){

        this.nombre = nombre;
        this.clientes = new ArrayList<>();
    }

    //Métodos

    public void agregarCliente(Cliente cliente){

        if(clientes.contains(cliente)){
            System.out.println("Ya existe este cliente.");
        }else {

            clientes.add(cliente);
            System.out.println("Cliente añadido correctamente.\n");
        }
    }

    public Cliente buscarClientePorDNI(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    public void mostrarTodosLosClientes() {
        for (Cliente c : clientes) {
            c.mostrarInfo();
            System.out.println("-----");
        }
    }

    public void transferir(String dniOrigen, String dniDestino, double cantidad) {
        Cliente origen = buscarClientePorDNI(dniOrigen);
        Cliente destino = buscarClientePorDNI(dniDestino);

        if (origen == null || destino == null) {
            System.out.println("Uno o ambos clientes no existen.");
            return;
        }

        if (origen.retirar(cantidad)) {
            destino.depositar(cantidad);
            System.out.println("Transferencia realizada con éxito.");
        } else {
            System.out.println("No se pudo realizar la transferencia. Saldo insuficiente.");
        }
    }


}
