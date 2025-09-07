package ACT_4;

public class Jugador extends Personajes{
	public Jugador(String n, Weapon a) {
		super(n,a, 100);
		System.out.println("El jugador ha sido creado");
	}
	
	@Override
	public void personajeVivo() {
		if(vida <=0) {
			System.out.println("El jugador ha sido eliminado");
		}
		else {
			System.out.println("EL jugador está en pie");
		}
	}
}
