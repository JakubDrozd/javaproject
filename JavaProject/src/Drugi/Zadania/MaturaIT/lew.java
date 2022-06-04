package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lew {

    public static String dopisz(String text, char znak) {
	return text + znak;
    }

    public static String zmien(String text, char znak) {
	char[] znaki = text.toCharArray();
	znaki[znaki.length - 1] = znak;
	return new String(znaki);
    }

    public static String usun(String text, char znak) {
	return text.substring(0, text.length() - 1);
    }

    public static String przesun(String text, char znak) {
	int index = text.indexOf(znak);
	if (index == -1) {
	    return text;
	} else if (znak == 'Z') {
	    znak = 'A';
	} else {
	    znak++;
	}
	char[] letters = text.toCharArray();
	letters[index] = znak;
	return new String(letters);
    }

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("instrukcje2.txt"));
	String line = "";
	String result = "";
	while ((line = bufferedReader.readLine()) != null) {
	    String[] array = line.split(" ");
	    String command = array[0];
	    char znak = array[1].charAt(0);
	    if (command.equals("DOPISZ")) {
		result = dopisz(result, znak);
	    }
	    if (command.equals("ZMIEN")) {
		result = zmien(result, znak);
	    }
	    if (command.equals("USUN")) {
		result = usun(result, znak);
	    }
	    if (command.equals("PRZESUN")) {
		result = przesun(result, znak);
	    }
	}
	bufferedReader.close();
	System.out.println(result);
    }
}
