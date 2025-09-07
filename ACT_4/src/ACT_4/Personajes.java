package ACT_4;

public abstract class Personajes {
	protected Weapon w;
	protected double vida;
	protected String nombre;
	protected boolean estaVivo;
	
	public Personajes(String n, Weapon we, double v) {
		this.w = we;
		this.nombre = n;
		this.vida = v;
		this.estaVivo = true;
	}
	
	public double getVida() {return vida;}
	public void setVida(double a) {vida = a;}
	
	public String getNombre() {return nombre;}
	
	public void mostrarVida() {
		System.out.println("VIDA ACTUAL: "+vida);
	}
	
	public void atacar(Personajes a) {
		double daño = DamageCalculator.calculateDamage(w);
		a.setVida(a.getVida()-daño);
		if(a.getVida() <= 0) {
			a.setVida(0);
			System.out.println("El personaje "+a.getNombre()+ "ha sido derrotado");
			estaVivo = false;
		}
		System.out.println("DAÑO RECIBIDO: "+daño);
	}
	
	public void atacarDC(Personajes a) {
		double daño = w.getDanoC()*1.5;
		a.setVida(a.getVida()-daño);
		System.out.println("DAÑO RECIBIDO: "+daño);
	}
	
	public abstract void personajeVivo();
}
