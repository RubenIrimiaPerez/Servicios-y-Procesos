import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEjercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cantidadNumeros = 0, min = 0, max = 10;
		int mayor = min;
		int menor = max;
		String listaMenores = "", listaMayores = "";
		ArrayList<HiloRandom> hilos = new ArrayList<HiloRandom>();

		// Se pide la cantidad de números a generar.
		// Suponemos que será mínimo 1.
		do {
			

			try {
				System.out.print("Introduce cuántos números quieres: ");
				cantidadNumeros = scanner.nextInt();
				scanner.close();
			} catch (InputMismatchException ime) {
				System.err.println("ERROR: la cantidad leída debe ser un número entero.");
			}

			if (cantidadNumeros < 1) {
				System.err.println("ERROR: la cantidad leída debe ser superior o igual a 1.");
			}

		} while (cantidadNumeros < 1);

		// Se lanzan los hilos para que genere cada uno su número.
		for (int i = 0; i < cantidadNumeros; i++) {
			HiloRandom newHilo = new HiloRandom("H" + i, min, max);

			hilos.add(newHilo);
			newHilo.start();
		}

		// El main espera.
		for (HiloRandom hilo : hilos) {

			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		// Localizamos el mayor y el menor.
		// Puede haber empates.
		for (HiloRandom hilo : hilos) {
			int n = hilo.getGeneratedInt();

			if (n == menor) {
				listaMenores += hilo.getName() + " ";
			} else if (n < menor) {
				menor = n;
				listaMenores = hilo.getName() + " ";
			}

			if (n == mayor) {
				listaMayores += hilo.getName() + " ";
			} else if (n > mayor) {
				mayor = n;
				listaMayores = hilo.getName() + " ";
			}

		}

		System.out.println(
			"Menor: " + menor + " >>> " + listaMenores
			+ "\nMayor: " + mayor + " >>> " + listaMayores
		);
	}

}
