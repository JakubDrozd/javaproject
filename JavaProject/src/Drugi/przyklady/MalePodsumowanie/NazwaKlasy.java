package Drugi.przyklady.MalePodsumowanie;

public class NazwaKlasy {
    public static final String NAZWA_STRING = "nazwa string";
    private String polePrywatneString = "prywatny tekst";
    int nazwaZmiennej = 55;

    public void nazwaMetodyVoid() {
        int nazwaZmiennej = 44;
        System.out.println("Wypisanie metody void");
        metodaZwracaInta(5);
        System.out.println(this.nazwaZmiennej);

        }


    public void drugaMetoda() {
        int nazwaZmiennej;
        System.out.println("Druga metoda");
    }

    private int metodaZwracaInta(int a) {
        return a;
    }
    private int metodaPrzyjmujeParametr(int a){
    return a;
    
    }
}