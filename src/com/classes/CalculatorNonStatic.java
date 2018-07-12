package com.classes;

public class CalculatorNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj1 = new Calculator();
		
		obj1.sum();
		
		obj1.sub();
		
		System.out.println("the value in x is " +obj1.name);
		
		System.out.println("the value in x is " +obj1.hobby);

	}

}
