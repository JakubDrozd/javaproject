package Drugi.przyklady.WczytywanieDanych;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		String charNameString = "Veanty";

		Scanner scanner = new Scanner(System.in);

//		while (true) {
//			String imieString = scanner.nextLine();
//			if (imieString.isEmpty() || imieString.isBlank()) {
//				System.out.println("Cannot send empty message!");
//			}
//			System.out.println(charNameString + ": " + imieString);
//			
//			if (imieString.equals("/exit")) {
//				System.out.println("Exiting the chat...");
//				Thread.sleep(1000);
//				break;
//			}
//		}
		String liniaString;
//		do {
//			liniaString = scanner.nextLine();
//			System.out.println(charNameString + ": " + liniaString);
//		} while (!liniaString.equals("/exit"));
//		System.out.println("Exiting the chat...");

		while (!(liniaString = scanner.nextLine()).equals("/exit")) {
			System.out.println(charNameString + ": " + liniaString);
		}
		System.out.println("Exiting the chat...");
	}
}
