package Drugi.Zadania.MaturaIT;

public class WszystkieDzielniki {
    public static long euclid(long a, long b) {
	if (b == 0) {
	    return a;
	} else {
	    return euclid(b, a % b);
	}
    }

    public static void main(String[] args) {
	int reszta = 100000/3211;
	int amogus = 3211 * reszta;
	int what = 100000 - amogus;
	System.out.println(reszta + ";" + what);
    }
}
