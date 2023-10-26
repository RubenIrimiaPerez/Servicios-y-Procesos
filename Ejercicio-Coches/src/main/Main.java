package main;

import Thread.Coche;

public class Main {

	public static void main(String[] args) {
		int CantidadCoche = 10; // Cantidad de pilotos en la carrera
		int CochesCompletados = 0;
		Coche[] coches = new Coche[CantidadCoche];

		// Inicializar los coches y comenzar la carrera
		for (int i = 0; i < CantidadCoche; i++) {
			coches[i] = new Coche("Coche" + (i + 1));
			coches[i].start();
		}
		
		
		
		
		
		
		do {
			// Simular la carrera durante 10 vueltas
			for (int vuelta = 0; vuelta <= 10; vuelta++) {
				try {
					Thread.sleep(1000); // Esperar 1 segundo entre actualizaciones
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// Ordenar los coches según las vueltas completadas y mostrar el estado
				ordenarCoches(coches);
				System.out.println("Coche   Vuelta     Ranking");
				System.out.println("****************************");
				for (int i = 0; i < CantidadCoche; i++) {
					Coche coche = coches[i];
					System.out.println(coche.getNombre() + "       " + coche.getVueltas() + "        " + (i + 1));

				}
				System.out.println("\n");

			}
		
			CochesCompletados++;
		} while (contarVueltas(coches) == true);

	}
	

	public static boolean contarVueltas(Coche[] coches) {
		
		for (Coche coche : coches) {
			
			if(coche.getVueltas() <10) {
				return true;
			}
			
		}
		
		return false;
		
		
		
	}

	private static void ordenarCoches(Coche[] coches) {
		for (int i = 0; i < coches.length - 1; i++) {
			for (int j = 0; j < coches.length - i - 1; j++) {
				if (coches[j].getVueltas() < coches[j + 1].getVueltas()) {
					Coche temp = coches[j];
					coches[j] = coches[j + 1];
					coches[j + 1] = temp;
				}

			}

		}

	}

}
