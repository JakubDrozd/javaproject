package Drugi.Zadania.MaturaIT;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.w3c.dom.Text;

public class Playground {

    public static void isPrime(int a) {
	boolean flag = false;
	for (int i = 2; i <= a / 2; i++) {
	    if (a % i == 0) {
		flag = true;
		break;
	    }
	}
	if (!flag) {
	    System.out.println("is Prime");
	} else {
	    System.out.println("isn't Prime");
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
	} else {
	    return array;
	}
    }

    public static int euclid(int a, int b) {
	if (b == 0) {
	    return a;
	} else {
	    return euclid(b, a % b);
	}
    }

    public static double f(double x) {
	return Math.pow(x, 3) - 4 * Math.pow(x, 2) + 6 * x - 24;
    }

    public static double miejsceZerowe(double epsilon) {
	double a = -16;
	double b = 16;
	double c = 0;
	while (Math.abs(b - a) > epsilon) {
	    c = (a + b) / 2;
	    if (f(c) > 0) {
		b = c;
	    } else {
		a = c;
	    }
	}
	return c;
    }

    public static int toPower(int a, int n) {
	if (n == 0) {
	    return 1;
	}
	if (n == 1) {
	    return a;
	}
	if (n % 2 == 0) {
	    int x = toPower(a, n / 2);
	    return x * x;
	}
	return a * toPower(a, n - 1);
    }

    public static boolean isPalindrome(String text) {
	for (int i = 0; i < text.length() / 2; i++) {
	    if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
		return false;
	    }
	}
	return true;
    }

    public static void isAnagram(String textOne, String textTwo) {
	char[] arrayOne = textOne.toCharArray();
	char[] arrayTwo = textTwo.toCharArray();
	Arrays.sort(arrayOne);
	Arrays.sort(arrayTwo);
	if (Arrays.equals(arrayOne, arrayTwo)) {
	    System.out.println("is Anagram");
	} else {
	    System.out.println("isn't Anagram");
	}
    }

    public static void patternSearch(String text, String key) {
	for (int i = 0; i <= text.length() - key.length(); i++) {
	    int j;
	    for (j = 0; j < key.length(); j++) {
		if (text.charAt(i + j) != key.charAt(j)) {
		    break;
		}
	    }
	    if (j == key.length()) {
		System.out.println(i);
	    }
	}
    }

    public static void primeNumber(int a) {
	boolean flag = false;
	for (int i = 2; i < a / 2; i++) {
	    if (a % i == 0) {
		flag = true;
		break;
	    }
	}
	if (!flag) {
	    System.out.println("is Prime");
	} else {
	    System.out.println("isn't Prime");
	}
    }

    public static void main(String[] args) {
	isPrime(24);
	isPerfect(496);
	primeFactors(24);
	int[] array = { 5, 1, 34, 2, 8, 7, 4, 4, 3, 0, 324 };
	bubbleSort(array);
	System.out.println(Arrays.toString(array));
	System.out.println(euclid(220, 112));
	System.out.println(miejsceZerowe(0.1));
	System.out.println(toPower(2, 10));
	System.out.println(isPalindrome("kajak"));
	isAnagram("estrngi", "stinger");
	patternSearch("Jeden dwa trzy cztery dwa dwa jeden siedem dwa", "dwa");
	primeNumber(5);

    }
}
