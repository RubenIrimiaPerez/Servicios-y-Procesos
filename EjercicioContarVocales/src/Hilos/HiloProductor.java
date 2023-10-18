package Hilos;

import java.util.Random;

public class HiloProductor extends Thread {
	private int[] numeros;
	private int pos;

	public  HiloProductor(int[] numeros , int pos) {
		this.numeros=numeros;
		this.pos=pos;
	}

	public void run() {
		//si el array tiene 80 posiciones ,el random genera un numero desde el 0 hasta el 80
		numeros[pos] = new Random().nextInt(numeros.length);

	}

}
