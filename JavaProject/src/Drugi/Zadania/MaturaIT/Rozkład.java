package Drugi.Zadania.MaturaIT;

public class Rozk³ad {

    public static void rozklad(int a) {
	int p = 2;
	while (a > 1) {
	    if (a % p == 0) {
		a = a / p;
		System.out.println(p);
	    } else {
		p++;
	    }
	}
    }

    public static void main(String[] args) {
	rozklad(1050403310);
    }
    
}
