package Drugi.Zadania.Watki;

public class ZawodnikPierwszy implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Bedê pierwszy - to ja Zawodnik Pierwszy");
		}
		System.out.println("ZAKOÑCZY£EM! Melduje sie Zawodnik Pierwszy");
	}
	
}
