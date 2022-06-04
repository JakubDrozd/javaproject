package Drugi.przyklady.WczytywanieDanychMetody;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		while (scanner.hasNextLine()) {
//			String line = scanner.nextLine();
//			System.out.println("Linia: " + line);
//		}
		String nextString;
		while (!(nextString = scanner.next()).equals("/exit")) {
			System.out.println("Tekst: " + nextString);
		}
		System.out.println("Koniec dzia³ania...");

	}
}
