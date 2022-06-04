package com.example.basics.data;

import java.math.*;

public class BigIntegerBigDecimal {
    public static void main(String args[]){
        BigInteger bigInt = new BigInteger("12313981289");
        bigInt = bigInt.add(new BigInteger("4324234543"));
        System.out.println("Wynik: " + bigInt);
        BigDecimal decimal = new BigDecimal("2893.3148092");
        decimal = decimal.pow(3);
        decimal = decimal.subtract(new BigDecimal("313.2222"));
        System.out.println("Wynik: " + decimal.toString());
    }
}
