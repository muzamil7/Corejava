package com.java;

public class InstanceVariables {
	
	// Instance variables should be declared after class and before method
	
	public String empName ;
	public int empNo;
	public String companyName;
	
	
	public static void main(String[] args) {
		
		//Creating an object of the class and then assigining the instantce variables.
		
		// classname obj = new classname();
		
		// we can create many objects in class.
		
		// object is insatnce of class.
		
		// Class is a collection of methods and objects.
		
		InstanceVariables suresh = new InstanceVariables();
		
		suresh.empName= "Muzi";
		suresh.empNo = 200;
		suresh.companyName = "Homeoffice";
		
		System.out.println("Employe name is " +suresh.empName);
		System.out.println("Employe name is " +suresh.empNo);
		System.out.println("Employe name is " +suresh.companyName);
		
		
		InstanceVariables prad = new InstanceVariables();
		
		prad.companyName= "Homeoffice";
		prad.empName= "Kumar";
		prad.empNo = 321;
		
		System.out.println("Employe name is " +prad.empName);
		System.out.println("Employe name is " +prad.empNo);
		System.out.println("Employe name is " +prad.companyName);

	}

	
	
}
