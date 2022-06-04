package Drugi.przyklady.klasyimetody;

public class Konstruktor {
    int pierwszePole;
    int drugiePole;
    int trzeciePole;

    Konstruktor(){
        pierwszePole = (int) (1 + Math.random() * (100 - 1));
        drugiePole = (int) (1 + Math.random() * (100 - 1));
        trzeciePole = (int) (1 + Math.random() * (100 - 1));
    }

    Konstruktor(int wartoscPierwsza){
        pierwszePole = wartoscPierwsza;
    }

    Konstruktor(int wartoscPierwsza, int wartoscDruga){
        pierwszePole = wartoscPierwsza;
        drugiePole = wartoscDruga;
    }
    Konstruktor(int wartoscPierwsza, int wartoscDruga, int wartoscTrzecia){
        pierwszePole = wartoscPierwsza;
        drugiePole = wartoscDruga;
        trzeciePole = wartoscTrzecia;
    }

    public void info(){
        System.out.println(this.pierwszePole + " " + this.drugiePole + " " + this.trzeciePole);
    }
}
