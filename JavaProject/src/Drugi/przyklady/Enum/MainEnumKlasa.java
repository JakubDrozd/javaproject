package Drugi.przyklady.Enum;

public class MainEnumKlasa {
    public static void main(String[] args) {
	Pizza mojaPizza = Pizza.XXL;
	System.out.println("Pizza: " + mojaPizza + ", rozmiar: " + mojaPizza.pobierzRozmiar());
	System.out.println("Koszt pizzy: " + mojaPizza.pobierzCene());
	System.out.println("------------------------------------------------------------------------");
	Pizza kogosPizza = Pizza.DUZA;
	System.out.println("Zamowiles druga pizza");
	System.out.println("Pizza: " + kogosPizza + ", rozmiar: " + kogosPizza.pobierzRozmiar());
	System.out.println("Koszt pizzy: " + kogosPizza.pobierzCene());
	System.out.println("-----------------------------------------------------------------------");
	System.out.println("[Koszty]");
	float kosztcalosciowy = kogosPizza.pobierzCene() + mojaPizza.pobierzCene();
	System.out.println("Koszt ca³oœciowy: " + kosztcalosciowy + "z³");
    }
}
