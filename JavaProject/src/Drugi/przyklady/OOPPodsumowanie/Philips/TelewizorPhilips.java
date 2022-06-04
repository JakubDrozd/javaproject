package Drugi.przyklady.OOPPodsumowanie.Philips;

import Drugi.przyklady.OOPPodsumowanie.Telewizor;

public abstract class TelewizorPhilips implements Telewizor {

	protected boolean statusWlaczony = false;
	private int numerKanalu = 3;
	private int cale;
	protected String idString;
	
	 protected TelewizorPhilips(int cale) {
		this.cale = cale;
	}

	@Override
	public void wlacz() {
		statusWlaczony = true;
		System.out.println("Witaj!");
		wyswietlajObraz();
	}

	public void wylacz() {
		System.out.println("Wy³¹czanie telewizora...");
		statusWlaczony = false;
	}

	public void przelaczProgram(int numer) {
		if (statusWlaczony) {
			numerKanalu = numer;
		}

	}

	private void wyswietlajObraz() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (statusWlaczony) {
					try {
						System.out.println("Program: " + numerKanalu);
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}).start();
	}
}
