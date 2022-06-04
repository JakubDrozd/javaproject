package com.example.basics.control_flow_statements;

public class WhileLooop {
    public static void main(String args[]){
        int i = 5;
        while(i > 0){
            System.out.println("i: " + i);
            i--;
        }
        i = 0;
        while(i < 6){
            System.out.println("i: " +i);
            i++;
        }
    }
}
