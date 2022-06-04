package Drugi.przyklady.This;

public class KlasaRozszerzona extends KlasaPodstawowa {

	int x;
	int y;
	int z;
	int v;
	int pole;

	public KlasaRozszerzona() {
		System.out.println("Konstruktor z klasa rozszerzona");
	}

	public KlasaRozszerzona(int a) {
		x = a;
		System.out.println("Klasa rozszerzona z parametrem : " + a);
	}

	KlasaRozszerzona(int a, int b) {
		this(a);
		this.y = 22;
		System.out.println("Konstruktor z klasa rozszerzona z parametrami: " + a + " " + b);
	}

	void metodaZtejKlasy(int a, int b) {
		this.x = 222;
	}

	void metodaZParametrami(int pole) {
		this.pole = pole;
	}

}
