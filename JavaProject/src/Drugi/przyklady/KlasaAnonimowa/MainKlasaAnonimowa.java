package Drugi.przyklady.KlasaAnonimowa;

import com.example.basics.oop.basics.inheritance.example1.SuperCar;

public class MainKlasaAnonimowa {
	public static void main(String[] args) {

		Klasa obiKlasa = new Klasa() {
			@Override
			public void Metoda() {
				System.out.println("Metoda anonimowa");
			}
		};
		obiKlasa.Metoda();
		Klasa zwyKlasa = new Klasa();
		metodaTu(new Button());
	}
	private static void metodaTu(Drugi.przyklady.KlasaAnonimowa.MainKlasaAnonimowa.Button button) {
		// TODO Auto-generated method stub
		
	}
	public void Button() {
		Button.onClick();
	}

	public static void metodaTu(Klasa parametr) {
		parametr.Metoda();
	}
	static class Button{
		public static void onClick() {
			System.out.println("Nacisnalem przycisk");
		}
	}
}
