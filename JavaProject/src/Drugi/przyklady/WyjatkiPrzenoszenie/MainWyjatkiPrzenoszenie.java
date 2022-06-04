package Drugi.przyklady.WyjatkiPrzenoszenie;

import java.io.FileNotFoundException;

public class MainWyjatkiPrzenoszenie {
	public static void main(String[] args) {
		WyjatekPrzenoszenie obiekt = new WyjatekPrzenoszenie();
		try {
			obiekt.wyjatkowaMetoda();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
