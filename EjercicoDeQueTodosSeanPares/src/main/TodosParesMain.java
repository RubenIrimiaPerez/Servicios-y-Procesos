package main;

import java.util.Scanner;
import Hilos.HiloPares;

public class TodosParesMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = { 2, 6, 7, 10, 56, 40, 20, 68, 76 };

		HiloPares h1 = new HiloPares(numeros, 0, numeros.length / 2);
		HiloPares h2 = new HiloPares(numeros, numeros.length / 2, numeros.length);

		h1.start();
		h2.start();


		try {
			h1.join();
			h2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		if (h1.isResultado() == true || h2.isResultado() == true) {
			System.out.println("No son pares");
		} else {
			System.out.println(" son pares");
		}

	}

}
