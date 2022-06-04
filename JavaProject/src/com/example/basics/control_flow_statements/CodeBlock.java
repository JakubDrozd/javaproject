package com.example.basics.control_flow_statements;

public class CodeBlock {
    public static void main(String args[]) {

	int b = 12;

	{
	    // long num = 1000;
	    long num2 = 1000;
	    int a = 5;
	    System.out.println("a: " + a);
	    System.out.println("b: " + b);
	    // System.out.println("c: " + c);
	    System.out.println(num2);
	}

	{

	}
	{
	    System.out.println("test: ");
	}
    }
}
