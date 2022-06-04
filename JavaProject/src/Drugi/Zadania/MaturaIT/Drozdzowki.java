package Drugi.Zadania.MaturaIT;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Drozdzowki {

    public static String wyszukiwanieBinarne(int[] tablica, int klucz) {
	int lewo = 0;
	int prawo = tablica.length - 1;
	while (lewo < prawo) {
	    int srodek = (prawo + lewo) / 2;
	    if (klucz >= tablica[srodek]) {
		prawo = srodek;
	    } else if (klucz < tablica[srodek]) {
		lewo = srodek + 1;
	    }
	}
	int[] jd = { lewo + 1, tablica[lewo] };
	return Arrays.toString(jd);
    }

    public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(new File("drozdzowki.txt"));
	int[] tablica = new int[10000];
	int i = 0;
	while (scanner.hasNextInt()) {
	    int siema = scanner.nextInt();
	    tablica[i++] = siema;
	}
	System.out.println(Arrays.toString(tablica));
	System.out.println(wyszukiwanieBinarne(tablica, 50000));
    }
}
