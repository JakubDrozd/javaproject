package Drugi.Zadania.Zadanie2;

public class Main {
    public static void main(String[] args) {
        int[] tablica = {1,2,3,4,5,6,7,8,9,10,11,12};
        KlasaDoDrugiego tablicaObliczenia = new KlasaDoDrugiego(tablica);
        tablicaObliczenia.suma();
        tablicaObliczenia.srednia();
        tablicaObliczenia.min();
        tablicaObliczenia.max();
        tablicaObliczenia.printInfo();
    }
}
