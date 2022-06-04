package com.example.basics.data.string_class;

public class Functions_isEmpy_IsBlank {
    public static void main(String args[]){
        String empty = "";
        String blank = "\n            ";

        if (empty.isEmpty()){
            System.out.println("Pusty");
        }
        else {
            System.out.println("Nie jest pusty");
        }
        if (blank.isBlank()){
            System.out.println("Blank");
        }else
        {
            System.out.println("Nie jest blank");
        }
        if (blank.isBlank()){
            System.out.println("blank ma 0 znaków albo same białe znaki");
        }
    }
}
