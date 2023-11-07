import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEjercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cantidadNumeros = 0;
		ArrayList<HiloRandomChar> hilos = new ArrayList<HiloRandomChar>();
		char[] chars;

		// Se pide la cantidad de caracteres a generar.
		// Suponemos que será mínimo 1.
		do {
			

			try {
				System.out.print("Introduce cuántos caracteres quieres: ");
				cantidadNumeros = scanner.nextInt();
				scanner.close();
			} catch (InputMismatchException ime) {
				System.err.println("ERROR: la cantidad leída debe ser un número entero.");
			}

			if (cantidadNumeros < 1) {
				System.err.println("ERROR: la cantidad leída debe ser superior o igual a 1.");
			}

		} while (cantidadNumeros < 1);

		// Creación del array de caracteres
		chars = new char[cantidadNumeros];

		// Se lanzan los hilos para que genere cada uno su carácter.
		for (int i = 0; i < cantidadNumeros; i++) {
			HiloRandomChar newHilo = new HiloRandomChar(chars, i);

			hilos.add(newHilo);
			newHilo.start();
		}

		// El main espera.
		for (HiloRandomChar hilo : hilos) {

			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		// Se muestra el String.
		System.out.println("Palabra generada: " + new String(chars));
	}

}
