package clase1609Herencia.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        // Crear array de vehículos
        Vehiculo[] vehiculos = new Vehiculo[4];

        // Crear objetos y añadirlos al array
        vehiculos[0] = new Coche("Seat León", 0, 0, 110);
        vehiculos[1] = new Bicicleta("Bicicleta de montaña", 0, 0, 6);
        vehiculos[2] = new Coche("BMW Serie 3", 0, 0, 190);
        vehiculos[3] = new Bicicleta("Bicicleta urbana", 0, 0, 3);


        for (Vehiculo v : vehiculos){
            if (v instanceof Coche c){
                System.out.println("Vehiculo: " + c.nombre);
                System.out.println("------------------");
            }else if (v instanceof Bicicleta b){
                System.out.println("Vehiculo: " + b.nombre);
                System.out.println("------------------");
            }
        }
        // Mostrar info de cada vehículo
        for (Vehiculo v : vehiculos) {
            System.out.println("Vehículo: " + v.nombre);
            System.out.printf("  Velocidad máxima: %.2f km/h\n", v.calcularVelocidadMaxima());
            System.out.printf("  Consumo: %.2f L/100km\n", v.calcularConsumo());
            System.out.println("----------");
        }
    }
}
