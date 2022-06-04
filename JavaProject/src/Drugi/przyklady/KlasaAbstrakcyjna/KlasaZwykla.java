package Drugi.przyklady.KlasaAbstrakcyjna;

public class KlasaZwykla extends PrzykladowaKlasaAbstrakcyjna {

	@Override
	public void metodaAbstrakcyjna() {
		System.out.println("Wypisalem z klasy zwyklej");

	}

	@Override
	public int metodaAbstrakcyjnaDwa(int a) {
		System.out.println("Wypisuje parametr: " + a);
		return 101;
	}

}
