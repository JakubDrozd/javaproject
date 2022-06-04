package Drugi.przyklady.ZapisywaniePlikow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
	try {
	    FileWriter fileWriter = new FileWriter("C:\\Users\\PATOX\\eclipse-workspace\\JavaProject\\test.txt", true);
	    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	    bufferedWriter.write("???\n");
	    bufferedWriter.write("Kolejne teksty i kolejne\n");
	    bufferedWriter.write("jeszcze druga\n");
	    bufferedWriter.close();
	} catch (IOException e) {
	    System.out.println("B³¹d");
	}
    }
}
