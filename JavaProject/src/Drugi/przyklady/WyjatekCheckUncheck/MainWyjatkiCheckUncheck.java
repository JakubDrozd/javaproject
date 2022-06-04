package Drugi.przyklady.WyjatekCheckUncheck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainWyjatkiCheckUncheck {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\PATOX\\Desktop\\javatest.txt");
		try {
			InputStream inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("Wow nie ma takiego pliku");
			e.printStackTrace();
		}
	}
}
