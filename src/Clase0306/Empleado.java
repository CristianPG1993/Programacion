package Clase0306;

public class Empleado {

    //Atributos
    private String nombre;
    private String dni;
    private double salarioMensual;


    //Constructor
    public Empleado(String nombre, String dni, double salarioMensual){

        this.nombre = nombre;
        this.dni = dni;
        this.salarioMensual = salarioMensual;

    }

    //Métodos
    public double aumentarSalario(double porcentaje){
        this.salarioMensual += (salarioMensual * porcentaje)/100;
        return this.salarioMensual;
    }

    public double getSalarioAnual(){
        return this.salarioMensual * 12;
    }

    public void mostrarEmpleado(){

        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Salario mensual: " + salarioMensual);
        System.out.println("Salario anual: " + getSalarioAnual());
    }
}

