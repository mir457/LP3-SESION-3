package ACT_4;

public class Espada extends Weapon{
	protected double baseDamage = 20;
	public Espada() {
		super(20);
	}
	
	@Override
	public double calculateDamage() {
		return baseDamage;
	}
}
