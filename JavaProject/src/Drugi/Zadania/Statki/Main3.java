package Drugi.Zadania.Statki;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int size = scanner.nextInt();
	int[] tablica = new int[size];
	int count = 0;
	for (int i = 0; i < tablica.length; i++) {
	    tablica[i] = scanner.nextInt();
	}
	int n = scanner.nextInt();
	for (int liczba : tablica) {
	    if (liczba == n) {
		count++;
	    }
	}
	System.out.println(count);
    }
}
