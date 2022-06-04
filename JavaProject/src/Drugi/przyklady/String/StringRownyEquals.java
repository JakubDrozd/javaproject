package Drugi.przyklady.String;

public class StringRownyEquals {
    public static void main(String[] args) {
        String literaly = "tekst";
        String literal2 = "tekst";
        String literal3 = new String("tekst");
        String literal4 = new String("tekst");

        boolean czySieRownaja = literaly == literal2;
        System.out.println(czySieRownaja);

        boolean czySieRownaja2 = literal3 == literal4;
        System.out.println(czySieRownaja2);

        boolean czySieRownaja3 = literal3.equals(literal4);
        System.out.println(czySieRownaja3);
    }
}
