package Drugi.Zadania.MaturaIT;

import java.util.Scanner;

public class Euklidesa {

    public static int euclid(int a, int b) {
	if (b == 0) {
	    return a;

	} else {
	    return euclid(b, a % b);
	}
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	System.out.println(euclid(a, b));
    }
}
