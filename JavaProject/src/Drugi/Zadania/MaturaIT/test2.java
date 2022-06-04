package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.text.TabableView;

import org.w3c.dom.ls.LSOutput;

public class test2 {

    public static boolean isPrime(int a) {
	if (a == 1) {
	    return false;
	}
	if (a == 2) {
	    return true;
	}
	for (int i = 2; i < a; i++) {
	    if (a % i == 0) {
		return false;
	    }

	}
	return true;
    }

    public static void goldbach(int a) {
	if (a < 4 || a % 2 == 1) {
	    return;
	}
	int mniejsza = 0;
	int wieksza = 0;
	for (int i = 3; i < a; i++) {
	    int roznica = a - i;
	    if (isPrime(i) && isPrime(roznica)) {
		wieksza = roznica;
		mniejsza = i;
	    }
	}
	System.out.println(a + ": " + mniejsza + " " + wieksza);
    }

    public static int potegowanie(int a, int n) {
	if (n == 0) {
	    return 1;
	}
	if (n == 1) {
	    return a;
	} else if (n % 2 == 0) {
	    int x = potegowanie(a, n / 2);
	    return x * x;
	} else {
	    return potegowanie(a, n - 1);
	}
    }

    public static int[] bubbleSort(int[] array) {
	boolean changed = false;
	for (int i = 0; i < array.length - 1; i++) {
	    int currentNumber = array[i];
	    int nextNumber = array[i + 1];
	    if (currentNumber > nextNumber) {
		array[i] = nextNumber;
		array[i + 1] = currentNumber;
		changed = true;
	    }
	}
	if (changed) {
	    return bubbleSort(array);
	}
	return array;
    }

    public static int potegowanie2(int a, int n) {
	if (n == 0) {
	    return 1;
	} else if (n == 1) {
	    return a;
	} else if (n % 2 == 0) {
	    int x = potegowanie2(a, n / 2);
	    return x * x;
	} else {
	    return potegowanie2(a, n - 1);
	}
    }

    public static void primeFactors(int a) {
	for (int i = 2; i < a; i++) {
	    while (a % i == 0) {
		System.out.print(i + " ");
		a = a / i;
	    }
	}
	if (a > 2) {
	    System.out.println(a);
	}
    }

    public static void isPerfect(int a) {
	int sum = 0;
	for (int i = 1; i < a; i++) {
	    if (a % i == 0) {
		sum += i;
	    }
	}
	if (sum == a) {
	    System.out.println("is Perfect");
	} else {
	    System.out.println("isn't Perfect");
	}
    }

    public static int gcd(int a, int b) {
	if (b == 0) {
	    return a;
	} else {
	    return gcd(b, a % b);
	}
    }

    public static int[] bubbleSort2(int[] array) {
	boolean changed = false;
	for (int i = 0; i < array.length - 1; i++) {
	    int currentNumber = array[i];
	    int nextNumber = array[i + 1];
	    if (currentNumber > nextNumber) {
		array[i] = nextNumber;
		array[i + 1] = currentNumber;
		changed = true;
	    }
	}
	if (changed) {
	    return bubbleSort(array);
	} else {
	    return array;
	}
    }

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("pary2.txt"));
	while (true) {
	    String temp = bufferedReader.readLine();
	    if (temp == null) {
		break;
	    }
	    String[] tablica = temp.split(" ");
	    int liczby = Integer.valueOf(tablica[0]);
	    goldbach(liczby);
	}
	System.out.println(potegowanie(3, 4));
	int[] array = { 5, 3, 3546, 6, 3, 99, 2, 1, 0 };
	bubbleSort2(array);
	System.out.println(Arrays.toString(array));
	System.out.println(isPrime(23));
	System.out.println(potegowanie2(3, 4));
	primeFactors(24);
	isPerfect(4);
	System.out.println(gcd(6, 36));

    }

}
