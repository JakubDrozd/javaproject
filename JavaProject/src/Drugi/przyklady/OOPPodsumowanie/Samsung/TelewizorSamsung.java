package Drugi.przyklady.OOPPodsumowanie.Samsung;

import Drugi.przyklady.OOPPodsumowanie.Telewizor;

public abstract class TelewizorSamsung implements Telewizor {

	private boolean stanWlaczony = false;
	private int numerKanalu = 1;
	private int cale;
	
	 protected TelewizorSamsung(int cale) {
		this.cale = cale;
	}

	@Override
	public void wlacz() {
		stanWlaczony = true;
		System.out.println("SAMSUNG: ON");
		wyswietlajObraz();
	}

	public void wylacz() {
		System.out.println("Animacja œciemniania");
		stanWlaczony = false;
	}

	public void przelaczProgram(int numer) {
		if (stanWlaczony) {
			numerKanalu = numer;
		}

	}

	private void wyswietlajObraz() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (stanWlaczony) {
					try {
						System.out.println("Wyœwietlaj obraz: " + numerKanalu);
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}).start();
	}
}
