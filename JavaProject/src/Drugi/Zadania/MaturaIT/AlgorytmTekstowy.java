package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AlgorytmTekstowy {

    public static int znajdz(String tekString, String kluczString) {
	int licznik = 0;
	for (int i = 0; i < tekString.length() - kluczString.length() -1; i++) {
	    String jakiString = tekString.substring(i, i + kluczString.length());
	    if (jakiString.equals(kluczString)) {
		licznik++;
	    }
	}
	return licznik;
    }

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("tekst.txt"));
	String[] linijaStrings = new String[2];
	int i = 0;
	while (true) {
	    String losowString = bufferedReader.readLine();
	    if (losowString == null) {
		break;
	    }
	    linijaStrings[i] = losowString;
	    i++;
	}
	String przykaldString = "12345678";
	System.out.println(znajdz(linijaStrings[0], linijaStrings[1]));
    }
}
