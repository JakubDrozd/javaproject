package com.example.basics.control_flow_statements;

public class IfStatement {
    public static void main(String args[]){

        int a = 1;
        if(a > 5){
            System.out.println("\"a\" jest wieksze od 5");
        }else if(a == 2){
            System.out.println("\"a\" jest równe 2");
        }else{
            System.out.println("\"a\" nie spełnia warunków");
        }
        System.out.println("nie spełniony warunek");
    }
}
