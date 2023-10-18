package main;

public class Hilo extends Thread {

	public Hilo(String nombre) {
		setName(nombre);
	}
	public void run () {
		long t0 = System.nanoTime();
		long t1 ;
		
		System.out.println("hola soy " + getName());
		
		for (int n = 1; n<=100;n++) {
			System.out.println(getName() + ": " + n);
		}
		t1 = System.nanoTime();
		System.out.println(getName()+ " Ha tardado " + (t1-t0)/1000000 + " milisegundos" );
		
	}

}
