package Drugi.przyklady.petle;

public class petlaWPetli {
    public static void main(String[] args) {
        int[][] tab = new int[5][10];
        int licznik = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                licznik++;
                tab[i][j] = licznik;

            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                //            System.out.print(tab[i][j] + " ");
                System.out.println("i = " + i + " " + "j = " + j);
            }
            System.out.println();
        }
    }
}
