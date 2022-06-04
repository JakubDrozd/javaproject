package Drugi.przyklady.Polimorfizm;

public class Pies extends Ssak {

	public Pies(String nazwaString) {
		super(nazwaString);
	}

	@Override
	public void wydajDzwiek() {
		System.out.println("Hau Hau");

	}

	@Override
	public void przedstawSie() {
		System.out.println("Jestem piesek i nazywam siê " + nazwaString);

	}

}
