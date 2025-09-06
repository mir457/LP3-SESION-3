package HOTEL_2;

public class Suite extends Habitacion {
    public Suite(int codigo, double tarifaBase) {
        super(codigo, "Suite de lujo", 4, tarifaBase);
    }
    public double calcularTarifa(int noches) {
        double tarifa = tarifaBase * noches * 1.2;
        if (noches > 7) tarifa *= 0.85;
        return tarifa;
    }
}