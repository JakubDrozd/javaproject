package Drugi.Zadania.Wys;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
	FileReader fileReader = new FileReader("fragmentIO.txt");
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	String lineString;
	while ((lineString = bufferedReader.readLine()) != null) {
	    System.out.println(lineString);

	}
	bufferedReader.close();
    }
}
