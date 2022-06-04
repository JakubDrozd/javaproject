package Drugi.Zadania.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

	FileReader fileReader = new FileReader("fragmentIO.txt");
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	FileWriter fileWriter = new FileWriter("fragment-kopia.txt");
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

	Scanner scanner = new Scanner(System.in);
	String szukanaFrazaString = scanner.nextLine();

	boolean czyZawiera = false;
	String podpiString = "\n Kopia pliku zosta³a utworzona przez: Jakub Drozd";
	String lineString;
	int liczbaZnakow = 0;
	int numerLinii = 0;

	while ((lineString = bufferedReader.readLine()) != null) {
	    numerLinii++;
	    // a)
	    // System.out.println(lineString);
	    // b)
	    liczbaZnakow = liczbaZnakow + lineString.length();
	    // c i d)
	    if (lineString.toLowerCase().contains(szukanaFrazaString)) {
		System.out.println(numerLinii + ": " + lineString);
	    }
	    bufferedWriter.write(lineString + "\n");
	    
	}
	bufferedWriter.write(podpiString);
	System.out.println("Liczba znakow: " + liczbaZnakow);
	System.out.println("Czy zawiera: " + czyZawiera);
	bufferedReader.close();
	bufferedWriter.close();
    }
}
