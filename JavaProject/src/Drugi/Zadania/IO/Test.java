package Drugi.Zadania.IO;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
	String tekstString = "Jakub Drozd, Jakub ¯yznowski, Jakub Mrozinski.\n"
		+ "Jakub Miœ"; 
	Scanner scanner = new Scanner(System.in);
	String lineString = scanner.next();
	if (tekstString.contains(lineString)) {
	    System.out.println(tekstString);
	}else {
	    System.out.println("Nie znaleziono frazy");
	}
    }
    
}
