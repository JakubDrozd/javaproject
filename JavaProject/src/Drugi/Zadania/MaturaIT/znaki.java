package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class znaki {

    public static void main(String[] args) throws IOException {

	String[] tablicaStrings = new String[1000];

	BufferedReader bufferedReader = new BufferedReader(new FileReader("przyklad.txt"));
	String lineString;
	int cyfry = 0;
	int i = 0;
	while ((lineString = bufferedReader.readLine()) != null) {

	    tablicaStrings[i++] = lineString;
	}

	for (int j = 0; j < tablicaStrings.length; j++) {
	    for (char znak : tablicaStrings[j].toCharArray()) {
		if (Character.isDigit(znak)) {
		    cyfry++;
		}
	    }
	}

	int wiersz = 0;
	String kluczString = "";
	for (int j = 0; j < tablicaStrings.length; j++) {
	    if ((j + 1) % 20 == 0) {
		char literka = tablicaStrings[j].charAt(wiersz);
		kluczString += literka;
		wiersz++;
	    }
	}

	String hasloString = "";

	for (int j = 0; j < tablicaStrings.length; j++) {

	    String napisString = tablicaStrings[j];
	    String pierwsza = napisString + napisString.charAt(0);
	    StringBuilder nowyBuilder = new StringBuilder(pierwsza).reverse();
	    String pierwszareverseString = nowyBuilder.toString();
	    String drugaString = napisString.charAt(napisString.length() - 1) + napisString;
	    StringBuilder nowyBuilder2 = new StringBuilder(drugaString).reverse();
	    String drugareverseString = nowyBuilder2.toString();
	    if (pierwsza.equals(pierwszareverseString)) {
		hasloString += (pierwszareverseString.charAt((int) ((pierwszareverseString.length() - 1) / 2)));
	    }
	    if (drugaString.equals(drugareverseString)) {
		hasloString += (drugareverseString.charAt((int) ((drugareverseString.length() - 1) / 2)));

	    }
	}
	String hasloString2 = "";
	for (int j = 0; j < tablicaStrings.length; j++) {
	    List<Character> znaczkiCharacters = new ArrayList<Character>();
	    String napisString = tablicaStrings[j];

	    for (char znak : napisString.toCharArray()) {
		int ascii = (int) znak;
		if (Character.isDigit(znak)) {
		    znaczkiCharacters.add(znak);
		}
	    }
	    if (znaczkiCharacters.toArray().length % 2 == 1) {
		znaczkiCharacters.remove(znaczkiCharacters.toArray().length - 1);
	    }

	    for (int k = 1; k < znaczkiCharacters.size(); k += 2) {
		if (hasloString2.endsWith("XXX")) {
		    break;
		}
		int a = Character.getNumericValue(znaczkiCharacters.get(k - 1));
		int b = Character.getNumericValue(znaczkiCharacters.get(k));
		String liczbaString = String.valueOf(a) + String.valueOf(b);
		int liczba = Integer.parseInt(liczbaString);
		if (liczba > 90 || liczba < 65) {
		    continue;
		}
		hasloString2 += (char) liczba;
	    }

	}

	System.out.println(kluczString);
	System.out.println(cyfry);
	bufferedReader.close();
	System.out.println(hasloString);
	System.out.println(hasloString2);
    }
}
