package Drugi.Zadania.Statki;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] pudloPierwsze = new int[3];
	for (int i = 0; i < pudloPierwsze.length; i++) {
	    pudloPierwsze[i] = scanner.nextInt();
	}
	Arrays.sort(pudloPierwsze);

	int[] pudloDrugie = new int[3];
	for (int i = 0; i < pudloDrugie.length; i++) {
	    pudloDrugie[i] = scanner.nextInt();
	}
	Arrays.sort(pudloDrugie);

	System.out.println(Arrays.toString(pudloPierwsze));
	System.out.println(Arrays.toString(pudloDrugie));

	boolean compareShort = pudloPierwsze[0] < pudloDrugie[0];
	boolean compareMedium = pudloPierwsze[1] < pudloDrugie[1];
	boolean compareLong = pudloPierwsze[2] < pudloDrugie[2];

	boolean compareShort2 = pudloPierwsze[0] > pudloDrugie[0];
	boolean compareMedium2 = pudloPierwsze[1] > pudloDrugie[1];
	boolean compareLong2 = pudloPierwsze[2] > pudloDrugie[2];

	if (compareShort && compareMedium && compareLong) {
	    System.out.println("Box 1 < Box 2");

	} else if (compareShort2 && compareMedium2 && compareLong2) {
	    System.out.println("Box 1 > Box 2");
	} else {
	    System.out.println("Incompatible");
	}
    }
}
