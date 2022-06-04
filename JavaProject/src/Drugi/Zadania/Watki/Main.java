package Drugi.Zadania.Watki;

public class Main {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Ta informacja zosta³a wypisana z klasy anonimowej i z mojego w¹tku");
				
			}
		};
		Thread anonimowyThread = new Thread(runnable);
		anonimowyThread.start();
	}
}
