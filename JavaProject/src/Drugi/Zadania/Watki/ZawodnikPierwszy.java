package Drugi.Zadania.Watki;

public class ZawodnikPierwszy implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Bed� pierwszy - to ja Zawodnik Pierwszy");
		}
		System.out.println("ZAKO�CZY�EM! Melduje sie Zawodnik Pierwszy");
	}
	
}
