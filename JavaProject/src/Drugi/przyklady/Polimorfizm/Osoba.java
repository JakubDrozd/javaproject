package Drugi.przyklady.Polimorfizm;

public class Osoba {
	private Zwierze zwierze;

	public void przygarnijZwierze(Zwierze zwierze) {
		this.zwierze = zwierze;
	}

	public void jakNazywaSieTwojeZwierzatko() {
		if (zwierze != null) {
			zwierze.przedstawSie();
		} else {
			System.out.println("Nie ma jeszcze zwierz¹tka");
		}
	}
}
