package com.example.basics.oop.basics.access_modifiers.private_example;

public class PrivateExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Ford");
        System.out.println(car.getName());
        int liczba = 33;
        int liczba2 = -liczba;
        System.out.println(liczba);
        System.out.println(liczba2);
    }

}
