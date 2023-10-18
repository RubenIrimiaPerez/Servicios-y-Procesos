package Hilos;

import java.util.Random;

public class HiloCifrado  extends Thread{
	private String Cadena;
	private String[] NuevaCadena;
	private int Cifrado;
	private int pos;
	
	public HiloCifrado(String cadena, String[] nuevaCadena, int cifrado,int pos) {
		this.Cadena = cadena;
		this.NuevaCadena = nuevaCadena;
		this.Cifrado = cifrado;
		this.pos=pos;
	}

	public void run() {
		
		
	}
}

	
	


