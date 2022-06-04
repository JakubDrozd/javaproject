package Drugi.przyklady.Interrupt;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Thread sleepThread = new Thread(new WatekSleepRunnable());
		sleepThread.start();
		sleepThread.interrupt();

		Thread sleepThread2 = new Thread(new WatekInterruptedRunnable());
		sleepThread2.start();
		
		Thread.sleep(1000);
		
		sleepThread2.interrupt();
		
		WatekFlagaRunnable watekFlagaRunnable = new WatekFlagaRunnable();
		Thread watekThread3 = new Thread(new WatekFlagaRunnable());
		watekThread3.start();
		
		Thread.sleep(1000);
		
		watekFlagaRunnable.zatrzymajWatek();
	}
}
