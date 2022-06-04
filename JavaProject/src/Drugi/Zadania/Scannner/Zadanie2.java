package Drugi.Zadania.Scannner;

import java.util.Scanner;

public class Zadanie2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(";");
		while (true) {
			String string = scanner.next();
			if (string.equals("x") || string.equals("X")) {
				break;
			}
			System.out.println("Log: " + string);
		}
	}
}