package Clase3009;



public class Empleado {

    public static enum Rol {

        Analista, Developer, Tester, PM
    }

    private String dni;
    private String nombre;
    private Rol rol;

    public Empleado(String dni, String nombre, Rol rol){

        this.dni = dni;
        this.nombre = nombre;
        this.rol = rol;

    }
}
