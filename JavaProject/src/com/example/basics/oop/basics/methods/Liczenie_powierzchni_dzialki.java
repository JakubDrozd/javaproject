package com.example.basics.oop.basics.methods;



class MyMath2{

    public void liczeniePowierzchni(float bok1, float bok2){
        float powierzchnia = bok1 * bok2;
        System.out.println("Powierzchnia: " + powierzchnia + "m^2");
    }

}


public class Liczenie_powierzchni_dzialki {
    public static void main(String args[]){


        MyMath2 dzialka = new MyMath2();
        float bok1 = 3.5f;
        float bok2 = 11.3f;

        dzialka.liczeniePowierzchni(bok1,bok2);

    }
}
