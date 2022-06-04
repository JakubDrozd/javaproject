package Drugi.Zadania.Zadanie2;


public class KlasaDoDrugiego {
    private int[] tablica;

    public KlasaDoDrugiego(int[] podajTablice) {
        tablica = podajTablice;
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = tablica[i] + suma;
        }
        return suma;
    }

    public int srednia() {
        return suma() / tablica.length;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        return min;
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }
    public void printInfo(){
        System.out.println("Suma: " + this.suma() + " Srednia: " + this.srednia() + " Min: " + this.min() + " Max: " + this.max());
    }
}


