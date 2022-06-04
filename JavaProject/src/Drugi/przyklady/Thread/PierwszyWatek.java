package Drugi.przyklady.Thread;

public class PierwszyWatek implements Runnable {
	@Override
	public void run() {
		for (int iterator = 0; iterator < 10; iterator++) {
			System.out.println("Pierwszy watek: " + iterator);

		}

	}
}
