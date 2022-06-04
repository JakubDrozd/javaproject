package Drugi.przyklady.WyjatkiPrzenoszenie.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class WyjatekPrzenoszenie {
	public void wyjatkowaMetoda() throws FileNotFoundException {
		File file = new File("C:\\Users\\PATOX\\Desktop\\javasdasdasdatest.txt");
			InputStream inputStream = new FileInputStream(file);
	}
}
