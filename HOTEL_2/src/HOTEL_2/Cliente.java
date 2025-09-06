package HOTEL_2;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String email;
    private List<Reserva> reservas = new ArrayList<>();

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void agregarReserva(Reserva r) {
        reservas.add(r);
    }

    public List<Reserva> getReservas() { return reservas; }

    public void mostrarReservas() {
        System.out.println("Reservas de " + nombre + ":");
        for (Reserva r : reservas) r.mostrarInfo();
    }
}
