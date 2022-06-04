package Drugi.Zadania.MaturaIT;

import java.util.Scanner;

public class SitoErastotenesa {

    public static void sitoEratostenesa(int n) {
	boolean[] numbers = new boolean[n];
	for (int i = 2; i < n; i++) {
	    if (!numbers[i]) {
		System.out.println(i);
		for (int j = i + i; j < n; j += i) {
		    numbers[j] = true;
		}
	    }
	}
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	sitoEratostenesa(n);
	
    }
}
