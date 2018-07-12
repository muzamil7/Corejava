package com.java;

public class Staticmethods {
	
	public String sName;
	public double mMarks;
	public double pMarks;
	public double cMarks;
	public double avgMarks;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staticmethods Ramesh = new Staticmethods();
		 
		Ramesh.sName = "Ramesh";
		Ramesh.mMarks = 100;
		Ramesh.pMarks = 200;
		Ramesh.cMarks = 300;
		Ramesh.avgMarks = (Ramesh.mMarks+Ramesh.pMarks+Ramesh.cMarks)/3;
		
		System.out.println("The average marks " +Ramesh.avgMarks);
		
	}
	
	public double avMarks(double a , double b, double c){
		
		return(a+b+c)/3;
		
	}

}
