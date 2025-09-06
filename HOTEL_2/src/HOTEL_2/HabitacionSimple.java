package HOTEL_2;

public class HabitacionSimple extends Habitacion {
    public HabitacionSimple(int codigo, double tarifaBase) {
        super(codigo, "Habitación Simple", 1, tarifaBase);
    }
    public double calcularTarifa(int noches) { return tarifaBase * noches; }
}

