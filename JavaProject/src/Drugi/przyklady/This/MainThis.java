package Drugi.przyklady.This;

public class MainThis {
	public static void main(String[] args) {
		KlasaRozszerzona obiekt = new KlasaRozszerzona();
		System.out.println("--------------------------------------");
		KlasaRozszerzona obiekt2 = new KlasaRozszerzona(123);
		System.out.println("--------------------------------------");
		KlasaRozszerzona obiekt3 = new KlasaRozszerzona(1,3);
		System.out.println(obiekt3.x);
		System.out.println(obiekt.y);
		
		obiekt3.metodaZParametrami(3123);
		System.out.println("Pole: " + obiekt3.pole);
		
	}
}
