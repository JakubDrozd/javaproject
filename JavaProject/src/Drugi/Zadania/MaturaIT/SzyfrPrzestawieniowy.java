package Drugi.Zadania.MaturaIT;

public class SzyfrPrzestawieniowy {

    public static String szyfrPlotkowy(String text, int key) {
	String encryptedText = "";
	boolean check = false;
	int j = 0;
	int row = key;
	int col = text.length();
	char[][] a = new char[row][col];
	for (int i = 0; i < col; i++) {
	    if (j == 0 || j == key - 1) {
		check = !check;
	    }
	    a[j][i] = text.charAt(i);
	    if (check) {
		j++;
	    } else {
		j--;
	    }

	}
	for (int i = 0; i < row; i++) {
	    for (int k = 0; k < col; k++) {
		if (a[i][k] != 0) {
		    encryptedText += a[i][k];
		}
	    }
	}

	return encryptedText;
    }

    public static String decryption(String text, int key) {
	String decryptedText = "";
	boolean check = false;
	int j = 0;
	int row = key;
	int col = text.length();
	char[][] a = new char[row][col];

	int index = 0;
	check = false;
	for (int i = 0; i < row; i++) {
	    for (int k = 0; k < col; k++) {
		if (a[i][k] == '*' && index < col) {
		    a[i][k] = text.charAt(index++);
		}
	    }
	}
	j = 0;
	for (int i = 0; i < col; i++) {
	    if (j == 0 || j == key - 1) {
		check = !check;
	    }
	    decryptedText += a[j][i];
	    if (check) {
		j++;
	    } else {
		j--;
	    }

	}
	return decryptedText;
    }

    public static void main(String[] args) {
	System.out.println(szyfrPlotkowy("turniej siatkowki plazowej o puchar miasta", 7));
	System.out.println(decryption("T!au kzD ro.ttbersrizizzymedm  ia,c ji", 11));
    }
}
