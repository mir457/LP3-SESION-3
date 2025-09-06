package HOTEL_2;

public class HabitacionDoble extends Habitacion {
    public HabitacionDoble(int codigo, double tarifaBase) {
        super(codigo, "Habitación Doble", 2, tarifaBase);
    }
    public double calcularTarifa(int noches) {
        double tarifa = tarifaBase * noches;
        if (noches > 3) tarifa *= 0.95;
        return tarifa;
    }
}