package HOTEL_2;

public class EnviadorSMS implements CanalNotificacion {
    public void enviarNotificacion(String mensaje) {
        System.out.println("SMS enviado: " + mensaje);
    }
}