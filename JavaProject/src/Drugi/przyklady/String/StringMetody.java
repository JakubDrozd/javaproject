package Drugi.przyklady.String;

import java.util.Locale;
import java.util.logging.Logger;


public class StringMetody {
    private static Logger logger;

    public static void main(String[] args) {

        String tekst = "Jakis tekst";
        System.out.println("Length: " + tekst.length());
        System.out.println("isEmpty" + tekst.isEmpty());
        char znaczek = tekst.charAt(tekst.length()-1);
        System.out.println("Znaczek: " + znaczek);
        System.out.println(tekst.substring(0,3));
        String nowyString = "  aDSADSQWEsAasd   eeeE qe 22ww333EEEEEEEw w          e";
        String wymianka = nowyString.replace(" ","");
        System.out.println(wymianka);
        String haslo = " d99art#8PL";
        String hasloPoprawione = haslo.toLowerCase(Locale.ROOT).replace("9","").trim();
    }
}
