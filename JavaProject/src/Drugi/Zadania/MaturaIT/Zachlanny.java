package Drugi.Zadania.MaturaIT;

public class Zachlanny {

    public static void main(String[] args) {
	int kwota = 729;
	int[] nominaly = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
	int ilosc;
	for (int i = 0; i < nominaly.length; i++) {

	    if (nominaly[i] < kwota) {
		ilosc = kwota / nominaly[i];
		kwota = kwota - (ilosc * nominaly[i]);
		for (int j = 0; j < ilosc; j++) {
		    System.out.println(nominaly[i]);
		}
	    }

	}
    }
}
