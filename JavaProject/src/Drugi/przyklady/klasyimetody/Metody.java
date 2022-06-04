package Drugi.przyklady.klasyimetody;

import Drugi.przyklady.klasyimetody.Fields;

public class Metody {
    public static void main(String[] args) {
        Fields.KlasaMetody objekt1 = new Fields.KlasaMetody();

        objekt1.metodaNicNieZwracajaca();

        objekt1.metodaArgument('b');

        objekt1.metodaNazewnictwa();

        int wynikDodawania = objekt1.dodawanie();
        System.out.println(wynikDodawania);


        double wynikDodwaanieDouble = objekt1.dodawaniePoPrzecinsku(3.14);
        System.out.println(wynikDodwaanieDouble);


        boolean metodaBoolean = objekt1.zamianaWartosciLogicznej();
        System.out.println(metodaBoolean);


        objekt1.przykladKolejny();

        objekt1.zwracanko(false);
    }
}
