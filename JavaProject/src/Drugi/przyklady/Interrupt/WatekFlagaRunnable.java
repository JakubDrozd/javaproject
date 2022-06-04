package Drugi.przyklady.Interrupt;

import com.example.basics.control_flow_statements.Break;

public class WatekFlagaRunnable implements Runnable {

	private boolean watekDziala;

	@Override
	public void run() {
		watekDziala = true;
		while (watekDziala) {
			System.out.println("Flag thread works");
		}
		
		System.out.println("Flag thread stopped working");
		return;
	}

	public void zatrzymajWatek() {
		watekDziala = false;
	}

}
