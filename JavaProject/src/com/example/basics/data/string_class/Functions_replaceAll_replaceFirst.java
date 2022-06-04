package com.example.basics.data.string_class;

public class Functions_replaceAll_replaceFirst {
    public static void main(String args[]){
        String str1 = "Kasia ma kota. Dodatkowo Ola ma psa";
        String trans = str1.replaceAll("Kasia","Ola");
        System.out.println(trans);
        String trans2 = str1.replaceFirst("ma","je");
        System.out.println(trans2);
    }
}
