package Drugi.przyklady.petle;


public class PetlaWhile {
    public void main(String[] args) {
        int dlugoscPetli = 1;
        while (dlugoscPetli <= 10){
            System.out.println(dlugoscPetli);
            dlugoscPetli++;
        }
        dlugoscPetli = 6;
        do {
            System.out.println("Monger " + dlugoscPetli);
            dlugoscPetli++;
        }while (dlugoscPetli <= 5);
    }
}
