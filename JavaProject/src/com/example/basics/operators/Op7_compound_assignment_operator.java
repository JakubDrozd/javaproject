package com.example.basics.operators;

public class Op7_compound_assignment_operator {
    public static void main(String args[]){
        // złożone operatory przypisania
        // += -= *= /= %=
        int a = 5;
        a +=10; // to samo jak: a = a+ 10
        System.out.println("a: " + a);
        int b = 2;
        b *= 3;
        System.out.println("b: " + b);
        int c = 20;
        c %= 3;
        System.out.println("c: " + c);
    }
}
