package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordChanger {

    private String txt;

    final private String goodWord, badWord, directory, directory2;

    public WordChanger(String s1, String s2, String dir, String dir2) {
	goodWord = s1;
	badWord = s2;
	directory = dir;
	directory2 = dir2;
	loadFromFile();
	saveToFile();
    }

    private void loadFromFile() {

	txt = "";
	BufferedReader br;
	String line;
	try {
	    br = new BufferedReader(new FileReader(directory));
	    while ((line = br.readLine()) != null) {
		txt = txt + line.replace(badWord, goodWord) + '\n';
	    }
	    br.close();
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    private void saveToFile() {
	BufferedWriter bw;
	try {
	    bw = new BufferedWriter(new FileWriter(directory2));
	    bw.write(txt);
	    bw.flush();
	    bw.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void main(String[] args) {

	new WordChanger("nie", "tak", "c://tekst.txt", "c://tekst2.txt");

    }

}