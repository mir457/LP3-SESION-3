package HOTEL_2;

public class HabitacionMatrimonial extends Habitacion {
    public HabitacionMatrimonial(int codigo, double tarifaBase) {
        super(codigo, "Habitación Matrimonial", 2, tarifaBase);
    }
    public double calcularTarifa(int noches) {
        double tarifa = tarifaBase * noches;
        if (noches > 5) tarifa *= 0.9;
        return tarifa;
    }
}