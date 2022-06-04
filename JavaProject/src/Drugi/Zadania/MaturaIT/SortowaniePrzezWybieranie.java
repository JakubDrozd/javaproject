package Drugi.Zadania.MaturaIT;

import java.util.Arrays;

public class SortowaniePrzezWybieranie {

    public static void swap(int[] tablica, int lewo, int prawo) {
	int temp = tablica[lewo];
	tablica[lewo] = tablica[prawo];
	tablica[prawo] = temp;
    }

    public static void selectSort(int[] tablica) {
	int min;
	for (int i = 0; i < tablica.length - 1; i++) {
	    min = i;
	    for (int j = i + 1; j < tablica.length; j++) {
		if (tablica[j] < tablica[min]) {
		    min = j;
		}
	    }
	    if (min != i) {
		swap(tablica, i, min);
	    }
	}
    }

    public static void main(String[] args) {
	int[] jd = { 5, 4, 3, 2, 1 };
	selectSort(jd);
	System.out.println(Arrays.toString(jd));
    }
}
