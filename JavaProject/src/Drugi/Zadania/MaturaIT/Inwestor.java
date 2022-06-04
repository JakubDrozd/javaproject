package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Inwestor {

    public static String dopisz(String text, char c) {
	return text + c;
    }

    public static String zmienString(String text, char c) {
	char[] chars = text.toCharArray();
	chars[chars.length - 1] = c;
	return new String(chars);
    }

    public static String usun(String text) {
	return text.substring(0, text.length() - 1);
    }

    public static String przesun(String text, char c) {
	int i = text.indexOf(c);
	if (i == -1) {
	    return text;
	}
	if (c == 'Z') {
	    c = 'A';
	} else {
	    c++;
	}
	char[] chars = text.toCharArray();
	chars[i] = c;
	return new String(chars);
    }

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("instrukcje.txt"));
	String lineString = "";
	String wynikString = "";
	while ((lineString = bufferedReader.readLine()) != null) {
	    String[] arg = lineString.split(" ");
	    String commandString = arg[0];
	    char c = arg[1].charAt(0);
	}

    }
}
