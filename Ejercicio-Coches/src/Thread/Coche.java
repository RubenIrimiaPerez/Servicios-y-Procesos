package Thread;

import java.util.Random;

public class Coche extends Thread {

	private String nombre;
	private int vueltas;

	public Coche(String nombre) {
		this.nombre = nombre;
		this.vueltas = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVueltas() {
		return vueltas;
	}

	@Override
	public void run() {
		Random random = new Random();
		for (int vuelta = 1; vuelta <= 10; vuelta++) {
			try {
				int segVuelta = random.nextInt(500,3000); // Tiempo aleatorio entre 0.5 y 3 segundos que dura cada vuelta
				vueltas++;
				Thread.sleep(segVuelta);//el tiempo que tarda en hacer la vuelta el hilo no hace nada esta dormido
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
	
	

}
