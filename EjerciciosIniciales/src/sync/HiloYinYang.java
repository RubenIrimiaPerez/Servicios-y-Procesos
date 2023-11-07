package sync;

import java.util.Random;

public class HiloYinYang extends Thread {
	private boolean yin;
	private int[] balanza;

	public HiloYinYang(boolean yin, int[] balanza) {
		this.yin = yin;
		this.balanza = balanza;
	}

	public void run() {
		int rand = new Random().nextInt(1, 11);

		if (yin) {
			System.out.println("YIN -" + rand);

			synchronized (balanza) {
				balanza[0] -= rand;
			}

		} else {
			System.out.println("YANG +" + rand);

			synchronized (balanza) {
				balanza[0] += rand;
			}

		}

	}

}
