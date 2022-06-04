package Drugi.przyklady.petle;

public class PetlaFor {
    public static void main(String[] args) {

        int dlugoscPetli = 26;

        for (int i = 0; i < dlugoscPetli; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
