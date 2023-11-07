package sync;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEjercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nCoches;
		ArrayList<HiloCoche> hilos = new ArrayList<HiloCoche>();
		ArrayList<String> meta = new ArrayList<String>();

		System.out.print("Introduce cuántos coches quieres: ");
		nCoches = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < nCoches; i++) {
			HiloCoche newHilo = new HiloCoche("C" + (i + 1), meta);

			hilos.add(newHilo);
			newHilo.start();
		}

		for (HiloCoche hilo : hilos) {
			
			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println(meta);
	}

}
