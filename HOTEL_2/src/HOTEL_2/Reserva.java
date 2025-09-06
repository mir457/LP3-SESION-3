package HOTEL_2;


class Reserva {
    private static int contadorId = 0;
    private int idReserva;
    private int codigoHabitacion;
    private String userHuesped;
    private Fecha fechaEntrada;
    private Fecha fechaSalida;
    private int numeroNoches;
    private double montoTotal;
    private EstadoReserva estado;
    private Fecha fechaReserva;
    private String observaciones;

    public Reserva(int codigoHabitacion, String userHuesped, Fecha fechaEntrada, Fecha fechaSalida, double montoTotal) {
        this.idReserva = ++contadorId;
        this.codigoHabitacion = codigoHabitacion;
        this.userHuesped = userHuesped;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.montoTotal = montoTotal;
        this.estado = EstadoReserva.ACTIVA;
        this.fechaReserva = new Fecha();
        this.observaciones = "";

        this.numeroNoches = fechaEntrada.diferenciaDias(fechaSalida);
        if (this.numeroNoches <= 0) {
            this.numeroNoches = 1;
        }
    }

    public int getIdReserva() { return idReserva; }
    public int getCodigoHabitacion() { return codigoHabitacion; }
    public String getUserHuesped() { return userHuesped; }
    public Fecha getFechaEntrada() { return fechaEntrada; }
    public Fecha getFechaSalida() { return fechaSalida; }
    public int getNumeroNoches() { return numeroNoches; }
    public double getMontoTotal() { return montoTotal; }
    public EstadoReserva getEstado() { return estado; }
    public Fecha getFechaReserva() { return fechaReserva; }
    public String getObservaciones() { return observaciones; }

    // Setters
    public void setEstado(EstadoReserva estado) { this.estado = estado; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
    public void setMontoTotal(double montoTotal) { this.montoTotal = montoTotal; }

    public boolean estaActiva() {
        return estado == EstadoReserva.ACTIVA;
    }

    public void cancelar() {
        estado = EstadoReserva.CANCELADA;
    }

    public void completar() {
        estado = EstadoReserva.COMPLETADA;
    }

    public void marcarNoShow() {
        estado = EstadoReserva.NO_SHOW;
    }

    public boolean conflictoCon(Fecha entrada, Fecha salida) {
        if (estado != EstadoReserva.ACTIVA) return false;
        return !(salida.esAntesQue(fechaEntrada) || entrada.esDespuesQue(fechaSalida));
    }

    public void mostrarInfo() {
        System.out.println("=== RESERVA #" + idReserva + " ===");
        System.out.println("Habitación: " + codigoHabitacion);
        System.out.println("Huésped: " + userHuesped);
        System.out.println("Entrada: " + fechaEntrada);
        System.out.println("Salida: " + fechaSalida);
        System.out.println("Noches: " + numeroNoches);
        System.out.printf("Monto Total: $%.2f\n", montoTotal);
        System.out.println("Estado: " + estado);
        System.out.println("Fecha de Reserva: " + fechaReserva);
        if (!observaciones.isEmpty()) {
            System.out.println("Observaciones: " + observaciones);
        }
        System.out.println("=========================");
    }
}
