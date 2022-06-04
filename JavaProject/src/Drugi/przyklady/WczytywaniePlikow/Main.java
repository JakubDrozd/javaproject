package Drugi.przyklady.WczytywaniePlikow;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);
	int dlugosc = scanner.nextInt();
	int[] tablica = new int[dlugosc];
	for (int i = 0; i < tablica.length; i++) {
	    tablica[i] = scanner.nextInt();
	}
	for (int i = 0; i < tablica.length; i++) {
	    System.out.print(tablica[i] + " ");
	}
    }
}
