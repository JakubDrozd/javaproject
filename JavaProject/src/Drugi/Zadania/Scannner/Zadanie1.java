package Drugi.Zadania.Scannner;

import java.util.Scanner;

public class Zadanie1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nameString = scanner.next();
		String nazwiskoString = scanner.next();
		int wzrost = scanner.nextInt();
		
		System.out.println("Jestem " + nameString + " " + nazwiskoString + " i mam " + wzrost + " cm wzrostu");
	}
}
