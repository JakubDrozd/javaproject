package Drugi.Zadania.AbstrakcjaZadanie2;

public class Main {
	public static void main(String[] args) {
		Kolo obiektKolo = new Kolo(3);
		System.out.println(obiektKolo.pole());
		System.out.println(obiektKolo.obwod());
		
		Prostokat obiektProstokat = new Prostokat(33, 8);
		System.out.println(obiektProstokat.pole());
		System.out.println(obiektProstokat.obwod());
	}
}
