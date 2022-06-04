package com.example.basics.data;

public class EnumExample {

    enum SoundVolume {Low, Medium, High, Very_High};
    enum CarVariant {Sedan, Combi, Super_Car};

    public static void main(String args[]){
        SoundVolume phoneSound = SoundVolume.Low;
        System.out.println(phoneSound);
    }
}
