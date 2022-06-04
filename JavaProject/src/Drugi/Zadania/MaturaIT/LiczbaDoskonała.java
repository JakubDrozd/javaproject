package Drugi.Zadania.MaturaIT;

import java.util.Scanner;

public class LiczbaDoskona³a {

    public static boolean czyDoskonala(int a) {
	int suma = 0;
	for (int i = 1; i < a; i++) {
	    if (a % i == 0) {
		suma += i;
	    }
	}
	if (suma == a) {
	    return true;
	} else {
	    return false;
	}
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	System.out.println(czyDoskonala(number));

    }
}
