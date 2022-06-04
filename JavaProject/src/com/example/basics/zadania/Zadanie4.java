package com.example.basics.zadania;



class characterCreation{
    int level;
    String name;
    double spellPower;
    double Armor;
    double Intelligence;
    double Strenght;
    double Agility;


    public characterCreation(){
        System.out.println("!!! Insufficient data provided !!!");
    }

    public characterCreation(int level, String name, double spellPower, double intelligence, double strenght, double agility, double armor){
        this.level = level;
        this.name = name;
        this.spellPower = spellPower;
        this.Intelligence = intelligence;
        this.Strenght = strenght;
        this.Agility = agility;
        this.Armor = armor;

    }
    public void charInfo(){
        System.out.println("{Character created}: \n"+
                "[Name]: "+name+"\n"+
                "[Level]: "+level+"\n"+
                "[Armor]: "+Armor+"\n"+
                "[Spell Power]: "+spellPower+"\n"+
                "[Intelligence]: "+Intelligence+"\n"+
                "[Strenght]: "+Strenght+"\n"+
                "[Ability]: "+Agility+"\n"
        );
    }

}


public class Zadanie4 {

    public static void main(String[] args){

        characterCreation Veanty = new characterCreation(89, "Veanty",120,60,11,12,29.3);
        Veanty.charInfo();

        characterCreation Gum4 = new characterCreation();
        Gum4.charInfo();

    }

}
