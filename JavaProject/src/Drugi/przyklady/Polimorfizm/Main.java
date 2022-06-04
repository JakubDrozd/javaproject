package Drugi.przyklady.Polimorfizm;

public class Main {
	public static void main(String[] args) {
		Osoba osoba = new Osoba();
		Pies pies = new Pies("Reksio");
		Koñ koñ = new Koñ("Rafa³");
		osoba.przygarnijZwierze(koñ);
		osoba.jakNazywaSieTwojeZwierzatko();
	}
}
