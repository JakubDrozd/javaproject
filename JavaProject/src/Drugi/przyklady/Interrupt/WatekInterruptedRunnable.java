package Drugi.przyklady.Interrupt;

public class WatekInterruptedRunnable implements Runnable {

	@Override
	public void run() {
		while (!Thread.interrupted()) {
			System.out.println("Works...");
		}
			System.out.println("Work has been interrupted!");
		}

	}

