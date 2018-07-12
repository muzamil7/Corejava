package com.java;

public class Method1 {
	
	// Main method
	public static void main(String[] args) {
		
		Method1  obj = new Method1();	
		obj.add(100, 200);
		obj.add(100, 200, 10.1);
		obj.add("hai", "heloo");
		obj.message();
	}
	
	// In a method we can have many parameters.
	//They are called paramerized methods
	public void add(int a, int b ) {	
		int c = a+b;
		System.out.println("Addition of two number is " +c);		
	}
	
	public void add(int a, int b, double c ) {
		System.out.println("Addition of three number is " + (a+b+c));		
	}
	
	public void add(String a, String b ) {
		
		String c = a+b ;
		System.out.println("Addition of three number is " +c);		
	}
	
	public void message(){
		
		System.out.println("Heloo world");
		
	}
}
