package main;

import java.util.Scanner;

import hilo.ContadorCaracteres;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce una cadena: ");
	        String cadena = scanner.nextLine();

	        // Crear un arreglo de hilos para cada carácter
	        ContadorCaracteres[] hilos = new ContadorCaracteres[cadena.length()];

	        // Iniciar un hilo para cada carácter en la cadena
	        for (int i = 0; i < cadena.length(); i++) {
	            hilos[i] = new ContadorCaracteres(String.valueOf(cadena.charAt(i)));
	            hilos[i].start(); // Inicia el hilo
	        }

	        // Esperar a que todos los hilos terminen
	        for (ContadorCaracteres hilo : hilos) {
	            try {
	                hilo.join(); // Espera a que el hilo termine
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        // Calcular totales finales
	        int totalDigitos = 0;
	        int totalMayusculas = 0;
	        int totalOtros = 0;

	        // Sumar resultados de cada hilo
	        for (ContadorCaracteres hilo : hilos) {
	            totalDigitos += hilo.getDigitos();
	            totalMayusculas += hilo.getMayusculas();
	            totalOtros += hilo.getOtros();
	        }

	        // Mostrar resultados finales
	        System.out.println("Digitos: " + totalDigitos);
	        System.out.println("Mayusculas: " + totalMayusculas);
	        System.out.println("Otros: " + totalOtros);
	    }
	}