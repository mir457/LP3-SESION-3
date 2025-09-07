package ACT_3;

public class Juego {
	public static void main(String[] args) {
		Espada e = new Espada(4.5);
		Arco a = new Arco(5.4);
		
		DamageCalculator d = new DamageCalculator();
		
		System.out.println("DAÑO DE LA ESPADA: "+d.calculateDamage(e));
		System.out.println("DAÑO DEL ARCO: "+d.calculateDamage(a));
	}

}
