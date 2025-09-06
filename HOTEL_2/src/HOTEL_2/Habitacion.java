package HOTEL_2;

enum TipoHabitacion {
    SIMPLE(1),
    DOBLE(2),
    MATRIMONIAL(3),
    SUITE(4);

    private final int value;

    TipoHabitacion(int value) {
        this.value = value;
    }

    public int getValue() { return value; }
}


enum EstadoHabitacion {
    DISPONIBLE,
    OCUPADA,
    MANTENIMIENTO,
    BLOQUEADA
}

public abstract class Habitacion {
    protected int codigo;
    protected String descripcion;
    protected int capacidad;
    protected double tarifaBase;
    protected boolean disponible = true;

    public Habitacion(int codigo, String descripcion, int capacidad, double tarifaBase) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularTarifa(int noches);

    public boolean estaDisponible() { return disponible; }
    public void ocupar() { disponible = false; }
    public void liberar() { disponible = true; }

    public int getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public int getCapacidad() { return capacidad; }
    public double getTarifaBase() { return tarifaBase; }

    public void mostrarInfo() {
        System.out.println("Habitación " + codigo + ": " + descripcion + " | Tarifa: $" + tarifaBase + " | Capacidad: " + capacidad);
    }
}
