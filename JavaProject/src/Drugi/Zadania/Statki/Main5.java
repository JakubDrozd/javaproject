package Drugi.Zadania.Statki;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int size = scanner.nextInt();
	int[] tablica = new int[size];
	for (int i = 0; i < tablica.length; i++) {
	    tablica[i] = scanner.nextInt();
	}
	Arrays.sort(tablica);
	int n = scanner.nextInt();
	int suma = 0;
	for (int i = 0; i < tablica.length; i++) {
	    if (tablica[i] > n) {
		suma = suma + tablica[i];
	    }
	}
	System.out.println(suma);
	for (int i : tablica) {
	    
	}
    }
}
