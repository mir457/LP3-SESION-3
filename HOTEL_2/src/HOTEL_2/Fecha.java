package HOTEL_2;
import java.time.LocalDate;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public Fecha() {
        LocalDate hoy = LocalDate.now();
        this.dia = hoy.getDayOfMonth();
        this.mes = hoy.getMonthValue();
        this.año = hoy.getYear();
    }

    public boolean esAntesQue(Fecha otra) {
        if (this.año != otra.año) return this.año < otra.año;
        if (this.mes != otra.mes) return this.mes < otra.mes;
        return this.dia < otra.dia;
    }

    public boolean esDespuesQue(Fecha otra) {
        if (this.año != otra.año) return this.año > otra.año;
        if (this.mes != otra.mes) return this.mes > otra.mes;
        return this.dia > otra.dia;
    }

    public int diferenciaDias(Fecha otra) {
        int dias1 = this.año * 360 + this.mes * 30 + this.dia;
        int dias2 = otra.año * 360 + otra.mes * 30 + otra.dia;
        return dias2 - dias1;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, año);
    }
}

