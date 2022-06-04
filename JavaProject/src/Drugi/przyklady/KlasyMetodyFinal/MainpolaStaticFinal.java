package Drugi.przyklady.KlasyMetodyFinal;

import Drugi.przyklady.KlasyMetodyFinal.KlasaStaticFinal;

import static Drugi.przyklady.KlasyMetodyFinal.KlasaStaticFinal.*;

public class MainpolaStaticFinal {
    public static void main(String[] args) {
        KlasaStaticFinal obiekt = new KlasaStaticFinal();
        obiekt.pole = 22;

        poleStatic = 123;
        System.out.println("PoleStatic: " + poleStatic);
        metodaStatyczna();
        System.out.println(obiekt.poleFinal);
        double pi = Math.PI;
        System.out.println(pi);
        System.out.println(JAKIS_TEKST);
    }
}
