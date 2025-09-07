package ACT_2;

public class EmailNotification implements NotificationManager{
	@Override
	public void enviar(String m) {
		System.out.println("Enviando correo: "+m);
	}
}
