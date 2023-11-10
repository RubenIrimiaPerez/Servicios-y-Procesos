package hilos;

import shared.ListaCompartida;

public class HiloProductor extends Thread{
	private ListaCompartida listacompartida;

	
	public HiloProductor(ListaCompartida listacompartida) {
		this.listacompartida = listacompartida;
	}


	@Override
	public void run() {
		
		for(int i = 0 ;i<10;i++) {
			listacompartida.agregar("Vuelta"+i);
		}
	}
	
}
