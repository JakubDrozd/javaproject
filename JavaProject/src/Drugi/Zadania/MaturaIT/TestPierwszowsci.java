package Drugi.Zadania.MaturaIT;

public class TestPierwszowsci {

    public static void testPierwszosci(int a) {
	boolean flaga = true;
	int i;
	for (i = 2; (i * i)<= a ; i++) {
	    if (a % i == 0) {
		System.out.println("Liczba z³o¿ona");
		flaga = false;
		break;
	    }
	}
	if (flaga) {
	    System.out.println("Liczba pierwsza");
	}
    }

    public static void main(String[] args) {
	testPierwszosci(7);
    }
}
