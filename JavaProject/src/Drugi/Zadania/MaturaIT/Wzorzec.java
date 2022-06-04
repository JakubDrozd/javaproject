package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Wzorzec {

    public static void wzorzec(String text, String key) {
	String tekstNowyString = text.toLowerCase();
	int i = 0;
	while (i <= text.length() - key.length()) {
	    int j = 0;
	    while ((j < key.length()) && (key.charAt(j) == tekstNowyString.charAt(i + j))) {
		j++;
	    }
	    if (j == key.length()) {
		System.out.println(i + 1);
	    }
	    i++;
	}
    }

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("tekst.txt"));
	while (true) {
	    String temp = bufferedReader.readLine();
	    if (temp == null) {
		break;
	    }
	    wzorzec(temp, "i");
	}

    }
}
