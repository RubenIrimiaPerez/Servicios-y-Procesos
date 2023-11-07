import java.util.Random;

public class HiloRandomChar extends Thread {
	private char[] chars;
	private int pos;

	public HiloRandomChar(char[] chars, int pos) {
		this.chars = chars;
		this.pos = pos;
	}

	public void run() {
		chars[pos] = (char) new Random().nextInt('A', 'Z' + 1);
	}

}
