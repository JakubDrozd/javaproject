package Drugi.Zadania.AbstrakcjaZadanie3;

public class Main {
	public interface Info {
		public void wyswietlInfo();
	};

	public static void main(String[] args) {
		Info obiektInfo = new Info() {

			@Override
			public void wyswietlInfo() {
				System.out.println("informacja wypisana z klasy anonimowej");

			}
		};
		obiektInfo.wyswietlInfo();
	}
}
