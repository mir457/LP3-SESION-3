package ACT_3;

public class Arco extends Weapon{
	public Arco(double a) {
		super(a);
	}
	
	@Override
	public double calculateDamage() {
		return baseDamage;
	}
}
