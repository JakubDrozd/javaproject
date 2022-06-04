package Drugi.Zadania.MaturaIT;

public class SzyfrCesara {

    public static char kodujZnak(char znak, int klucz) {
	char znaczek = Character.toUpperCase(znak);
	if (znaczek + klucz <= 90) {
	    return (char) (znaczek + klucz);
	} else {
	    return (char) (znaczek + klucz - 26);
	}
    }

    public static char dekodujZnak(char znak, int klucz) {
	char znaczek = Character.toUpperCase(znak);
	if (znaczek - klucz >= 65) {
	    return (char) (znaczek - klucz);
	} else {
	    return (char) (znaczek - klucz + 26);
	}
    }

    public static String kodujString(String tekString, int klucz) {
	String poprawnyString = "";
	for (int i = 0; i < tekString.length(); i++) {
	    poprawnyString = poprawnyString + kodujZnak(tekString.charAt(i), klucz);
	}
	return poprawnyString;
    }

    public static String dekodujString(String tekString, int klucz) {
	String odkodowanyString = "";
	for (int i = 0; i < tekString.length(); i++) {
	    odkodowanyString = odkodowanyString + dekodujZnak(tekString.charAt(i), klucz);
	}
	return odkodowanyString;
    }

    public static char testSzyfruZnaku(char sign, int key) {
	char znak2 = Character.toUpperCase(sign);
	key = key % 26;
	if (znak2 + key <= 90) {
	    return (char) (znak2 + key);
	} else {
	    return (char) (znak2 + key - 26);
	}
    }

    public static String testSzyfruString(String text, int key) {
	String result = "";
	for (int i = 0; i < text.length(); i++) {
	    result = result + testSzyfruZnaku(text.charAt(i), key);
	}
	return result;
    }

    public static char odkodujZnak(char sign, int key) {
	char znak2 = Character.toUpperCase(sign);
	key = key % 26;
	if (znak2 - key >= 65) {
	    return (char) (znak2 - key);
	} else {
	    return (char) (znak2 - key + 26);
	}
    }

    public static String odkodujString(String text, int key) {
	String result = "";
	for (int i = 0; i < text.length(); i++) {
	    result = result + odkodujZnak(text.charAt(i), key);
	}
	return result;
    }

    public static void main(String[] args) {
	System.out.println(kodujString("i love hacking bro", 13));
	System.out.println(odkodujString("Grg sg quzg o vyg", 6));
	System.out.println(odkodujString("Rozcu! Upifeftu supg", 6));
	System.out.println(odkodujString("Vokxcogyzkq f sotay pkjetqo.", 6));

    }
}
