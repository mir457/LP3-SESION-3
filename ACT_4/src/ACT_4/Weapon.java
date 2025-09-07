package ACT_4;

public abstract class Weapon {
	protected double baseDamage;
	protected double dañoC;
	
	public Weapon(double bD) {
		this.baseDamage = bD;
		this.dañoC = baseDamage * 1.5;
	}
	
	public double getBaseDamage() {return baseDamage;}
	public void setBaseDamage(double a) {
		baseDamage = a;
		dañoC = baseDamage * 1.5;}
	
	public double getDanoC() {return dañoC;}
	
	public abstract double calculateDamage();
}
