package main;

import java.util.ArrayList;

import hilo.FondoComun;
import hilo.Hilo;

public class Main {

	public static void main(String[] args) {
		  ArrayList<Hilo> usuarios = new ArrayList<>();
		  
		  // Crear y lanzar 10 hilos
	        for (int i = 0; i < 10; i++) {
	            Hilo usuario = new Hilo();
	            usuario.start();
	            usuarios.add(usuario);
	        }
	        
	     // Esperar a que todos los hilos terminen
	        for (Hilo usuario : usuarios) {
	            try {
	                usuario.join();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        // Mostrar el total del fondo
	        System.out.println("Fondo: " + FondoComun.obtenerFondo() + " euros");

	        // Mostrar la traza ordenada de los ingresos
	        System.out.print("Traza: ");
	        for (Hilo usuario : usuarios) {
	            for (Integer ingreso : usuario.getTraza()) {
	                System.out.print("+" + ingreso);
	            }
	        }
	}

}
