package com.example.basics.data.string_class;

public class Concatenation {
    public static void main(String args[]){
        String s1 = "Hello ";
        String s2 = "World!";
        String s3 = s1 + s2 + " From Java prog.";
        System.out.println(s3);

        String txt1 = "Dodge Charger ";
        int rocznik = 2020;
        String car = txt1 + rocznik;
        System.out.println(car);

        String car2 = txt1.concat(Integer.toString(rocznik));
        System.out.println(car2);
    }
}
