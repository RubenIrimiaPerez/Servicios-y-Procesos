import java.util.Scanner;

public class MainEjercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cadena;
		HiloCuentaDigitos h1, h2;

		// Se pide la cadena.
		System.out.print("Introduce una cadena: ");
		cadena = scanner.nextLine();
		scanner.close();

		// Se crean los dos hilos.
		// El primero busca dígitos en la mitad izquierda.
		// El segundo busca dígitos en la mitad derecha.
		// También podríamos pasar un substring.
		h1 = new HiloCuentaDigitos(cadena, 0, cadena.length() / 2);
		h2 = new HiloCuentaDigitos(cadena, cadena.length() / 2, cadena.length());

		// Arrancamos los hilos.
		h1.start();
		h2.start();

		// Hacemos que el hilo main los espere.
		try {
			h1.join();
			h2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Mostramos el resultado final.
		System.out.println("Hay " + (h1.getContDigitos() + h2.getContDigitos()) + " dígitos.");
	}

}
