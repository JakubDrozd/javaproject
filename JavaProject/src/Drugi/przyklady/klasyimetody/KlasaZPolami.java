package Drugi.przyklady.klasyimetody;

public class KlasaZPolami {
    int liczbaCalkowita;
    void zwrocWartoscPola(){
        System.out.println("Zwrócona wartosc pola " + liczbaCalkowita);
    }

    void ustawWartoscPola(int wartosc){
        liczbaCalkowita = wartosc;
        System.out.println("Zmieniona wartosc pola na:" + wartosc);
    }

    int zwrocWartoscPolaZMetody(){
        return liczbaCalkowita;
    }
}
