package Drugi.przyklady.WyjatkiFinally.copy;

public class MainWyjatkiFinally {
	static String string = "teskt";

	public static void main(String[] args) {

		try {
			string.charAt(12);
			System.out.println("Wszystko wielka litera: " + string.toUpperCase());
		} catch (NullPointerException e) {
			System.out.println("Podany String jest nieprawidlowy");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Poza zakresem");
		} finally {
			System.out.println("Zawsze sie wykona");
		}
	}
}
