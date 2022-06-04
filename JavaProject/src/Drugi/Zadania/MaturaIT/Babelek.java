package Drugi.Zadania.MaturaIT;

import java.util.Arrays;

public class Babelek {

    private static int[] sortowanieBabelkowe(int[] tablica) {
	boolean changed = false;
	for (int i = 0; i < tablica.length - 1; i++) {

	    int currentNumber = tablica[i];
	    int nextNumber = tablica[i + 1];
	    if (currentNumber > nextNumber) {
		tablica[i] = nextNumber;
		tablica[i + 1] = currentNumber;
		changed = true;
	    }
	}
	if (changed) {
	    return sortowanieBabelkowe(tablica);
	} else {
	    return tablica;
	}
    }

    public static void main(String[] args) {
	int[] tablica = { 1, 2, 3, 4, 6, 7, 83, 32, 12, 3123, 3456, 7 };
	sortowanieBabelkowe(tablica);
	System.out.println(Arrays.toString(tablica));
    }
}
