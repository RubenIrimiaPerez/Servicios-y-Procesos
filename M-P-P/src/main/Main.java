package main;

public class Main {

	public static void main(String[] args) {
		Hilo h1 = new Hilo ("Hilo 1");
		Hilo h2 = new Hilo ("Hilo 2");
		Hilo h3 = new Hilo ("Hilo 3");
		
		h1.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		h2.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		h3.start();

		try {
			h1.join();
			
				
			h2.join();
			h3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Soy el Main thread y he terminado");
	}

}
