package com.example.basics.data.string_class;

public class Functions_repeat_join {
    public static void main(String args[]){

        String str1 = "Info ";
        str1 = str1.repeat(3);
        System.out.println(str1);
        String join = String.join(" - ","Jeden","Dwa","Trzy","Cztery");
        System.out.println(join);
        String concat = str1.concat("Ola ").concat("ma ").concat("kota");
        System.out.println(concat);
    }
}
