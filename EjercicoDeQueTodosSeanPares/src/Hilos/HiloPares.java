package Hilos;

public class HiloPares extends Thread {
	private int[] numeros;
	private int min;
	private int max;
	private boolean resultado;
	
	
	public HiloPares(  int[] numeros,int min,int max) {
		this.numeros = numeros;
		this.min = min;
		this.max = max;
		
	}
	

	
	public void run() {
		for(int i = min; i<max;i++) {
			if(numeros[i] % 2 != 0) {
					resultado = true;
				break;
			}
		}
		
	

	}

	public boolean isResultado() {
		return resultado;
	}



	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}


}
