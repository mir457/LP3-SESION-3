package HOTEL_2;

public class PoliticaModerada implements PoliticaCancelacion {
    public boolean puedeCancelar(Reserva reserva, Fecha fechaActual) {
        return fechaActual.esAntesQue(reserva.getFechaEntrada());
    }
    public double penalizacion(Reserva reserva, Fecha fechaActual) {
        return reserva.getMontoTotal() * 0.5;
    }
}