package Drugi.Zadania.Watki;

public class Minuty implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i == 61) {
				i = -1;
			} else {
				System.out.println("Minuty: " + i);
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
