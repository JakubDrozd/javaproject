package Drugi.przyklady.Interrupt;

public class WatekSleepRunnable implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Sleeping...");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Awakened!");
		}
	}

}
