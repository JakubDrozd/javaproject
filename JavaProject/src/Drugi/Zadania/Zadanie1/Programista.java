package Drugi.Zadania.Zadanie1;

public class Programista {
    private String imie;
    private String nazwisko;
    private String jezyk;
    private float zarobki;

    public Programista(String podajImie, String podajNazwisko, String podajJezyk, float podajZarobki) {
        imie = podajImie;
        nazwisko = podajNazwisko;
        jezyk = podajJezyk;
        zarobki = podajZarobki;
    }

    public void pobierzImie() {
        System.out.println(this.imie);
    }

    public void pobierzNazwisko() {
        System.out.println(this.nazwisko);
    }

    public void pobierzJezyk() {
        System.out.println(this.jezyk);
    }

    public void pobierzWynagrodzenie() {
        System.out.println(this.zarobki);
    }

}
