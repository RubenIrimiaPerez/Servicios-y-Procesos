package sync;

public class Cuenco {
	private int caramelos;

	public Cuenco(int caramelos) {
		this.caramelos = caramelos;
	}

	public synchronized void robar(HiloJuego hj) {

		if (caramelos > 0) {
			caramelos--;
			hj.incrementarCaramelosRobados();
		} else {
			hj.parar();
		}

	}

}
