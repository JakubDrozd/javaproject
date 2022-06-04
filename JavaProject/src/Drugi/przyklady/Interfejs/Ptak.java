package Drugi.przyklady.Interfejs;

public class Ptak implements Zwierze {

	@Override
	public void oddychanie() {
		System.out.println("Pluca");

	}

	@Override
	public void odzywanie() {
		System.out.println("Robaki");

	}

	@Override
	public void wydawaniePokolenia() {
		System.out.println("Jajko");

	}

}
