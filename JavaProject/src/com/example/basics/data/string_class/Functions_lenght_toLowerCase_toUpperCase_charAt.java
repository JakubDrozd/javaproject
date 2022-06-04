package com.example.basics.data.string_class;

import java.util.Locale;

public class Functions_lenght_toLowerCase_toUpperCase_charAt {
    public static void main(String args[]){
        String str = "Ola ma kota";
        System.out.println("Ilośc znaków: " +str.length());

        char sign = str.charAt(1);
        System.out.println("Znak pod indeksem 1: " +sign);

        String strUp = str.toUpperCase(Locale.ROOT);
        System.out.println(strUp);

        String strLowerCase = str.toLowerCase();
        System.out.println(strLowerCase);
    }
}
