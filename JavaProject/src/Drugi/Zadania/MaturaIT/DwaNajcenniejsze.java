package Drugi.Zadania.MaturaIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DwaNajcenniejsze {

    public static int wyszukiwanieBinarne(int[] tablica, int klucz) {
	int lewo = 0;
	int prawo = tablica.length - 1;
	while (prawo < lewo) {
	    int srodek = (lewo + prawo + 1) / 2;
	    if (klucz < tablica[srodek]) {
		prawo = srodek - 1;
	    } else {
		lewo = srodek;
	    }
	}
	return tablica[lewo];
    }

    public static void main(String[] args) throws FileNotFoundException {
	Scanner scanner = new Scanner(new File("sport.txt"));
	int[] tablica = new int[2000];
	int i = 0;
	while (scanner.hasNextInt()) {
	    int nast = scanner.nextInt();
	    tablica[i++] = nast;
	}
	int[] buty = new int[1000];
	for (int j = 0; j < 1000; j++) {
	    buty[j] = tablica[j];

	}
	int[] pilki = new int[1000];
	for (int j = 1000; j < tablica.length; j++) {

	    pilki[j - 1000] = tablica[j];

	}
	int aktualnieNajlepszyZakup = 0;
	Arrays.sort(pilki);
	Arrays.sort(buty);
	for (int j : buty) {
	    int maxCena = 20000 - j;
	    int szukanie = wyszukiwanieBinarne(pilki, maxCena);
	    if (j + szukanie <= 20000) {
		System.out.println(j + szukanie);
		if (j + szukanie > aktualnieNajlepszyZakup) {

		    aktualnieNajlepszyZakup = j + szukanie;
		}

	    }
	}

	System.out.println(aktualnieNajlepszyZakup);
	System.out.println(pilki[999]);
	System.out.println(buty[999]);
    }
}
