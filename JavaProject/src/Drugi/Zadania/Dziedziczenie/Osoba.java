package Drugi.Zadania.Dziedziczenie;

public class Osoba {
    protected String imie;
    protected String nazwisko;

    protected Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    protected void przedstawSie() {
        System.out.printf("Jestem " + imie + " " + nazwisko);
    }
}
