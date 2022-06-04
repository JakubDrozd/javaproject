package Drugi.przyklady.Interfejs;

public class Ssak implements Zwierze {

	@Override
	public void oddychanie() {
		System.out.println("Pluca");
	}

	@Override
	public void odzywanie() {
		System.out.println("Roslinki badz miesko");

	}

	@Override
	public void wydawaniePokolenia() {
		System.out.println("Plod");
	}

}
