package clase1609Herencia;

public class Administrador extends Usuario {

    private String nivelAcceso;

    public Administrador(String nombre, String email,String nivelAcceso) {
        super(nombre, email);
        this.nivelAcceso = nivelAcceso;
    }


    public String getNivelAcceso(){
        return this.nivelAcceso;
    }

    @Override
    public void mostrarInfo() {

        System.out.println("Admin: " + this.nombre + " - " + this.email +
                " | Nivel de acceso: " + this.nivelAcceso);
    }

}
