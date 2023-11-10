package hilos;

import shared.ListaCompartida;

public class HiloConsumidor extends Thread{
	private ListaCompartida listacompartida;
	
	
	public HiloConsumidor(ListaCompartida listacompartida) {
		this.listacompartida = listacompartida;
	}


	public void run() {
		for(int i = 0 ;i<10;i++) {
			System.out.println(listacompartida.extraer()); 
		}
		
	}

}
