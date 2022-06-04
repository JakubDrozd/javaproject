package com.example.basics.oop.basics.inheritance.example1;

public class SuperCar extends Car{
            SuperCar(){
                type = "super samochód";
                topSpeed = 300.2f;
            }

            public void trybSportowy(){
                System.out.println("Sport mode activated!");
            }
}
