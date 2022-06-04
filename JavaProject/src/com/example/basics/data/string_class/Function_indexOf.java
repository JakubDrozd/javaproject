package com.example.basics.data.string_class;

public class Function_indexOf {
    public static void main(String args[]){
        String str1 = "raz dwa trzy cztery";
        int index = str1.indexOf("cztery");
        System.out.println(index);
        index = str1.indexOf("pięć");
        System.out.println(index);
        index = str1.indexOf("trzy",10);
        System.out.println(index);
    }
}
