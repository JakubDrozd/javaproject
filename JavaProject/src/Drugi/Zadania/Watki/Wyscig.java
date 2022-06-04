package Drugi.Zadania.Watki;

public class Wyscig {
	public static void main(String[] args) {
		Thread zawodnikPierwszyThread = new Thread(new ZawodnikPierwszy());
		Thread zawodnikDrugiThread = new Thread(new ZawodnikDrugi());
		zawodnikPierwszyThread.start();
		zawodnikDrugiThread.start();
	}
}
