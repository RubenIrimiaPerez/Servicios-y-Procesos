package sincronizacion;

public class CuentaBancaria {

	private double saldo;
	private String registro = "";
	private int numIngresos;


	public synchronized void ingresar(double cantidad) {  // para que no lleguen dos hilos o mas a la vez 
		                                                  // solo puede llegar uno ,cierra con llave y los demas hilos experan fuera
		saldo+=cantidad;      
		registro += "saldo:"+ saldo + "\n";
		numIngresos++;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getRegistro() {
		return registro;
	}
	public int getNumIngresos() {
		return numIngresos;
	}
	


}
