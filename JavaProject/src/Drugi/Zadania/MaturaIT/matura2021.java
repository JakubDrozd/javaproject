package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class matura2021 {

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("instrukcje2.txt"));
	String lineString = ""; // aktualny wiersz
	String resultString = ""; // wynik
	int najwiekszaDlugoscCiagu = -1;
	String najdluzszaKomenda = "";
	String aktualnaKomenda = "";
	int dlugoscCiagu = 0;
	while ((lineString = bufferedReader.readLine()) != null) {
	    String[] tablica = lineString.split(" ");
	    String commandString = tablica[0];
	    char literka = tablica[1].charAt(0);
	    if (aktualnaKomenda.isEmpty()) {
		aktualnaKomenda = commandString;
	    }
	    if (!aktualnaKomenda.equals(commandString)) {
		if (najwiekszaDlugoscCiagu < dlugoscCiagu) {
		   najwiekszaDlugoscCiagu = dlugoscCiagu;
		   najdluzszaKomenda = commandString;
		}
		aktualnaKomenda = commandString;
		dlugoscCiagu = 1;
	    }else {
		dlugoscCiagu++;
	    }
	    
	    if (commandString.equalsIgnoreCase("dopisz")) {
		resultString = dopisz(resultString, literka);

	    } else if (commandString.equalsIgnoreCase("zmien")) {
		resultString = zmien(resultString, literka);
	    } else if (commandString.equalsIgnoreCase("usun")) {
		resultString = usun(resultString);
	    } else if (commandString.equalsIgnoreCase("przesun")) {
		resultString = przesun(resultString, literka);

	    }

	}
	System.out.println(resultString);
	bufferedReader.close();
	System.out.println(resultString.length());
	System.out.println(najdluzszaKomenda + " " + najwiekszaDlugoscCiagu);
    }

    public static String dopisz(String tekst, char znak) {
	return tekst + znak;
    }

    public static String zmien(String tekString, char znak) {
	char[] slowoNaLiterki = tekString.toCharArray();
	slowoNaLiterki[slowoNaLiterki.length - 1] = znak;
	return new String(slowoNaLiterki);
    }

    public static String usun(String tekString) {
	return tekString.substring(0, tekString.length() - 1);
    }

    public static String przesun(String tekString, char znak) {
	int i = tekString.indexOf(znak);
	if (i == -1) {
	    return tekString;
	}
	if (znak == 'Z') {
	    znak = 'A';
	} else {
	    znak++;
	}
	char[] slowoNaLiterki = tekString.toCharArray();
	slowoNaLiterki[i] = znak;
	return new String(slowoNaLiterki);
    }
}
