package com.example.basics.data;

public class NumbersConversions {
    public static void main(String args[]){
        // konwersja jawna - zawężająca
        int i = 5;
        double d = 20.0d / (double) i;
        System.out.println(d);

        //konwersja niejawna - rozszerzająca
        int a = 4;
        double b = 10.0d * (double)a;
        System.out.println(b);

        double d2 = 5.5;
        int num = 10 * (int)d2;
        System.out.println(num);

        byte small = (byte)200;
        System.out.println("small: " + small);
    }
}
