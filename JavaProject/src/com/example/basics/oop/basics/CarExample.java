package com.example.basics.oop.basics;

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;


    public Car(String manufacturer, String name, int year, String color, float topSpeed){
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public void Info(){
        System.out.println(this.manufacturer +" "+ this.name +" "+ this.year +" "+ this.color +" "+ this.topSpeed);
    }

}

public class CarExample {
    public static void main(String args[]){


       /* Car ford = new Car();
        ford.manufacturer = "ford";
        ford.name = "mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;
        ford.Info();

        Car chevrolet = new Car();
        chevrolet.manufacturer = "chevrolet";
        chevrolet.name = "camaro";
        chevrolet.color = "red";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.0f;
        chevrolet.Info();*/
        
        Car dodge = new Car("Dodge","Viper",1997,"blue",280.0f);
        dodge.Info();

    }
}
