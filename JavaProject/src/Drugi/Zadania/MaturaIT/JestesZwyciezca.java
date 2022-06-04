package Drugi.Zadania.MaturaIT;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JestesZwyciezca {

    public static void scalanieSortowanie(int[] tablica) {
    int dlugosc = tablica.length;
    if (dlugosc < 2) {
	return;
    }
    
    int srodek = dlugosc /2 ;
    int[] lewa = new int[srodek];
    int[] prawa = new int[dlugosc - srodek];
    for (int i = 0; i < srodek; i++) {
	lewa[i] = tablica[i];
    }
    for (int i = srodek; i < dlugosc; i++) {
	prawa[i - srodek] = tablica[i];
    }
    
    scalanieSortowanie(lewa);
    scalanieSortowanie(prawa);
    
}
    
    public static void scalanie(int[] lewa, int[] prawa) {
	int dlugoscLewa = lewa.length;
	int dlugoscPrawa = prawa.length;
	int i = 0;
	int j = 0;
	int k = 0;
	
    }

    public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(new FileReader("liczby2.txt"));
	int[] liczby = new int[520];
	int i = 0;
	while (scanner.hasNextInt()) {
	    int liczba = scanner.nextInt();
	    liczby[i++] = liczba;
	}
	
	System.out.println(liczby[liczby.length/2]);
    }
}
