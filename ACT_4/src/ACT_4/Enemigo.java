package ACT_4;

public class Enemigo extends Personajes{
	public Enemigo(String n, Weapon a) {
		super(n, a, 80);
		System.out.println("El enemigo ha sido creado");
	}
	
	@Override
	public void personajeVivo() {
		if(vida <=0) {
			System.out.println("El enemigo ha sido eliminado");
		}
		else {
			System.out.println("EL enemigo está en pie");
		}
	}
	
}
