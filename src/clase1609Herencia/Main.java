package clase1609Herencia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Usuario user = new Usuario("Laura","ejemplo@prueba.com");

        Usuario admin = new Administrador("Pepe", "admin@ejemplo.com", "Gestor");

        Usuario cliente = new Cliente("Juan", "juan@ejemplo.com", 120);

        Usuario[] usuarios = {user, admin, cliente};

        for (Usuario u: usuarios){

            u.mostrarInfo();
        }
    }
}
