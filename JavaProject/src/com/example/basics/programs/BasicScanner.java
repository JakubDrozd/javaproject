package com.example.basics.programs;


import java.util.Scanner;

class playableCharacter{

    String charName;


}

public class BasicScanner {
    public static void main(String[] args){

        //Login alert

        System.out.println("Please enter your username below (it will be used for login purposes): ");
        Scanner inputUsername = new Scanner(System.in);
        String username = inputUsername.nextLine();
        while (username.isEmpty()){
            System.out.println("Wrong username provided");
        }
        System.out.println("Username: "+ "\""+username+"\"");
        System.out.println("Welcome " + username + ", you will now enter your character creation.");

        //Character creation

        System.out.println("*Enter your character's name below*: ");
        Scanner inputCharName = new Scanner(System.in); // character name
        String charName = inputCharName.nextLine();
        System.out.println("Your character name is: " + "\"" + charName + "\"");

        System.out.println("*Choose your race by typing its name into console*: \n [Human] \n [Orc] \n [Elf] \n [Dwarf]");

        Scanner inputRace = new Scanner(System.in);
        String charRace = inputRace.nextLine();
            if (charRace!="Human" || charRace!="Orc" || charRace!="Elf" || charRace!="Dwarf"){
                System.out.println("Wrong race selected");
            }else
            System.out.println("You have selected " + charRace + " as your character's race");
    }
}
