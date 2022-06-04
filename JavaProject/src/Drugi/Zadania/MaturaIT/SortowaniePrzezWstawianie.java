package Drugi.Zadania.MaturaIT;

import java.util.Random;

public class SortowaniePrzezWstawianie {

    public static void printArray(int[] tablica) {
	for (int i = 0; i < tablica.length; i++) {
	    System.out.print(tablica[i] + " ");
	}
    }

    public static void insertSort(int[] tablica) {

	for (int i = 1; i < tablica.length; i++) {

	    int currentNumber = tablica[i];
	    int j = i - 1;
	    while (j >= 0 && tablica[j] > currentNumber) {
		tablica[j + 1] = tablica[j];
		j--;
	    }
	    tablica[j + 1] = currentNumber;
	    
	}

    }

    public static void main(String[] args) {

	Random random = new Random();
	int[] tablica = new int[10];
	for (int i = 0; i < tablica.length; i++) {
	    tablica[i] = random.nextInt(100);
	}

	printArray(tablica);
	insertSort(tablica);
	System.out.println("\n");
	printArray(tablica);
    }
}
