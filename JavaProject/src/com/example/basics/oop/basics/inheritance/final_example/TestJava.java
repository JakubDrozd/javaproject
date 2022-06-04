package com.example.basics.oop.basics.inheritance.final_example;

class Employee {
    String name;
    String surName;
    String jobTitle;
    float salary;
}

class Manager extends Employee {
    String responsibility;

}

class Director extends Manager {
    String department;
}

class VicePresident extends Director {

}

final class CEO extends VicePresident {
    String companyName;
}

public class TestJava {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        System.out.println(ceo.companyName);
    }
}
