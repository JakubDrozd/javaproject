package Drugi.przyklady.klasyimetody;

public class KlasaObiektProsty {
    public static void main(String[] args) {
        int typProsty = 100;

        Przyklad przyklad = new Przyklad();
        przyklad.wypiszLiczbe(222);
        Przyklad przykladDrugi = new Przyklad();
        int polePrzykladu = przyklad.pole = 33;
        int polePrzykladuDrugiego = przykladDrugi.pole = 999;
        System.out.println("Pole przykladu pierwszego: " + polePrzykladu);
        System.out.println("Pole przykladu drugiego: " + polePrzykladuDrugiego);
    }
}
