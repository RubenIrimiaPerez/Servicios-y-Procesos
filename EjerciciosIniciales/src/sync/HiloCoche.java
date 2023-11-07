package sync;

import java.util.ArrayList;
import java.util.Random;

public class HiloCoche extends Thread {
	private ArrayList<String> meta;

	public HiloCoche(String name, ArrayList<String> meta) {
		setName(name);
		this.meta = meta;
	}

	public void run() {

		try {
			Thread.sleep(new Random().nextInt(10, 25));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (meta) {
			meta.add(getName());
		}

	}

}
