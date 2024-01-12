package hilo;

public class FondoComun {
	

private static int fondo = 800;
	
	// Método synchronized para agregar dinero al fondo de manera segura en entornos concurrentes
	 public static synchronized void agregarDinero(int ingreso) {
	        fondo += ingreso;
	    }
	// Método para obtener el saldo actual del fondo
	    public static int obtenerFondo() {
	        return fondo;
}
}