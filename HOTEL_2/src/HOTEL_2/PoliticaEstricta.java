package HOTEL_2;

public class PoliticaEstricta implements PoliticaCancelacion {
    public boolean puedeCancelar(Reserva reserva, Fecha fechaActual) {
        return false;
    }
    public double penalizacion(Reserva reserva, Fecha fechaActual) {
        return reserva.getMontoTotal();
    }
}