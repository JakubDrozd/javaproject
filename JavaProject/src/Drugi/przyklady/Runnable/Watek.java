package Drugi.przyklady.Runnable;

public class Watek implements Runnable {

	@Override
	public void run() {
		for (int iterator = 0; iterator < 10; iterator++) {
			System.out.println("Watek: " + iterator);

		}
	}

}
