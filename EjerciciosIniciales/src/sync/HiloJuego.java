package sync;

public class HiloJuego extends Thread {
	private int caramelosRobados;
	private Cuenco cuenco;
	private boolean continuar;

	public HiloJuego(String name, Cuenco cuenco) {
		setName(name);
		this.cuenco = cuenco;
		continuar = true;
	}

	public void run() {

		while (continuar) {

			// Podéis comentar este "sleep()", pero así es un poco más justo
			// para los últimos hilos en arrancar.
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			cuenco.robar(this);
		}

	}

	public void incrementarCaramelosRobados() {
		caramelosRobados++;
	}

	public int getCaramelosRobados() {
		return caramelosRobados;
	}

	public void parar() {
		continuar = false;
	}

	@Override
	public String toString() {
		return getName() + " --- " + caramelosRobados + " caramelos";
	}

}
