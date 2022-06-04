package com.example.basics.oop.basics;

import java.awt.*;

class PointWithContants {

    int x;
    int y;
    final int width = 12;
    final int height;

    PointWithContants() {

        height = 20;

    }

    PointWithContants(int posX, int posY){

        this();
        x = posX;
        y = posY;

    }

    public void changePosition(int newX, final int newY){

        newX = 30; // zmiana wartosci argumentu
        x = newX;
        y = newY;

    }

}



public class FinalConstntsExample {
    public static void main(String[] args) {

        PointWithContants point = new PointWithContants(33,44);
        point.changePosition(55,66);
        System.out.println("x: " +point.x+ "\ny: " +point.y);
    }
}
