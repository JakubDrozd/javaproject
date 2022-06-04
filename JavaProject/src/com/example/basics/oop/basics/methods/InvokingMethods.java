package com.example.basics.oop.basics.methods;

class Triangle{

    float a;
    float h;
    float surfaceArea;

    Triangle(float base, float height){
        a = base;
        h = height;
    }
}


class MyMath{


    public void dodawanie(int a, int b){
        int wynik = a + b;
        System.out.println("Wynik: " +wynik);
    }

}

public class InvokingMethods {
    public static void main(String args[]){

        MyMath policz = new MyMath();
        int a = 10;
        int b = 7;
        policz.dodawanie(a,b);

        Triangle trojkat = new Triangle(10.0f,5.0f);
        System.out.println(trojkat);

    }
}
