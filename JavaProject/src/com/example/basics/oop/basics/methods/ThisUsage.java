package com.example.basics.oop.basics.methods;

class Radio{

    int rok;
    int glosnosc;
    String stacja;

    Radio(){

        this.rok = 2000;
        glosnosc = 100; // to samo this.glosnosc = 100;

    }

    Radio(int rok){

        this(); // wywolanie konstruktora bezargumentowego
        this.rok = rok;
        this.zmienStacje("Rock");
    }

    public void zmienStacje(String nowaStacja) {
        this.stacja = nowaStacja;
    }

    public Radio getRadio(){

        return this;

    }

    public void printRadioInfo(Radio radio){

        System.out.println("Radio production year: " +radio.rok);

    }

}

public class ThisUsage {
    public static void main(String[] args) {

        Radio stareRadio = new Radio(1996);
        Radio noweRadio = new Radio(2010);
        noweRadio.printRadioInfo(noweRadio);
    }
}
