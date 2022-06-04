package Drugi.Zadania.Zadanie2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Test {
    public static void main(String[] args) {
        int[] tablica = {3,22,999,67,9,0,111,314};
        IntSummaryStatistics stat = Arrays.stream(tablica).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        System.out.println("Min: " + min + " Max: " + max);

    }
}
