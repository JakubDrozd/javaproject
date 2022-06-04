package Drugi.przyklady.klasyimetody;

public class MainKonstruktor {
    public static void main(String[] args) {
        Konstruktor przykladPierwszy = new Konstruktor(22, 99, 1200);
        przykladPierwszy.info();

        KlasaDwa klasaDwa = new KlasaDwa();

        Konstruktor klasaKon = new Konstruktor();
        klasaKon.info();

        int[][] tablica = new int[5][5];
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                tablica[i][j] = (int) (1 + Math.random() * (100 - 1));
            }

        }
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                System.out.println(tablica[i][j]);
            }
            System.out.println();
        }
    }
}
