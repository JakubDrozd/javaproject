package Drugi.przyklady.Enum;

public class Main {
    public static void main(String[] args) {
	KierunekSwiata kierunek = KierunekSwiata.POLNOC;

	if (kierunek.equals(KierunekSwiata.POLNOC)) {
	    System.out.println("Poszed³ na pó³noc");
	} else if (kierunek == KierunekSwiata.POLUDNIE) {
	    System.out.println("Poszed³ na po³udnie");
	} else if (kierunek == KierunekSwiata.WSCHOD) {
	    System.out.println("Poszed³ na wschod");
	} else {
	    System.out.println("Poszed³ na zachód");
	}
	switch (kierunek) {
	case POLNOC:
	    System.out.println("Poszed³ na pó³noc");
	    break;
	case POLUDNIE:
	    System.out.println("Poszed³ na po³udnie");
	    break;
	case WSCHOD:
	    System.out.println("Poszed³ na wschod");
	    break;
	case ZACHOD:
	    System.out.println("Poszedl na zachod");
	    break;
	default:
	    System.out.println("Error");
	    break;
	}

	KierunekSwiata kierunekSwiata = KierunekSwiata.WSCHOD;
	kierunekSwiata.ordinal();
	System.out.println(kierunek.ordinal());
	KierunekSwiata kolejnyKierunekSwiata = KierunekSwiata.valueOf("WSCHOD");
	System.out.println("valueof: " + kolejnyKierunekSwiata);

	KierunekSwiata[] kierunkiSwiata = KierunekSwiata.values();
	for (int i = 0; i < kierunkiSwiata.length; i++) {
	    System.out.println("i: " + i + ", kierunek: " + kierunkiSwiata[i]);

	}
	KierunekSwiata kSwiata = KierunekSwiata.values()[2];
	System.out.println(kSwiata);
    }
}
