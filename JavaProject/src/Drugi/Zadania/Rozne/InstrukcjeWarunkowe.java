package Drugi.Zadania.Rozne;

import java.util.Scanner;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        //Zadanie 1
        int liczba = 24;
        if (liczba % 2 == 0) {
            System.out.println("Liczba " + liczba + " jest parzysta");
        } else {
            System.out.println("Liczba " + liczba + " nie jest parzysta");
        }
        //Zadanie 2
        int dochod = 111111;
        String doswiadczenie;
        int prog = 85528;
        System.out.println("Twój dochod przed odliczenien podatku dochodwego to: " + dochod + "zł");
        if (dochod < prog) {
            doswiadczenie = "początkujący";
            dochod = dochod - ((17 * dochod) / 100);
            System.out.println("Twój dochód jako " + "\"" + doswiadczenie + "\"" + " z 17% wynosi: " + dochod + "zł");
        } else {
            doswiadczenie = "doświadczony";
            dochod = dochod - ((32 * dochod) / 100);
            System.out.println("Twój dochód jako " + "\"" + doswiadczenie + "\"" + " z 32% wynosi: " + dochod + "zł");
        }
        //Zadanie 3
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        int aliczba = Integer.parseInt(a);

        String b = input.nextLine();
        int bliczba = Integer.parseInt(b);

        String znak = input.nextLine();
        char znaczek = znak.charAt(0);

        switch (znaczek) {
            case '+':
                System.out.println(aliczba + bliczba);
                break;
            case '-':
                System.out.println(aliczba - bliczba);
                break;
            case '*':
                System.out.println(aliczba * bliczba);
                break;
            case '/':
                System.out.println("Siema");
                System.out.println(aliczba / bliczba);
                break;
            default:
                System.out.println("Błędny bądź niepodany znak operacji");
                break;
        }
    }
}
