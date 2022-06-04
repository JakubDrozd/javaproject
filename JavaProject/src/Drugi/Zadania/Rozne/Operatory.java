package Drugi.Zadania.Rozne;

public class Operatory {
    public static void main(String[] args) {
        //Zadanie 1
        int wiek = 19;
        float wzrost = 1.78f;
        int waga = 52;
        System.out.println(wiek + " " + wzrost + " " + waga);

        //Zadanie 2
        int BMI = (int) (waga / Math.pow(wzrost, 2));
        System.out.println(BMI);

        //Zadanie 4
        int a = 38;
        System.out.println("Reszta z dzielenia przez 2: " + a % 2);
        System.out.println("Reszta z dzielenia przez 3: " + a % 3);
        System.out.println("Reszta z dzielenia przez 11: " + a % 11);

        //Zadanie 5
        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi = x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);

        //Zadanie 6
        int xe = 1000000000;
        int proba = 3 * xe;
        int naprawa = Integer.MAX_VALUE + proba;
        System.out.println(naprawa);
    }
}
