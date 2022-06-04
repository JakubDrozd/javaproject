package com.example.basics.zadania;

public class Zadanie3 {

    public static void main(String[] args){

        double a = 3;
        double b = 8;
        double c = 15;

        double liczenie = (a+b)*c;
        System.out.println(liczenie);

        double liczenie2 = a-b/c;
        System.out.println(liczenie2);

        a++;
        b++;
        c++;

        if ((a + b)>c){
            System.out.println("Czy (a + b) > c: Tak");
        }else{
            System.out.println("Czy (a + b) > c: Nie");
        }
        if (a == b){
            System.out.println("\"a\" jest równe \"b\"");
        }else{
            System.out.println("\"a\" nie jest równe \"b\"");
        }
    }

}
