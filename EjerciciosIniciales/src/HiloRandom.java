import java.util.Random;

public class HiloRandom extends Thread {
	private int min;
	private int max;
	private int generatedInt;

	public HiloRandom(String name, int min, int max) {
		this.min = min;
		this.max = max;
		setName(name);
	}

	public void run() {
		generatedInt = new Random().nextInt(min, max);
		System.out.println("Soy " + getName() + " y he generado " + generatedInt);
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getGeneratedInt() {
		return generatedInt;
	}

	public void setGeneratedInt(int generatedInt) {
		this.generatedInt = generatedInt;
	}

}
