package GestionBiblioteca.src.main.java.biblioteca.simple.app;

import GestionBiblioteca.src.main.java.biblioteca.simple.contratos.Prestable;
import GestionBiblioteca.src.main.java.biblioteca.simple.modelo.*;
import GestionBiblioteca.src.main.java.biblioteca.simple.servicios.Catalogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Catalogo catalogo = new Catalogo();
    private static final List<Usuario> usuarios = new ArrayList<>();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        cargarDatos();
        menu();
    }

    private static void cargarDatos(){

        catalogo.alta(new Libro(1, "El quijote", "1608", Formato.FISICO,"25222","Cervantes"));
        catalogo.alta(new Libro(2, "El nombre del viento", "2007", Formato.FISICO,"2523422","Patrick"));
        catalogo.alta(new Pelicula(3, "El Padrino", "1608", Formato.FISICO,"Francis Ford Coppola",175));
        catalogo.alta(new Pelicula(4, "Parásitos", "2019", Formato.FISICO,"Bong Joon-ho",132));

        usuarios.add(new Usuario(1, "Juan"));
        usuarios.add(new Usuario(2, "María"));

    }



    private static void menu(){

        int opcion = 0;

        do{
            System.out.println("\n===Menú de Biblioteca===");
            System.out.println("1. Listar");
            System.out.println("2. Buscar por título");
            System.out.println("3. Buscar por año");
            System.out.println("4. Prestar Producto");
            System.out.println("5. Devolver Producto");
            System.out.println("0. Salir");

            //Comprobar que el scanner recibe un número
            while(!scanner.hasNextInt()) scanner.next();

            //Preguntar al usuario
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1 -> listar();
                case 2 -> buscarPorTitulo();
                case 3 -> buscarPorAnho();
                case 4 -> prestar();
                case 5 -> devolver();
                case 0 -> System.out.println("Adiós!");
                default -> System.out.println("Opción no válida");
            }

        }while(opcion != 0);

    }

    private static void listar(){

        List<Producto> lista = catalogo.listar();

        if (lista.isEmpty()){
            System.out.println("Catálogo vacío");
            return;
        }

        System.out.println("===Lista de productos====");

        for (Producto p: lista) System.out.println("- " + p);
    }

    private static void buscarPorTitulo(){
        System.out.println("Introduce el titulo a buscar: ");
        String titulo = scanner.nextLine();
        catalogo.buscar(titulo).forEach(p -> System.out.println("- " + p));

    }

    private static void buscarPorAnho(){
        System.out.println("Año: ");
        int anho = scanner.nextInt();
        scanner.nextLine();
        catalogo.buscar(anho).forEach(p -> System.out.println("- " + p));

    }

    private static void prestar(){

        // 1) Mostrar productos disponibles
        List<Producto> disponibles = catalogo.listar().stream().filter(p -> p instanceof Prestable pN && !pN.estaPrestado()).collect(Collectors.toList());

    }

}
