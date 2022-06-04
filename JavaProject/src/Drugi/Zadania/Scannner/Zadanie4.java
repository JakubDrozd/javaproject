package Drugi.Zadania.Scannner;

import java.util.Scanner;

public class Zadanie4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int liczba = scanner.nextInt();
		while (liczba >= 0) {
			liczba = liczba + scanner.nextInt();
			System.out.println(liczba);
		}

	}
}
