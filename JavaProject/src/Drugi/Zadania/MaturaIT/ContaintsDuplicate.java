package Drugi.Zadania.MaturaIT;

import java.util.HashSet;
import java.util.Set;

public class ContaintsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
	Set<Integer> numbers = new HashSet<Integer>();
	for (int num : nums) {
	    if (numbers.contains(num))
		return true;
	    numbers.add(num);
	}

	return false;
    }

    public static void main(String[] args) {
	int[] liczby1 = { 1, 3, 65, 78, 3434, 56 , 58, 2 , 3 , 9};
	System.out.println(containsDuplicate(liczby1));
    }
}
