package Hilos;

import java.util.Random;

public class Hilo extends Thread {
	public Hilo(){
		
	}
	
	public void run() {
		  Random r = new Random();
		  int resultado = r.nextInt(0,2);
		  
	   }

}
