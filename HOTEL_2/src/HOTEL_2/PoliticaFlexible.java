package HOTEL_2;

public class PoliticaFlexible implements PoliticaCancelacion {
    public boolean puedeCancelar(Reserva reserva, Fecha fechaActual) {
        return fechaActual.esAntesQue(reserva.getFechaEntrada());
    }
    
    public double penalizacion(Reserva reserva, Fecha fechaActual) {
        return 0.0;
    }
}