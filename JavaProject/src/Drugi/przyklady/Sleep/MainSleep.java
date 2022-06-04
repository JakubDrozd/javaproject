package Drugi.przyklady.Sleep;

public class MainSleep {
	public static void main(String[] args) {
		System.out.println("Gotowi?");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("3");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		System.out.println("2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		System.out.println("1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		System.out.println("START!");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		Thread watekThread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					System.out.println("Drugi: " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println("Uœpiono watek");
						e.printStackTrace();
					}
				}

			}
		});

		Thread watekThread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					System.out.println("Pierwszy: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("Uœpiono drugi watek");
						e.printStackTrace();
					}
				}
			}
		});
		watekThread.start();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println("neverever");
			e.printStackTrace();
		}
		watekThread2.start();
	}
}
