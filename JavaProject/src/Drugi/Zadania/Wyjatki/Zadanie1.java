package Drugi.Zadania.Wyjatki;

public class Zadanie1 {
	public static void main(String[] args) {
		int a = 24;
		int b = 2;
		try {
			int wynik = a / b;
			System.out.println("Wynik: " + wynik);
		} catch (ArithmeticException e) {
			System.out.println("Nie mozna podzieliæ przez 0");
		}

	}
}
