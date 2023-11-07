import java.util.Random;

public class HiloDigitosNoRepetidos extends Thread {
	private char[] digitos;
	private int pos;

	public HiloDigitosNoRepetidos(char[] digitos, int pos) {
		this.digitos = digitos;
		this.pos = pos;
	}

	public void run() {
		digitos[pos] = (char) new Random().nextInt('0', '9');
	}

}
