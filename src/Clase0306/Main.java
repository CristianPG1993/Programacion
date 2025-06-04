package Clase0306;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("1984", "George Orwell", 1949);
        System.out.println("\n1.Ejercicio Clase Libro:");
        libro1.mostrarInfo();
        System.out.println("\nLlamada al método prestar:");
        libro1.prestar();
        System.out.println("\nLlamada al método mostrarInfo:");
        libro1.mostrarInfo();
        System.out.println("\nLlamada al método devolver:");
        libro1.devolver();
        System.out.println("\nLLamada al método mostrarInfo:");
        libro1.mostrarInfo();

        Vehiculo coche = new Vehiculo("Toyota", "Corolla", "1234ABC", 15000);
        System.out.println("\n2.Ejercicio Clase Vehículo:");
        coche.mostrarVehiculo();
        coche.recorrer(120.5);
        System.out.println("\nLlamada al método mostrarVehículo después de recorer km:");
        coche.mostrarVehiculo();

        Empleado empleado1 = new Empleado("Laura García", "12345678A", 1500.0);
        System.out.println("\n3.Ejercicio Clase Empleado:");
        empleado1.mostrarEmpleado();

        System.out.println("\nAumentando salario un 10%...");
        empleado1.aumentarSalario(10);

        empleado1.mostrarEmpleado();


        System.out.println("\n4. Ejericio Clase Pelota:");

        Pelota pelota = new Pelota("roja", 10.5);

        pelota.rebotar();
        pelota.rebotar();
        pelota.rebotar();

        System.out.println("Rebotes: " + pelota.getRebotes()); // 3

        pelota.reiniciar();

        System.out.println("Rebotes tras reinicio: " + pelota.getRebotes()); // 0
    }


}
