package hilos;

public class Hilo {
	private String Nombre;
	private int Vuelta;
	
	public Hilo(String nombre, int vuelta) {
		Nombre = nombre;
		Vuelta = vuelta;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getVuelta() {
		return Vuelta;
	}
	public void setVuelta(int vuelta) {
		Vuelta = vuelta;
	}
	
	public void run() {
		
	}
	public void start() {
		// TODO Auto-generated method stub
		
	}

}
