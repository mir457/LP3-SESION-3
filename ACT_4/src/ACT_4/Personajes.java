package ACT_4;

public abstract class Personajes {
	protected Weapon w;
	protected double vida;
	protected String nombre;
	
	public Personajes(String n, Weapon we, double v) {
		this.w = we;
		this.nombre = n;
		this.vida = v;
	}
	
	public double getVida() {return vida;}
	public void setVida(double a) {vida = a;}
	
	public void mostrarVida() {
		System.out.println("VIDA ACTUAL: "+vida);
	}
	
	public void atacar(Personajes a) {
		double daño = DamageCalculator.calculateDamage(w);
		a.setVida(a.getVida()-daño);
		System.out.println("DAÑO RECIBIDO: "+daño);
	}
	
	public void atacarDC(Personajes a) {
		double daño = w.getDanoC()*1.5;
		a.setVida(a.getVida()-daño);
		System.out.println("DAÑO RECIBIDO: "+daño);
	}
}
