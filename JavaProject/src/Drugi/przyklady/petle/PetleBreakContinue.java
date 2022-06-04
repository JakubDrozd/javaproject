package Drugi.przyklady.petle;

public class PetleBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Wartość: " + i);
            if (i == 3) {
                break;
            }
        }
        for (int i = 0; i < 4; i++){
            System.out.println("Druga pętla: " + i);
        }
    }
}
