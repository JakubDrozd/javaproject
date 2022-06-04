package Drugi.przyklady.MainWyjatkiTworzenie.copy;

public class MainWyjatkiTworzenie {
	public static void main(String[] args) {
		Uzytkownik obiektUzytkownik = new Uzytkownik();
		try {
			obiektUzytkownik.wprowadzEmail("kubadroo@net.pl");
			obiektUzytkownik.wprowadzHaslo("Kiniasdasdsdagu");
		} catch (passwordCheckException e) {
			// TODO Auto-generated catch block
			System.out.println("Haslo nie spelnia wymagan");
		} catch (emailCheckException e) {
			System.out.println("Niepoprawny adres e-mail");
		}
		System.out.println("Koniec");
	}
}
