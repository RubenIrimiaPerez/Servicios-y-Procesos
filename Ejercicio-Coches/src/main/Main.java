package main;

import Thread.Coche;

public class Main {

	public static void main(String[] args) {
		int CantidadCoche = 10; // Cantidad de pilotos en la carrera

		Coche[] coches = new Coche[CantidadCoche];

		// Se crean los hilos y se inician
		for (int i = 0; i < CantidadCoche; i++) {
			coches[i] = new Coche("Coche" + (i + 1));
			coches[i].start();
		}

		// El do while se hace mientras que todavian queden coches sin terminar
		do {

			// Simular la carrera durante 10 vueltas
			for (int vuelta = 0; vuelta <= 10; vuelta++) {
				try {
					Thread.sleep(1000); // Esperar 1 para cada impresion en pantalla
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Ordenar los coches según las vueltas completadas
				ordenarCoches(coches);
				System.out.println("Coche   Vuelta     Ranking");
				System.out.println("****************************");
				for (int i = 0; i < CantidadCoche; i++) {
					Coche coche = coches[i];
					System.out.println(coche.getNombre() + "       " + coche.getVueltas() + "        " + (i + 1));

				}
				System.out.println("\n");

			}

		} while (contarVueltas(coches) == true);
		System.out.println("****FIN DE CARRERRA****");

	}


	// Metodo para saber si quedan coches sin terminar
	public static boolean contarVueltas(Coche[] coches) {

		for (Coche coche : coches) {

			if (coche.getVueltas() < 10) {
				return true;
			}

		}

		return false;

	}

	// Metodo para ordenar los coches
	private static void ordenarCoches(Coche[] coches) {
		for (int i = 0; i < coches.length - 1; i++) {
			for (int j = 0; j < coches.length - i - 1; j++) {
				if (coches[j].getVueltas() < coches[j + 1].getVueltas()) {
					Coche temporal = coches[j];
					coches[j] = coches[j + 1];
					coches[j + 1] = temporal;
				}

			}

		}

	}
	

}
