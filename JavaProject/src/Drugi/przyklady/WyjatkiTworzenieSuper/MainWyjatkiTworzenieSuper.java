package Drugi.przyklady.WyjatkiTworzenieSuper;

public class MainWyjatkiTworzenieSuper {
	public static void main(String[] args) {
		try {
			wyrzucenieWyjatku();
		} catch (JakiException e) {
			// TODO Auto-generated catch block
			System.out.println("Obsluguje odpowiednio wyjatek podczas catch, a wiadomosc wyjatku to: " + e.getMessage());
		
		}
	}
	public static void wyrzucenieWyjatku() throws JakiException {
		throw new JakiException("Specjalna wiadomosc");
	}
}
