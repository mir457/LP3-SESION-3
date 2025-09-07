package ACT_2;

public class SMSNotification implements NotificationManager{
	@Override
	public void enviar(String m) {
		System.out.println("Enviando SMS: "+m);
	}
}
