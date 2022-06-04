package com.example.basics.data.types;

public class J01_variable_declaration {
    public static void main(String args[]){
        int number = 24;
        int data = -123;
        number = 98;
        System.out.println("Wartość zmiennej number: " + number);
        System.out.println("data: " + data);
        number = data * 2;
        System.out.println("Number: " + number);
    }
}
