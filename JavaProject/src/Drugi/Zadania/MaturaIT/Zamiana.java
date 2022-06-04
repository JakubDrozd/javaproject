package Drugi.Zadania.MaturaIT;

public class Zamiana {

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

    public static void main(String[] args) {
	zamiana(100);
    }
}
