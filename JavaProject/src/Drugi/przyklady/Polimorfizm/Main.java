package Drugi.przyklady.Polimorfizm;

public class Main {
	public static void main(String[] args) {
		Osoba osoba = new Osoba();
		Pies pies = new Pies("Reksio");
		Ko� ko� = new Ko�("Rafa�");
		osoba.przygarnijZwierze(ko�);
		osoba.jakNazywaSieTwojeZwierzatko();
	}
}
