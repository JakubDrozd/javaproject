package Drugi.przyklady.Runnable;

public class MainRunnable {
	public static void main(String[] args) {
		Thread watekThread = new Thread(new Watek());
		watekThread.start();

		Thread watekThread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Jestem z klasy anonimowej dla watkow: " + i);
				}
			}
		});
		watekThread2.start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Bez przypisania do zmiennej: " + i);
				}
			}
		}).start();
	}
}
