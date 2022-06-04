package Drugi.przyklady.WczytywanieDanychZnaki;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		String charNameString = "Veanty";
		Scanner scanner = new Scanner(System.in);
		String nextString = scanner.nextLine();
		while (!(nextString = scanner.nextLine()).equals("/exit")) {
			System.out.println(charNameString + " " + nextString);
		}
		System.out.println("Exiting chat...");
		scanner.close();

		for (int i = 0; i < 10; i++) {

			System.out.println("Exiting the game: " + i);
			Thread.sleep(1000);
		}
	}
}
