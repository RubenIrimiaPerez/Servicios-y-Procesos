package main;

import java.util.ArrayList;
import java.util.Scanner;
import Hilos.HiloCifrado;


//El usuario itroduce una cadena
//Luego tenemos un codigo de cifrado que es un entero
//
//Codigo de cifrado :20
//hola
//H -> H+20 etc..

public class Cifrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<HiloCifrado> hilos = new ArrayList<>();
		String cadena;
		String[] NuevaCadena;
		int num;
		char letra;

		System.out.println("Introduce la cadena de  que quieres: ");
		cadena = sc.nextLine();
		System.out.println("Introduce el cifrado  que quieres: ");
		int cifrado = sc.nextInt();
		sc.nextLine();

	
		
		
		for (int i = 0; i < cadena.length(); i++) {

			num = cadena.charAt(i) + cifrado;
			System.out.println(num);
			
		}
	

		try {

			for (HiloCifrado hilo : hilos) {
				hilo.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
