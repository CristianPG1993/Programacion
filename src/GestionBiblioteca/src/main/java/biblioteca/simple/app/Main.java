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

    private static void listarUsuarios(){
        if (usuarios.isEmpty()){
            System.out.println("NO hay usuarios registrados.");
            return;
        }

        System.out.println("### Lista Usuarios ###");
        usuarios.forEach(u -> System.out.println("- Código: " + u.getId() +
                "| Nombre: " + u.getNombre()));
    }

    private static Usuario getUsuarioPorCodigo(int id){
        return usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private static void prestar(){

        // 1) Mostrar productos disponibles
        List<Producto> disponibles = catalogo.listar().stream()
                .filter(p -> p instanceof Prestable pN && !pN.estaPrestado())
                .collect(Collectors.toList());
        //Comprobar si está vacía la lista
        if (disponibles.isEmpty()){
            System.out.println("No hay productos para prestar.");
        }

        //Mostrar los productos disponibles
        System.out.println("### PRODUCTOS DISPONIBLES ###");
        disponibles.forEach(p -> System.out.println("- ID: " + p.getId() + " | " + p));

        //Pedir al usuario que escriba el id del producto que desea
        System.out.println("Escribe el id del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine();


        // Recorrer la lista de productos
        Producto pEncontrado = disponibles.stream()
                .filter( p -> {
                        try{
                            return p.getId() == id;
                        } catch(NumberFormatException e){

                            return false;
                        }
                    })
                .findFirst()
                .orElse(null);

                //Comprobar si el id de producto no exite
                if(pEncontrado == null){
                    System.out.println("El id no existe");
                    return;
                }

                listarUsuarios();

                //Pedir código de usuario
                System.out.println("Ingresa código de usuario: ");
                int codUsuario = scanner.nextInt();
                scanner.nextLine();
                Usuario u1 = getUsuarioPorCodigo(codUsuario);

                //Comprobar el código de usuario
                if (u1 == null){
                    System.out.println("Usuario no encontrado");
                }


                Prestable pPrestable =(Prestable) pEncontrado;
                pPrestable.prestar(u1);

    }



    private static void devolver(){

        // 1) Mostrar productos prestados
        List<Producto> pPrestados = catalogo.listar().stream()
                .filter(p -> p instanceof Prestable pN && pN.estaPrestado())
                .collect(Collectors.toList());
        //Comprobar si está vacía la lista
        if (pPrestados.isEmpty()){
            System.out.println("No hay productos para prestar.");
        }

        //Mostrar los productos disponibles
        System.out.println("### PRODUCTOS PRESTADOS ###");
        pPrestados.forEach(p -> System.out.println("- ID: " + p.getId() + " | " + p));

        //Pedir al usuario que escriba el id del producto que desea
        System.out.println("Escribe el id del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine();


        // Recorrer la lista de productos
        Producto pEncontrado = pPrestados.stream()
                .filter( p -> {
                    try{
                        return p.getId() == id;
                    } catch(NumberFormatException e){

                        return false;
                    }
                })
                .findFirst()
                .orElse(null);

        //Comprobar si el id de producto no exite
        if(pEncontrado == null){
            System.out.println("El id no existe");
            return;
        }

        Prestable pE = (Prestable) pEncontrado;
        pE.devolver();
        System.out.println("Devuelto correctamente");

    }

}
