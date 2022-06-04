package Drugi.przyklady.KlasaAbstrakcyjna.copy;

public abstract class Ssak {
	public void karmieniePotomstwa() {
		System.out.println("Karmie mlekiem");
	}

	public void temperaturaCiala() {
		System.out.println("Moja temperatura ciala jest stala");
	}

	public void podajIloscKonczyn() {
		System.out.println("Mam 4 konczyny");
	}
	public abstract void wydajDzwiek();
	
	public abstract void przemieszczanieSie();
}