package Drugi.przyklady.Polimorfizm;

public class Ko� extends Ssak {

	public Ko�(String nazwaString) {
		super(nazwaString);
	}

	@Override
	public void wydajDzwiek() {
		System.out.println("Ihahoo Ihahoo Ihahoo");

	}

	@Override
	public void przedstawSie() {
		System.out.println("Jestem konik i nazywam si� " + nazwaString);

	}

}
