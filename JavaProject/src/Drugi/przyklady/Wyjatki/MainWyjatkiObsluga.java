package Drugi.przyklady.Wyjatki;

public class MainWyjatkiObsluga {
	static String str;
	static int[] tablica;

	public static void main(String[] args) {

//		try {
//			System.out.println("Przed wykonaniem");
//			System.out.println("Czy pusty: " + str.isEmpty());
//			System.out.println("Po wykonaniu");
//		} catch (NullPointerException exception) {
//			System.out.println("Nie utworzyles Stringa");
//		}
		tablica = new int[4];
		try {
			tablica[0] = 10;
			tablica[1] = 1345;
			tablica[2] = 303;
			tablica[3] = 404;
			System.out.println("Dane sa zgodne");
			System.out.println(tablica[0]);
			System.out.println(tablica[1]);
			System.out.println(tablica[2]);
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Blad tablicy.");
		}
		System.out.println("Na koniec wypisz to cos");
	}
}
