package main;

import Thread.Hilo;

public class Main {

	public static void main(String[] args) {
		// Thread t1 = new Thread(new Hilo()); en el caso de que hilo implemente
		// Runnable

		Hilo h1 = new Hilo("H1");
		Hilo h2 = new Hilo("H2");
		Hilo h3 = new Hilo("H3");

		h1.start();

		h2.start();

		h3.start();

		try {

			h1.join();
			h2.join();
			h3.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Soy el Main y he terminado");
	}

}
