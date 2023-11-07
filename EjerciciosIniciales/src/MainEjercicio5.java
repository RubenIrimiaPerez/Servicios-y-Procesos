import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEjercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cantidadDigitos = 0;
		ArrayList<HiloDigitosNoRepetidos> hilos = new ArrayList<HiloDigitosNoRepetidos>();
		char[] arrayDigitos;
		String digitos;
		boolean tieneRepetidos;

		// Se pide la cantidad de dígitos a generar.
		// Suponemos que será mínimo 1.
		do {
			

			try {
				System.out.print("Introduce cuántos dígitos quieres: ");
				cantidadDigitos = scanner.nextInt();
				scanner.close();
			} catch (InputMismatchException ime) {
				System.err.println("ERROR: la cantidad leída debe ser un número entero.");
			}

			if (cantidadDigitos < 1 || cantidadDigitos > 10) {
				System.err.println("ERROR: la cantidad leída debe ser de 1 a 10.");
			}

		} while (cantidadDigitos < 1 || cantidadDigitos > 10);

			// Creación del array de dígitos
		arrayDigitos = new char[cantidadDigitos];
	
		do {
			tieneRepetidos = false;
	
			// Se lanzan los hilos para que genere cada uno su dígito.
			for (int i = 0; i < cantidadDigitos; i++) {
				HiloDigitosNoRepetidos newHilo = new HiloDigitosNoRepetidos(arrayDigitos, i);
	
				hilos.add(newHilo);
				newHilo.start();
			}
	
			// El main espera.
			for (HiloDigitosNoRepetidos hilo : hilos) {
	
				try {
					hilo.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			// Vaciamos la lista de hilos que ya han terminado
			hilos.clear();

			digitos = new String(arrayDigitos);
			System.out.println(new String(digitos));

			// Bucle para comparar si la cadena tiene repetidos
			for (int i = 0; i < digitos.length() - 1; i++) {
	
				if (digitos.substring(i + 1).contains(String.valueOf(digitos.charAt(i)))) {
					System.out.println("ERROR: repetidos detectados.");
					tieneRepetidos = true;
					break;
				}
	
			}

		} while (tieneRepetidos);

	}

}
