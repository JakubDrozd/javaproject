package com.example.basics.oop.basics.inheritance.example2_shop;

public class Product{
    float price;
    String name;
    String manufacturer;
    int productionYear;

    Product(){
        name = "unknown";
        manufacturer = "unknown";
        price = 100.0f;

    }
    public void printInfo(){
        System.out.println("Price: "+this.price+", Name: " + this.name +", Manufacturer: "+ this.manufacturer +", Production Year: "+ this.productionYear);
    }

}
