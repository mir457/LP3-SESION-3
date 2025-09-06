package HOTEL_2;

public interface PoliticaCancelacion {
    boolean puedeCancelar(Reserva reserva, Fecha fechaActual);
    double penalizacion(Reserva reserva, Fecha fechaActual);
}

