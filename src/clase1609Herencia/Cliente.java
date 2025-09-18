package clase1609Herencia;

public class Cliente extends Usuario {

    private int puntosFidelidad;


    public Cliente(String nombre, String email, int puntosFidelidad){

        super(nombre, email);
        this.puntosFidelidad = puntosFidelidad;

    }

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cliente: " + this.nombre + " - " + this.email +
                " | Puntos de fidelidad: " + this.puntosFidelidad);
    }
}
