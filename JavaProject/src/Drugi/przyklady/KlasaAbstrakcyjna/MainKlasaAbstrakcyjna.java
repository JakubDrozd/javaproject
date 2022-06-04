package Drugi.przyklady.KlasaAbstrakcyjna;

public class MainKlasaAbstrakcyjna {
	public static void main(String[] args) {
		KlasaZwykla obieZwykla = new KlasaZwykla();
		obieZwykla.metodaAbstrakcyjna();
		obieZwykla.metodaAbstrakcyjnaDwa(122);
		obieZwykla.jakasMetoda();
		
		Pies pies = new Pies();
		Kot kot = new Kot();
		Konik konik = new Konik();
		pies.wydajDzwiek();
		pies.przemieszczanieSie();
		pies.karmieniePotomstwa();
		pies.podajIloscKonczyn();
		pies.temperaturaCiala();
		
		System.out.println(" ");
		System.out.println(" ");
		
		konik.wydajDzwiek();
		konik.przemieszczanieSie();
		konik.karmieniePotomstwa();
		konik.podajIloscKonczyn();
		konik.temperaturaCiala();
	}
}
