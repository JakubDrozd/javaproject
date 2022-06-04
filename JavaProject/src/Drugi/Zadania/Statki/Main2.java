package Drugi.Zadania.Statki;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int size = scanner.nextInt();
	int[] tablica = new int[size];

	for (int i = 0; i < tablica.length; i++) {
	    tablica[i] = scanner.nextInt();
	}
	String tabliczkaString = Arrays.toString(tablica);
	if (tabliczkaString.contains(scanner.next())) {
	    System.out.println("true");
	} else {
	    System.out.println("false");
	}
	scanner.close();
    }

}
