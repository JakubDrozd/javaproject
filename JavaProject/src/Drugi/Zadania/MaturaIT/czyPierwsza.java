package Drugi.Zadania.MaturaIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class czyPierwsza {

    public static void czyPierwsza(int a) {
	boolean flaga = true;
	int i = 0;
	for (i = 2; (i * i) <= a; i++) {
	    if (a % i == 0) {
		System.out.println("NIE");
		flaga = false;
		break;
	    }
	}
	if (flaga) {
	    System.out.println("TAK");
	}
    }

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("liczby.txt"));
	String lineString;
	while ((lineString = bufferedReader.readLine()) != null) {
	    Integer podmiankaInteger = Integer.parseInt(lineString);
	    czyPierwsza(podmiankaInteger);
	}
	bufferedReader.close();
    }
}
