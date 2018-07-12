package com.classes;

public class FirstClassdemo {
	
	int x=90;
	int y =100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program started");
		
		FirstClassdemo obj1 = new FirstClassdemo();
		
		obj1.add();
		
		System.out.println("End program");
		
		System.out.println("The value in x is "+obj1.x);
		
		System.out.println("The value in x is "+obj1.y);
	}
	
	public void add(){
		
		int a = 100;
		int b = 20;
		int c = a+b;
		
		System.out.println("Tha addition of two values is " +c);
	}

}
