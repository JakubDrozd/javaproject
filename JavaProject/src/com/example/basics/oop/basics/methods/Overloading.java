package com.example.basics.oop.basics.methods;

import org.w3c.dom.css.Rect;

class RectangleOverloading{
    float side1, side2;

    RectangleOverloading(){

        this(10.0f);

    }

    RectangleOverloading(float v){

        side1 = side2 = v;

    }

    RectangleOverloading(float side1, float side2){

        this.side1 = side1;
        this.side2 = side2;
    }

}


class MathOverloading{


    public int add(int a, int b, int c){
        return a + b+ c;
    }
    public int add(int a, int b){
        return  a + b;
    }
    public float add(float a, float b){
        return  a + b;
    }
}


public class Overloading {
    public static void main(String args[]){

        MathOverloading math = new MathOverloading();
        int a = 12;
        int b = 3;
        int c = 6;
        System.out.println(math.add(a,b,c));

        float f1 = 10.0f;
        float f2 = 12.0f;
        float f3 = 16.3f;
        System.out.println(math.add(f1,f2));

        RectangleOverloading rect = new RectangleOverloading();

        System.out.println(rect.side1);

        RectangleOverloading rect2 = new RectangleOverloading(15.0f);
        System.out.println(rect2.side1);

    }
}
