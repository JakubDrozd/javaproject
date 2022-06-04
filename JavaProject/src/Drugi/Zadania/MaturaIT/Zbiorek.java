package Drugi.Zadania.MaturaIT;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zbiorek {

    public static boolean anagram(String tekst1, String tekst2) {
	String nowytekst1 = tekst1.toLowerCase().replace(" ", "");
	String nowytekst2 = tekst2.toLowerCase().replace(" ", "");
	char[] znaki1 = nowytekst1.toCharArray();
	char[] znaki2 = nowytekst2.toCharArray();
	Arrays.sort(znaki1);
	Arrays.sort(znaki2);
	if (Arrays.equals(znaki1, znaki2)) {
	    return true;
	}
	return false;
    }

    static Map<Integer, BigInteger> results = new HashMap<>();

    public static BigInteger fibonacci(int n) {
	if (n == 0) {
	    return BigInteger.ZERO;

	}
	if (n == 1) {
	    return BigInteger.ONE;

	}
	if (results.containsKey(n)) {
	    return results.get(n);
	}
	BigInteger wynikBigInteger = fibonacci(n - 1).add(fibonacci(n - 2));
	results.put(n, wynikBigInteger);
	return wynikBigInteger;
    }

    public static int potegowanie(int a, int n) {
	if (n == 0) {
	    return 1;
	}
	if (n % 2 == 0) {
	    int x = potegowanie(a, n / 2);
	    return x * x;
	} else {
	    return a * potegowanie(a, n - 1);
	}
    }

    public static void czynnikiPierwsze(int a) {
	int p = 2;
	while (a > 1) {
	    if (a % p == 0) {
		a = a / p;
		System.out.println(p);
	    } else {
		p++;
	    }
	}
    }

    static boolean isPalindrome(String s) {

	for (int i = 0; i < s.length() / 2; i++) {
	    if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
		return false;
	    }
	}
	return true;
    }

    public static void czyPierwsza(int a) {
	boolean flaga = true;
	int i = 0;
	for (i = 2; (i * i) <= a; i++) {
	    if (a % i == 0) {
		System.out.println("NIE");
		flaga = false;
		break;
	    }
	}
	if (flaga) {
	    System.out.println("TAK");
	}
    }

    public static void zamiana(int n) {
	int index = 0;
	int[] t = new int[32];
	while (n > 0) {
	    t[index++] = n % 2;
	    n = n / 2;
	}
	for (int i = index - 1; i >= 0; i--) {
	    System.out.print(t[i]);
	}
    }

    public static boolean czyDoskonala(int a) {
	int suma = 0;
	for (int i = 1; i < a; i++) {
	    if (a % i == 0) {
		suma += i;
	    }
	}
	if (suma == a) {
	    return true;
	} else {
	    return false;
	}
    }

    List<Integer> lista = new ArrayList<Integer>();

    public static void main(String[] args) {
	int[] tablica = { 10, 12, 345, 367, 345 };
	System.out.println(Arrays.toString(tablica));
	
	for (int i = 1; i <= 50; i++) {
	    System.out.println(i + ": " + fibonacci(i));
	}
	System.out.println(potegowanie(3, 4));
	czynnikiPierwsze(220);
	System.out.println(isPalindrome("kajak"));
	czyPierwsza(23);
    }
}
