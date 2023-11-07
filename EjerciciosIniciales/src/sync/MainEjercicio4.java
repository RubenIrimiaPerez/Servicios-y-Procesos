package sync;

import java.util.ArrayList;

public class MainEjercicio4 {

	public static void main(String[] args) {
		int nHilos = 10, nCaramelos = 100;
		ArrayList<HiloJuego> hilos = new ArrayList<HiloJuego>();
		Cuenco cuenco = new Cuenco(nCaramelos);

		for (int i = 0; i < nHilos; i++) {
			HiloJuego newHilo = new HiloJuego("J" + i, cuenco);

			hilos.add(newHilo);
			newHilo.start();
		}

		for (HiloJuego hilo : hilos) {
			
			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println("Resultado:");

		for (HiloJuego h : hilos) {
			System.out.println(h);
		}

	}

}
