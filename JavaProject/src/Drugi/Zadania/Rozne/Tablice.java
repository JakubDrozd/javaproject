package Drugi.Zadania.Rozne;

public class Tablice {
    public static void main(String[] args) {
        //Zadanie 1
        int[] tablica = {1, 2, 3, 4, 5};
        System.out.println((tablica[0]) + tablica[1] + tablica[2] + tablica[3] + tablica[4]);


        //Zadanie 2
        double[][] tablica2d = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        double suma1rzedu = tablica2d[0][0] + tablica2d[0][1] + tablica2d[0][2] + tablica2d[0][3] + tablica2d[0][4];
        double suma2rzedu = tablica2d[1][0] + tablica2d[1][1] + tablica2d[1][2] + tablica2d[1][3] + tablica2d[1][4];
        double suma3rzedu = tablica2d[2][0] + tablica2d[2][1] + tablica2d[2][2] + tablica2d[2][3] + tablica2d[2][4];
        System.out.println("Pierwszy wiersz: " + suma1rzedu);
        System.out.println("Drugi wiersz: " + suma2rzedu);
        System.out.println("Trzeci wiersz: " + suma3rzedu);


        //Zadanie 3 : utwórz pustą tablice 3x8 i dodaj liczby 3 (1 kolumna 2 wiersz) i 7 (2 kolumna 1 wiersz)
        int[][] tabliczka = new int[3][8];
        tabliczka[1][0] = 10;
        tabliczka[0][1] = 59;
        System.out.println(tabliczka[1][0] + " " + tabliczka[0][1]);
        System.out.println(tabliczka[0].length + " " + tabliczka[1].length + " " + tabliczka[2].length);
    }
}