package main;

import java.util.Scanner;

import hilos.Hilo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		Hilo h1 = new Hilo("Coche1",1);
		Hilo h2 = new Hilo("Coche2",1);

		h1.start();
		h2.start();

	}

}
