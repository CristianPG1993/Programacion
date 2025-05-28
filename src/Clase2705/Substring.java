package Clase2705;


public class Substring {

    public static void main(String[] args) {

        String email = "pepe@gmail.com";

        String nombreUsuario = email.substring(0, email.indexOf("@"));

        System.out.println(nombreUsuario);

        String servidor = email.substring(email.indexOf("@") +1);
        System.out.println(servidor);

    }


}
