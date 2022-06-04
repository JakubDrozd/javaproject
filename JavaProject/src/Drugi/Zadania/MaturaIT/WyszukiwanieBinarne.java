package Drugi.Zadania.MaturaIT;

import java.util.Arrays;

public class WyszukiwanieBinarne {

    public static void wyszukiwanieBinarne(int[] tablica, int klucz) {
	int lewo = 1;
	int prawo = tablica.length;
	while (lewo < prawo) {
	    int srodek = (lewo + prawo) / 2;
	    if (tablica[srodek] < klucz) {
		lewo = srodek + 1;
	    } else {
		prawo = srodek;
	    }
	    if (tablica[lewo] == klucz) {
		int indeks = lewo;
		System.out.println(indeks);
	    }
	}
    }

    public static void main(String[] args) {
	int[] nowosc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 111, 23, 24 };
	Arrays.sort(nowosc);
	wyszukiwanieBinarne(nowosc, 24);
    }
}
