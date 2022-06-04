package com.example.basics.oop.basics.inheritance.example2_shop;
/*
Klasa Shop
Klasa Product (zmienne: price, name, manufacturer, productionYear)

        klasa Mouse extends Product (zmienne: numButtons = 3)
                Klasa VerticalMouse extends Mouse (zmienne: -)

        Klasa Monitor extends Product (zmienne: resolution = 1080)
        Klasa Keyboard extends Product (zmienne: numKeys = 104)
        Klasa Computer extends Product (zmienne: Mouse, Monitor, Keyboard)

        Dodajemy pusty konstruktor do każej klasy, ustawiamy dla nich pola danej klasy
        Tworzymy egzemplarze klas w metodzie main
        Każda klasa w odzielnym pliku Java
*/
public class Shop {
    public static void main(String[] args) {
        Product mouse = new Product();
        mouse.printInfo();
        Product monitor = new Product();
        monitor.printInfo();
        Product keyboard = new Product();
        keyboard.printInfo();
        Computer computer = new Computer();
        computer.printInfo();
        System.out.println("Resolution: " + computer.monitor.resolution);
        System.out.println("Keyboard price: " + keyboard.price);
        System.out.println(computer.price);
    }
}
