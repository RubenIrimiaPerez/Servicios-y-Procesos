package Thread;

import java.util.Random;

public class Hilo extends Thread {

	public Hilo(String name) {
		setName(name);
	}
	
	
	@Override
	public void run() {
		Random random =  new Random();
		
		try {
			Thread.sleep(random.nextLong(100,1001));
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Hola soy " + getName());
		
		
	}


	

}
