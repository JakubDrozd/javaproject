package Drugi.przyklady.MainWyjatkiTworzenie;

public class Uzytkownik {
	public void wprowadzHaslo(String haslo) throws passwordCheckException {
		if (haslo.length()<8) {
			throw new passwordCheckException();
		}
	}
	public void wprowadzEmail(String email) {
		if (!email.contains("@")) {
			throw new emailCheckException();
		}
	}
}
