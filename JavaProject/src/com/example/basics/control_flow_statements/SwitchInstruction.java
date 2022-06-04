package com.example.basics.control_flow_statements;

enum carVariant {SEDAN, COMBI, SPORT};

public class SwitchInstruction {
    public static void main(String args[]){
        int num = 10;
        switch (num){
            case 1:
                System.out.println("Równa się \"jeden\"");
                break;
            case 3:
                System.out.println("Równa się \"trzy\"");
                break;
            case 4:
                System.out.println("Równa się \"cztery\"");
                break;
            case 11:
                System.out.println("Równa się \"jedenaście\"");
                break;
            default:
                System.out.println("Nie znalezionio liczby: " + num );
        }
        String str = "Ania";
        switch (str){
            case "Ola":
                System.out.println("Ola");
                break;
            case "Ania":
                System.out.println("Ania");
                break;
            default:
                System.out.println("Nie znalezionio imienia: " + str);
        }
        carVariant car = carVariant.COMBI;
        switch (car){
            case COMBI:
                System.out.println("Combi");
                break;
            case SEDAN:
                System.out.println("Sedan");
                break;
            case SPORT:
                System.out.println("Sport");
                break;
            default:
                System.out.println("Nie znalezionio auta: " + car);
        }
    }
}
