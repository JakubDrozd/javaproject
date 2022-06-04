package com.example.basics.programs;

import java.util.Scanner;

//procent składany
//1000 * (1 + 0.5)^3

public class CompoundInterest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double kapitalPoczatkowy = 0;
        double odsetkiRoczne = 0;
        int iloscLat = 0;


        double wynik;

        System.out.println("Podaj kapitał początkowy: ");
        kapitalPoczatkowy = Double.valueOf(input.nextLine()).doubleValue();
        System.out.println("Podaj odsetki (w skali roku): ");
        odsetkiRoczne = Double.valueOf(input.nextLine()).doubleValue();
        System.out.println("Podaj ilośc lat oszczędzania: ");
        iloscLat = Integer.valueOf(input.nextLine());

        wynik = kapitalPoczatkowy * Math.pow(1 + (odsetkiRoczne / 100.0d),iloscLat);
        System.out.println("Odsetki w skali roku: " + Math.round(wynik));
    }
}
