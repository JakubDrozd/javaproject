package Drugi.przyklady.Interfejs;

public class MainInterfejs {
	public static void main(String[] args) {
		Ryba obieRyba = new Ryba();
		Ptak obiePtak = new Ptak();
		Ssak obieSsak = new Ssak();
		obieRyba.oddychanie();
		obieRyba.odzywanie();
		obieRyba.wydawaniePokolenia();
		
		System.out.println(" ");
		
		obiePtak.oddychanie();
		obiePtak.odzywanie();
		obiePtak.wydawaniePokolenia();
		
		System.out.println(" ");
		
		obieSsak.oddychanie();
		obieSsak.odzywanie();
		obieSsak.wydawaniePokolenia();
	}
}
