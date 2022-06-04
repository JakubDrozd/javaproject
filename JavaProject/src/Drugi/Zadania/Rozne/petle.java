package Drugi.Zadania.Rozne;

public class petle {
    public static void main(String[] args) {
       //Zadanie 1


        //a)
        for (int i = 0; i <= 30; i++)
            System.out.println(i);

        //b)
        for (int i2 = 30; i2 >= 0; i2--) {
            System.out.println(i2);
        }


        //Zadanie 2
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        //Zadanie 4
        int[] tablica = new int[10];
        for (int i = 0; i <tablica.length; i++){
            tablica[i] = (int) (1 + Math.random() * (10-1));
            System.out.println(tablica[i]);
        }


        //Zadanie 3
        int a = 11;
        int b = 34;
        while (a <= b) {
            System.out.println(a++);
        }


 //Zadanie 5
        int[] tablica2 = new int[88];
        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = i;

        }
        int wynik = 0;
        for (int i = 0; i < tablica2.length; i++) {
            wynik = tablica2[i] + wynik;
        }
        System.out.println(wynik);

        //Zadanie 6

        int liczba = 5;
        int wynikSilnia = 1;
        for (int i = 1; i <= liczba; i++) {
            wynikSilnia = wynikSilnia * i;
        }
        System.out.println(wynikSilnia);

        //Zadanie 7
        int liczba2 = 144;
        int liczbaGwiazdek = 1;
        for (int i = 1; i <= liczba2; i++) {
            for (int j = 1; j <= liczbaGwiazdek; j++) {
                System.out.print("*");
            }
            System.out.println();
            liczbaGwiazdek++;
        }

        //Zadanie 8

        int liczba3 = 5;
        int liczbaGwiazdek3 = 1;
        int liczbaSpacji = liczba - 1;

        for (int i = 1; i <= liczba; i++) {
            for (int j = 1; j <=liczbaSpacji; j++){
                System.out.println(" ");
            }
            for (int j = 1; j <= liczbaGwiazdek3; j++){
                System.out.println("*");
            }
            System.out.println();
            liczbaSpacji--;
            liczbaGwiazdek3++;
        }
    }
}
