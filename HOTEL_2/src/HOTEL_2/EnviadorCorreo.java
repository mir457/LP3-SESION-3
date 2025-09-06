package HOTEL_2;


public class EnviadorCorreo implements CanalNotificacion {
    public void enviarNotificacion(String mensaje) {
        System.out.println("Correo enviado: " + mensaje);
    }
}
