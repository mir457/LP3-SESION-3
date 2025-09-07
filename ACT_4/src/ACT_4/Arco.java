package ACT_4;

public class Arco extends Weapon{
	protected double baseDamage = 15;
	
	public Arco() {
		super(15);
	}
	
	@Override
	public double calculateDamage() {
		return baseDamage;
	}
}