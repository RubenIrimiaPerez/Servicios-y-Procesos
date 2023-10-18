package main;

import java.util.Scanner;
import Hilos.Hilo;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long[] resultados = new long[2];
		
		System.out.println("Introduzca cadena");
		String cadena = sc.nextLine();
		
		
		Hilo h1 = new Hilo(cadena,resultados,0,0, cadena.length()/2);
		Hilo h2 = new Hilo(cadena,resultados,1,cadena.length()/2,cadena.length());
		
		h1.start();
		h2.start();
		
		try {
			h1.join();
			h2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hay un total de " + resultados[0] + " vocales  ");
		
	}

}
