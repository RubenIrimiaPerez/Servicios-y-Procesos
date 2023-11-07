package sync;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEjercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nHilos;
		ArrayList<HiloDiario> hilos = new ArrayList<HiloDiario>();
		Diario diario = new Diario("hilos.txt");

		System.out.print("Introduce cuántos hilos quieres: ");
		nHilos = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < nHilos; i++) {
			HiloDiario newHilo = new HiloDiario(diario, "H" + i);

			hilos.add(newHilo);
			newHilo.start();
		}

		for (HiloDiario hilo : hilos) {
			
			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		diario.cerrar();
		System.out.println("FIN");
	}

}
