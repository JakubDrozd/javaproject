package Drugi.Zadania.Zadanie3;

public class Matma {
	public static final double liczbaPi = Math.PI; // Liczba PI

	public void obwodKola(int promienKola) {
		if (promienKola < 0) {
			throw new negativeRadiusException("Niepoprawny promien");
		}
		try {
			double wynik = 2 * liczbaPi * promienKola;
			System.out.println("Obwód koła o promieniu " + promienKola + " wynosi: " + wynik);
		} catch (negativeRadiusException e) {
			System.out.println(e.getMessage());
		}

	}

	public void poleKola(int promienKola) {
		double wynik = liczbaPi * Math.pow(promienKola, 2);
		System.out.println("Pole koła o promieniu " + promienKola + " wynosi: " + wynik);
	}

	public void obwodProstokata(int bokA, int bokB) {
		double wynik = (2 * bokA) + (2 * bokB);
		System.out.println("Obwod prostokata o boku " + bokA + " oraz " + bokB + " jest rowne: " + wynik);
	}

	public void poleProstokata(int bokA, int bokB) {
		double wynik = bokA * bokB;
		System.out.println("Pole prostokata o boku " + bokA + " oraz " + bokB + " jest rowne: " + wynik);
	}
}
