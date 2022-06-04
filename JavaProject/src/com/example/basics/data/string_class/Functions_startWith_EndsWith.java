package com.example.basics.data.string_class;

public class Functions_startWith_EndsWith {
    public static void main(String args[]){
        String str1 = "Java program";

        if (str1.startsWith("Java")){
            System.out.println("Zaczyna się na \"Java\"");
        }
        else{
            System.out.println("Nie zaczyna się na \"Java\"");
        }

        if (str1.endsWith("program")){
            System.out.println("kończy się na \"program\"");
        }
        else{
            System.out.println("Nie kończy się na \"program\"");
        }
    }
}
