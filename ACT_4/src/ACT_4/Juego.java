package ACT_4;

public class Juego {
	public static void main(String[] args) {
		Jugador j1 = new Jugador("Caballero", new Espada());
		Enemigo e1 = new Enemigo("Arquero", new Arco());
		
		System.out.println("SE INICIÓ LA PELEA");

        while (j1.getVida() > 0 && e1.getVida() > 0) {
            System.out.println("JUEGA EL JUGADOR");
            j1.atacar(j1);
            e1.mostrarVida();

            if (e1.getVida() > 0) {	//realiza el ataque si el enemigo sigue vivo
                System.out.println("JUEGA EL ENEMIGO");
                e1.atacar(j1);
                j1.mostrarVida();
            }
        }

        System.out.println("SE ACABO LA PELEA");
        if (j1.getVida() > 0) {
            System.out.println(j1.getNombre() + " ganó la batalla");
        } else {
            System.out.println(e1.getNombre() + " ganó la batalla");
        }
	}
}
