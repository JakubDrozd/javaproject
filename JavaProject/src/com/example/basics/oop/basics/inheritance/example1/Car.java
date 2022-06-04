package com.example.basics.oop.basics.inheritance.example1;

public class Car extends Vehicle{
    Car(){
        type = "samochod";
        manufacturer = "Ford";
        topSpeed = 200.0f;
    }
    Car(String manufacturer, float topSpeed){
        this();
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }
}
