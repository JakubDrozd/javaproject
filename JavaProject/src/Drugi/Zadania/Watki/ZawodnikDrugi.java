package Drugi.Zadania.Watki;

public class ZawodnikDrugi implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Bed� pierwszy - to ja Zawodnik Drugi");
		}
		System.out.println("ZAKO�CZY�EM! Melduje sie Zawodnik Drugi");
	}

}
