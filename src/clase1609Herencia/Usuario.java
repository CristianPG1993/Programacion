package clase1609Herencia;

public class Usuario {

    protected String nombre;
    protected String email;

    public Usuario (String nombre,String email){

        this.nombre = nombre;
        this.email = email;

    }

    public void mostrarInfo(){
        System.out.println("Usuario genérico: " + nombre + " - " + email);

    };


}
