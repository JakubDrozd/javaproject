package com.example.basics.data.string_class;

public class Functions_toCharArray_split_toString {
    public static void main(String args[]){
        String str1 = "Ola ma kota";
        char arr[] = str1.toCharArray();
        System.out.println(arr.length);

        String strArr[] = str1.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        String string = str1.toString();
        System.out.println(string);

        Integer i = 123;
        System.out.println(i.toString());

        String text = "Liczba: " + i;
        System.out.println(text);
    }
}
