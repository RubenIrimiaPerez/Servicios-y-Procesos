package main;



import Thread.Coche;

public class Main {

	public static void main(String[] args) {

		int NumeroCoches = 10;
		Coche[] coches =new Coche[NumeroCoches];
		 //se crean los 10 coches
		for(int i = 0; i<NumeroCoches; i++) {
			coches[i]= new Coche("Coche" + (i+1));
			coches[i].start();
		}
		 System.out.println("427527");
		
		 for (int vueltas = 1; vueltas <= 10; vueltas++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		
		
    System.out.println("hsgfuiefuiheaufhbj");

		

	}

}
