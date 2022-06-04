package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class matura20181905 {

    public static int sum(int[] array) {
	int different = 0;
	for (int i = 0; i < array.length; i++) {
	    if (array[i] != 0) {
		different++;
	    }
	}
	return different;
    }

    public static int euklides(int a, int b) {
	if (b == 0) {
	    return a;
	} else {
	    return euklides(b, a % b);
	}
    }

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("sygnaly.txt"));
	String[] words = new String[1000];
	int i = 0;
	while (true) {
	    String temp = bufferedReader.readLine();
	    if (temp == null) {
		break;
	    }
	    words[i] = temp;
	    i++;
	}
	String message = "";
	for (int j = 0; j < 1000; j++) {
	    if ((j + 1) % 40 == 0) {
		message = message + words[j].charAt(9);
	    }
	}
	System.out.println(message);

	int[] differentLetters = new int[26];
	for (int x = 0; x < words.length; x++) {
	    String word = words[x];
	    for (int j : word.toCharArray()) {
		int letterIndex = (int) j % 65;
		differentLetters[letterIndex] += 1;
	    }
	    int differentLetterCount = sum(differentLetters);
	    if (differentLetterCount > differentLetterCount) {

	    }
	}
	System.out.println();
	System.out.println(euklides(250, 50));
    }
}
