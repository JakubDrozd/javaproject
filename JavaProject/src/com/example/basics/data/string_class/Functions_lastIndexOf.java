package com.example.basics.data.string_class;

public class Functions_lastIndexOf {
    public static void main(String args[]){
        String str1 = "Ola ma psa, Ola ma kota, Ola ma papuge";
        int last = str1.lastIndexOf("Ola");
        System.out.println(last);
        int index = str1.indexOf("Ola");
        System.out.println(index);
    }
}
