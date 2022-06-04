package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class matura18052022 {

    public static char szyfrZnak(char znak, int key) {
	char znaczek = Character.toUpperCase(znak);
	key = key % 26;
	if (znaczek + key <= 90) {
	    return (char) (znaczek + key);
	} else {
	    return (char) (znaczek + key - 26);
	}
    }

    public static String szyfrujString(String text, int key) {
	String wynik = "";
	for (int i = 0; i < text.length(); i++) {
	    wynik += szyfrZnak(text.charAt(i), key);
	}
	return wynik;
    }

    public static char dekodujZnak(char znak, int klucz) {
	klucz = klucz % 26;
	char znaczek = Character.toUpperCase(znak);
	if (znaczek - klucz >= 65) {
	    return (char) (znaczek - klucz);
	} else {
	    return (char) (znaczek - klucz + 26);
	}
    }

    public static String odszyfrujString(String text, int klucz) {
	String wynikString = "";
	for (int i = 0; i < text.length(); i++) {
	    wynikString += dekodujZnak(text.charAt(i), klucz);
	}
	return wynikString;
    }

    public static int guessKey(String text, String text2) {
	int klucz = 0;
	char literka1 = text.charAt(0);
	char literka2 = text2.charAt(0);
	if (literka1 < literka2) {
	    klucz = literka2 - literka1;
	} else if (literka1 > literka2) {
	    klucz = 26 - (literka1 - literka2);
	}
	return klucz;
    }

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("dane_6_1.txt"));
	while (true) {
	    String temp = bufferedReader.readLine();
	    if (temp == null) {
		break;
	    }
	    System.out.println(szyfrujString(temp, 107));
	}

	BufferedReader bufferedReader2 = new BufferedReader(new FileReader("dane_6_2.txt"));
	while (true) {
	    String temp = bufferedReader2.readLine();
	    if (temp == null) {
		break;
	    }
	    String[] array = temp.split(" ");
	    String word = array[0];
	    int key = 0;
	    if (array.length > 1) {
		key = Integer.valueOf(array[1]);
	    }
	    System.out.println(odszyfrujString(word, key));
	}

	BufferedReader bufferedReader3 = new BufferedReader(new FileReader("dane_6_3.txt"));
	while (true) {
	    String temp = bufferedReader3.readLine();
	    if (temp == null) {
		break;
	    }
	    String[] array2 = temp.split(" ");
	    String word1 = array2[0];
	    String word2 = array2[1];
	    int klucz = guessKey(word1, word2);
	    String wordString = szyfrujString(word1, klucz);
	    if (!(word2.equals(wordString))) {
		System.out.println(word1);
	    }
	}
    }
}
