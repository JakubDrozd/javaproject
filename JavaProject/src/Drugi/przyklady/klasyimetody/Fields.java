package Drugi.przyklady.klasyimetody;

public class Fields {
    public static void main(String[] args) {
        KlasaZPolami objekt = new KlasaZPolami();
        objekt.liczbaCalkowita = 15;
        System.out.println(objekt.liczbaCalkowita);
        objekt.zwrocWartoscPola();
        objekt.ustawWartoscPola(33);
        objekt.zwrocWartoscPola();
        objekt.ustawWartoscPola(8889);
        int zmienna = objekt.zwrocWartoscPolaZMetody();
        System.out.println("Zmienna: " + zmienna);
    }

    public static class KlasaMetody {

        void metodaNicNieZwracajaca() {
            System.out.println("Wartość wypisana z metody");
        }

        void metodaArgument(char b) {
            System.out.println("Wartość z metody " + 23);
        }

        void metodaNazewnictwa() {
            System.out.println("Nie pozwolono pokazać liczby");
        }

        int dodawanie() {
            int suma = 892 + 329;
            System.out.println("Suma podanych liczb: " + suma);
            return suma;
        }

        double dodawaniePoPrzecinsku(double liczbaDouble) {
            return liczbaDouble + 0.55;
        }

        boolean zamianaWartosciLogicznej() {
            return false;
        }

        int zwracanieWartosciLogicznej(boolean czyZwrocic, int liczba) {

            if (czyZwrocic) {
                return liczba;
            } else {
                return 0;
            }

        }

        void przykladKolejny() {
            System.out.println("Wartośc została zwrócona: ");
        }

        void zwracanko(boolean czyZakonczyc) {
            if (czyZakonczyc) {
                return;
            } else {
                System.out.println("Cos napisane bo nie zakonczne wartoscia logiczna");
            }
        }

    }
}
