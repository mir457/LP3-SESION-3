package HOTEL_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Habitacion h1 = new HabitacionSimple(101, 50.0);
        Habitacion h2 = new HabitacionDoble(102, 80.0);
        Habitacion h3 = new Suite(201, 200.0);

        List<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(h1);
        habitaciones.add(h2);
        habitaciones.add(h3);

        System.out.println("=== Habitaciones disponibles ===");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
            System.out.println();
        }

        Fecha entrada = new Fecha(5, 9, 2025);
        Fecha salida = new Fecha(10, 9, 2025);

        int noches = entrada.diferenciaDias(salida);
        double monto = h2.calcularTarifa(noches);

        Reserva reserva = new Reserva(h2.getCodigo(), "Juan Perez", entrada, salida, monto);

        System.out.println("\n=== Reserva creada ===");
        reserva.mostrarInfo();

        h2.ocupar();
        System.out.println("\n=== Estado de la habitación después de la reserva ===");
        h2.mostrarInfo();
    }
}
