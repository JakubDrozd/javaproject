package Drugi.Zadania.Watki;

public class MainCzasomierz {
	public static void main(String[] args) {
		Thread watekThread = new Thread(new Czasoodmierzach());
		Thread wateThread2 = new Thread(new Minuty());
		wateThread2.start();
		watekThread.start();
	}
}
