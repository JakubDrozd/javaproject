package Drugi.Zadania.MaturaIT;

import java.util.Arrays;

public class Anagram {
    
    public static boolean anagram(String tekst1, String tekst2) {
	String nowytekst1 = tekst1.toLowerCase().replace(" ", "");
	String nowytekst2 = tekst2.toLowerCase().replace(" ", "");
	char[] znaki1 = nowytekst1.toCharArray();
	char[] znaki2 = nowytekst2.toCharArray();
	Arrays.sort(znaki1);
	Arrays.sort(znaki2);
	if (Arrays.equals(znaki1, znaki2)) {
	    return true;
	}
	return false;
    }
    
    public static void main(String[] args) {
	System.out.println(anagram("Silent", "Listen"));
    }
}
