package Clase1006.GestionBancaria;

public class Cliente {

    //Atributos
    private String nombre;
    private String dni;
    private double saldo;

    //Constructor
    public Cliente(String nombre, String dni, double saldoInicial){

        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldoInicial;

    }


    //Métodos

    public String getDni(){

        return this.dni;

    };


    public double getSaldo(){
        return this.saldo;
    };

    public double depositar(double cantidad){
        this.saldo += cantidad;
        return this.saldo;

    }

    public boolean retirar(double cantidad){

        if(cantidad > this.saldo){
            System.out.println("No hay saldo suficiente en la cuenta.");
            return  false;
        }else{
            this.saldo -= cantidad;
            return true;
        }
    }

    public void mostrarInfo(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Dni: " + dni);
        System.out.println("Saldo: " + saldo);
    }
}
