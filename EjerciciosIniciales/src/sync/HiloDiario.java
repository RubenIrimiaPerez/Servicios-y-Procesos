package sync;

public class HiloDiario extends Thread {
	private Diario diario;

	public HiloDiario(Diario diario, String name) {
		this.diario = diario;
		setName(name);
	}

	public void run() {
		diario.escribir(getName());
	}

}
