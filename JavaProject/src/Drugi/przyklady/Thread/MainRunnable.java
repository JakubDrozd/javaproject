package Drugi.przyklady.Thread;

public class MainRunnable {

	public static void main(String[] args) {
		Thread watekThread = new Thread(new PierwszyWatek());
		Thread watekThread2 = new Thread(new DrugiWatek());
		watekThread.start();
		watekThread2.start();
	}
}
