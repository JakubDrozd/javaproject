package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("instrukcje2.txt")); // odczytujemy go za
											       // pomoca buffered
											       // readera
	String line = ""; // zmienna przechowujaca aktualny wiersz
	String result = ""; // zmienna przechowujaca wynik
	while ((line = bufferedReader.readLine()) != null) { // dopoki mamy co czytac
	    String arg[] = line.split(" "); // zczytujemy linie i dzielimy ja na komende i znak
	    String command = arg[0]; // pierwsza jest komenda
	    char c = arg[1].charAt(0); // drugi znak
	    if (command.equalsIgnoreCase("dopisz")) { // nastepnie rozpoznajemy typ komendy
		result = dopisz(result, c);
	    } else if (command.equalsIgnoreCase("zmien")) {
		result = zmien(result, c);
	    } else if (command.equalsIgnoreCase("usun")) {
		result = usun(result);
	    } else if (command.equalsIgnoreCase("przesun")) {
		result = przesun(result, c);
	    }
	}
	bufferedReader.close();
	System.out.println(result); // zwracamy wynik
    }

    static String dopisz(String txt, char c) { // funkcja dopisujaca znak na koncu tekstu
	return txt + c;
    }

    static String zmien(String txt, char c) { // funkcja podmieniajaca ostatni znak
	char[] chars = txt.toCharArray();
	chars[chars.length - 1] = c;
	return new String(chars);
    }

    static String usun(String txt) { // funkcja usuwajaca ostatni znak
	return txt.substring(0, txt.length() - 1);
    }

    static String przesun(String txt, char c) { // funkcja podmieniajaca pierwsze wystapienie znaku
	int t = txt.indexOf(c);
	if (t == -1) {
	    return txt;
	}
	if (c == 'Z') {
	    c = 'A';
	} else {
	    c++;
	}
	char[] chars = txt.toCharArray();
	chars[t] = c;
	return new String(chars);
    }
}
