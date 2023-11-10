package main;

import hilos.HiloConsumidor;
import hilos.HiloProductor;
import shared.ListaCompartida;

public class Main {

	public static void main(String[] args) {
		ListaCompartida lista = new ListaCompartida();
		HiloProductor productor = new HiloProductor(lista);
		HiloConsumidor consumidor = new HiloConsumidor(lista);
		
		productor.start();
		consumidor.start();
		
		
			try {
				productor.join();
				consumidor.join();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
