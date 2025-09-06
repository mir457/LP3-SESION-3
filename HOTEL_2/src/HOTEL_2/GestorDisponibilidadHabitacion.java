package HOTEL_2;
import java.util.List;

public class GestorDisponibilidadHabitacion {
    public boolean estaDisponible(Habitacion hab, List<Reserva> reservas, Fecha entrada, Fecha salida) {
        if (!hab.estaDisponible()) return false;
        for (Reserva r : reservas) {
            if (r.getCodigoHabitacion() == hab.getCodigo() && r.estaActiva()) {
                if (!(salida.esAntesQue(r.getFechaEntrada()) || entrada.esDespuesQue(r.getFechaSalida()))) {
                    return false;
                }
            }
        }
        return true;
    }
}