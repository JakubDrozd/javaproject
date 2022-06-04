package Drugi.Zadania.Wyjatki;

public class Zadanie2 {
	public static int podziel(int a, int b) throws dividingByZeroException {
		if (b == 0) {
			throw new dividingByZeroException();
		}
		int wynik = a / b;
		return wynik;
	}

	public static void main(String[] args) {
		try {
			System.out.println(podziel(28,2));
		} catch (dividingByZeroException e) {
			System.out.println("Nie mozna dzielic przez zero");
		}
	}
}
