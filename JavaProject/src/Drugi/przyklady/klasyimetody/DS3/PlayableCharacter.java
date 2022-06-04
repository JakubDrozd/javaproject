package Drugi.przyklady.klasyimetody.DS3;

public class PlayableCharacter {
    String charName;
    int level;
    int strength;
    int intelligence;
    int agility;

    PlayableCharacter(String nazwaPostaci, int poziom, int sila, int inteligencja, int zrecznosc){
        charName = nazwaPostaci;
        level = poziom;
        strength = sila;
        intelligence = inteligencja;
        agility = zrecznosc;
    }
    void charInfo(){
        System.out.println("[Nazwa]: " + this.charName);
        System.out.println("[Poziom]: " + this.level);
        System.out.println("[Siła]: " + this.strength);
        System.out.println("[Inteligencja]: " + this.intelligence);
        System.out.println("[Zrecznosc]: " + this.agility);
        System.out.println("---------------------------------------------------------------------------------------");

    }
}
