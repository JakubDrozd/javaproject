package Drugi.przyklady.petle;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        String imie = "Jakub";
        String nazwisko = "Mroziński";
        switch (nazwisko){
            case "Drozd":
                System.out.println(imie + " Drozd");
                break;
            case "Mroziński":
                System.out.println(imie + " Mroziński");
                break;
            case "Miś":
                System.out.println(imie + " Miś");
                break;
            default:
                System.out.println("Nazwisko nie znajduje się na liśice");
                break;
        }
    }
}
