package com.example.basics.oop.basics.inheritance.example1;



public class BasicInheritance {
    public static void main(String[] args) {
        Vehicle pojazd = new Vehicle();
        pojazd.printInfo();
        Car samochod = new Car();
        samochod.printInfo();
        Car samochod2 = new Car("Dodge",230.3f);
        samochod2.printInfo();
        Bicycle rower = new Bicycle();
        rower.printInfo();
        SuperCar superSamochod = new SuperCar();
        superSamochod.printInfo();
        superSamochod.trybSportowy();
    }
}
