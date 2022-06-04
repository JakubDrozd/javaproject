package com.example.basics.data.types;

public class J07_varType {
    public static void main(String args[]){
        int a;
        String b;
        int number = add(a = 10, b = "42");
        System.out.println(number);
    }

    public static int add(int a, String b){
        var result = a + Integer.valueOf(b).intValue();
        return result;
    }

}
