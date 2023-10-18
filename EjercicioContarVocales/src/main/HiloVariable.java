package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Hilos.HiloProductor;

public class HiloVariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<HiloProductor> hilos = new ArrayList<>();
		int[] numeros;
		int cantidad;
		
		
		System.out.println("Introduce la cantidad de numeros que quieres: ");
		cantidad = scanner.nextInt();
		
		numeros = new int[cantidad];
		
		for(int i = 0; i< cantidad;i++) {
			//1º CREAMOS UN NUEVO HILO Y LE PASAMOS SU POSICION
			HiloProductor newHilo =  new HiloProductor(numeros,i);
			// 2º AÑADIMOS EL HILO A LA LISTA
			hilos.add(newHilo);
			
			//3º ARRANCAMOS EL HILO
			newHilo.start();
			
		}
		
		try {
			//4º ESPERAR A TODOS LOS HILOS
			for(HiloProductor hilo : hilos) {
				hilo.join();
			}
			
			//5º MOSTRAR EL ARRAY
			System.out.println(Arrays.toString(numeros));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
