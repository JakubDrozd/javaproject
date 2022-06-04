package Drugi.przyklady.RzutowanieObiektow;

public class MainRzutowanieObiektow {
	public static void main(String[] args) {
		KlasaRozszerzona obiektRozszerzony = new KlasaRozszerzona();
		obiektRozszerzony.metodaRozszerzona();
		obiektRozszerzony.ustawLiczba(999);
		obiektRozszerzony.wyswietlLiczbe();

		KlasaPodstawowa klasaPodstawowa = obiektRozszerzony;
		klasaPodstawowa.wyswietlLiczbe();
		Object object = obiektRozszerzony;
		obiektRozszerzony.wyswietlLiczbe();
		obiektRozszerzony.toString();
		obiektRozszerzony.ustawLiczba(123123);
		obiektRozszerzony.wyswietlLiczbe();
	}

}
