package ACT_3;

public class Espada extends Weapon{
	public Espada(double a) {
		super(a);
	}
	
	@Override
	public double calculateDamage() {
		return baseDamage;
	}
}
