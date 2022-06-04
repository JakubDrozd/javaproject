package Drugi.Zadania.Statki;

import java.util.Scanner;

class Main6 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String string = scanner.nextLine();
	string = "null".equals(string) ? null : string;
	/* Do not change code above */
	if (string == null) {
	    System.out.println("NPEI");
	} else {
	    System.out.println(string.toLowerCase());
	}

    }
}