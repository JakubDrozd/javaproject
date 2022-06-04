package Drugi.Zadania.Wys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
	FileWriter fileWriter = new FileWriter("test.txt");
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	Integer wynik = dodawanie(13, 13);
	String wynikString = wynik.toString();
	bufferedWriter.write(wynikString);
	bufferedWriter.close();
    }

    public static int dodawanie(int liczba1, int liczba2) {
	return liczba1 + liczba2;
    }
}
