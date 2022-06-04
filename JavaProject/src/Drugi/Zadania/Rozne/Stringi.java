package Drugi.Zadania.Rozne;

import java.util.Locale;

public class Stringi {
    public static void main(String[] args) {
        String jeden = "Jakub";
        String dwa = "Drozd";
        String trzy = "Jakub Drozd";

        // a)
        System.out.println("Imie: " + jeden.length());
        System.out.println("Nazwisko: " + dwa.length());
        System.out.println("Razem: " + trzy.length());

        // b)
        System.out.println("Czy imie to Alicja: " + jeden.equals("Alicja"));
        System.out.println("Czy imie to Jan: " + jeden.equals("Jan"));

        // c)
        System.out.println(dwa.toUpperCase(Locale.ROOT));

        // d)
        System.out.println(dwa.replace("a", "e"));

        //Zadanie 2
        String tekst = "Potrafię coraz więcej z programowania";
        for (int i = 0; i < tekst.length(); i++) {
            char znaczek = tekst.charAt(i);
            System.out.println(znaczek);
        }
        for (int i = tekst.length()-1; i >= 0; i--) {
            char znaczek2 = tekst.charAt(i);
            System.out.print(znaczek2);
        }
    }
}
