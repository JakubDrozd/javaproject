package Drugi.przyklady.petle;



public class PetleTablice {

    public static void main(String[] args) {
        int[] tab = new int[31];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (1 + (Math.random() * (10-1)));

        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }


}
