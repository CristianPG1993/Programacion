package Clase7;

public class EjemploNullPointerException {

    public static void main(String[] args) {

        try{

            String nombre = null;

            System.out.println("La longitud del nombre es: " + nombre.length());

        } catch (NullPointerException e) {

            System.out.println("El nombre no puede estar vacío.");

        }
    }
}
