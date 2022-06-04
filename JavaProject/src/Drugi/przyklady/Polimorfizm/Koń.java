package Drugi.przyklady.Polimorfizm;

public class Koñ extends Ssak {

	public Koñ(String nazwaString) {
		super(nazwaString);
	}

	@Override
	public void wydajDzwiek() {
		System.out.println("Ihahoo Ihahoo Ihahoo");

	}

	@Override
	public void przedstawSie() {
		System.out.println("Jestem konik i nazywam siê " + nazwaString);

	}

}
