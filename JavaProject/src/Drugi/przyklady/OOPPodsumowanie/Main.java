package Drugi.przyklady.OOPPodsumowanie;

import java.util.Scanner;

import Drugi.przyklady.OOPPodsumowanie.Philips.P43PUS6523;
import Drugi.przyklady.OOPPodsumowanie.Philips.P55PUS7334;
import Drugi.przyklady.OOPPodsumowanie.Samsung.EU43RU7172;

public class Main {
	public static void main(String[] args) {
		obslugaTelewizora();
	}

	private static void obslugaTelewizora() {
		Telewizor tv = new P55PUS7334("Unikalne_id");
		Scanner scanner = new Scanner(System.in);

		int opcja = 0;
		System.out.println("1. W³¹cz");
		System.out.println("2. Wy³¹cz");
		System.out.println("3. Zmieñ program");
		System.out.println("4. Zakoñcz program");
		while (opcja != 4) {
			opcja = scanner.nextInt();

			switch (opcja) {
			case 1:
				tv.wlacz();
				break;
			case 2:
				tv.wylacz();
				break;
			case 3:
				System.out.println("Podaj numer programu: ");
				int numer = scanner.nextInt();
				tv.przelaczProgram(numer);
				break;
			}
		}
	}
}
