package Drugi.Zadania.MaturaIT;

import java.util.Scanner;

public class PotegowanieMain {

    public static int potegowanie(int a, int b) {
	int wynik = 1;
	for (int i = 0; i < b; i++) {
	    wynik = wynik * a;
	}
	return wynik;
    }

    public static int potegowanie2(int a, int n) {
	if (n == 0) {
	    return 1;
	} else if (n % 2 == 0) {
	    int x = potegowanie2(a, n / 2);
	    return x * x;
	} else {
	    return a * potegowanie2(a, n - 1);
	}
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int liczba = scanner.nextInt();
	int potega = scanner.nextInt();
	System.out.println(potegowanie2(liczba, potega));
    }
}
