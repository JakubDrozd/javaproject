package Drugi.Zadania.Scannner;

import java.util.Scanner;

public class Zadanie3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tekstString = scanner.next();
		int liczbaPowtorzen = scanner.nextInt();
		for (int i = 0; i < liczbaPowtorzen; i++) {
			System.out.println(tekstString);
		}
	}
}
