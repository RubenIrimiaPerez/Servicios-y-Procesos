package sync;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEjercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nHilos;
		int[] balanza = new int[1];
		ArrayList<HiloYinYang> hilos = new ArrayList<HiloYinYang>();

		System.out.print("Introduce cuántos hilos quieres: ");
		nHilos = scanner.nextInt();
		scanner.close();

		if (nHilos % 2 != 0) {
			System.out.println("Necesario que sean pares. Ajustando +1");
			nHilos++;
		}

		for (int i = 0; i < nHilos; i++) {
			HiloYinYang newHilo = new HiloYinYang(i % 2 == 0, balanza);

			hilos.add(newHilo);
			newHilo.start();
		}

		for (HiloYinYang hilo : hilos) {
			
			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		if (balanza[0] == 0) {
			System.out.println("Balanza: " + balanza[0] + ". Resultado: EQUILIBRIO");
		} else if (balanza[0] > 0) {
			System.out.println("Balanza: " + balanza[0] + ". Resultado: GANA YANG");
		} else {
			System.out.println("Balanza: " + balanza[0] + ". Resultado: GANA YIN");
		}

	}

}
