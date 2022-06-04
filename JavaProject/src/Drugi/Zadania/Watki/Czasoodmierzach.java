package Drugi.Zadania.Watki;

public class Czasoodmierzach implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i == 60) {
				i = -1;
			} else {
				System.out.println("Sekundy: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
