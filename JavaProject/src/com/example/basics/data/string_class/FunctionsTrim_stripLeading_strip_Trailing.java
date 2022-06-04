package com.example.basics.data.string_class;

public class FunctionsTrim_stripLeading_strip_Trailing {
    public static void main(String args[]){

        String str = "     \n  \t   Hello World!  \n";
        String strTrim = str.trim();
        System.out.println("\""+strTrim+"\"");
        String strTripL = str.stripLeading();
        System.out.println("\""+strTripL+"\"");
        String strTripT = str.stripTrailing();
        System.out.println("\""+strTripT+"\"");
    }
}
