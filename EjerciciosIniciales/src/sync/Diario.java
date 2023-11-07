package sync;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Diario {
	private PrintWriter printer;

	public Diario(String path) {

		try {
			printer = new PrintWriter(new FileWriter(path), true);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public synchronized void escribir(String name) {
		LocalDateTime now = LocalDateTime.now();

		if (printer != null) {
			printer.println(
				"Hola soy " + name
				+ " y es " + now.getDayOfMonth()
				+ "/" + now.getMonthValue()
				+ "/" + now.getYear()
				+ " a las " + now.getHour() + ":"
				+ now.getMinute() + ":" + now.getSecond()
				+ " (" + now.getNano() + " ns)"
			);
		}

	}

	public synchronized void cerrar() {
		printer.close();
	}

}
