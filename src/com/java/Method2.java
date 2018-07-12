package com.java;

public class Method2 {
	
	// Main method
	public static void main(String[] args) {
		
		Method2  obj = new Method2();
		
		obj.add(100, 200);
		
		//obj.add1(200, 300);
		int x = obj.add1(200, 300);
				
			System.out.println("Return number is " +x);	
			
			String m = obj.con("muza", "moh");
			
			System.out.println("Return string " +m);	
			
			int a = obj.max(100, 200, 12);
			
			int b = obj.max(100, 300, 12);
			
			int c = a+b;
			
			System.out.println("The values are " +c);
	
		
	}
	
	// In a method we can have many parameters.
	//They are called paramerized methods
	public void add(int a, int b ) {	
		int c = a+b;
		System.out.println("Addition of two number is " +c);		
	}
	
	
	public int add1(int a, int b ) { //method1
		
		int c = a+b;
		System.out.println("Addition of three number is " +c );		
		return c;
	}
		
	public String con(String a, String b){ //Method 2
		
		return a+b;	
	}
	
	public int  max(int a, int b, int c){ //method 3
		
		if(a>b && a>c){
			System.out.println(" A is greater " +a);
			
			return a;
		} 
		
		else if(b>a && b>c){
			System.out.println(" B is greater " +b);
			
			return b;
		}
		
		else{
			System.out.println(" C is greater " +c);
			
			return c;
		}
		
	}
}
