package com.java;

public class MthodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MthodOverloading obj = new MthodOverloading();
		
		obj.add(10, 20);
		obj.sub(100, 50);

	}
	
	public void add(int a ,int b){
		
		int c = a+b;
		
		System.out.println("Addition of the numbers " +c);
	}

	public void sub(int a , int b){
		
		int c = a-b;
		System.out.println("Addition of the numbers " +c);
	}
	
	public void add(double a, int b){
		
		double c = a+b;
		
		System.out.println("Addition of the numbers " +c);
		
	}
}
