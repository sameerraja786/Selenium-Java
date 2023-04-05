package org.Constructor;

public class Company {
	//Non-Parameter (or)Default parameter constructor
	public Company() {
		this("Selenium");
		System.out.println("Parent Default Constructor");
	}
	
	//Parameter constructor
	public Company(String Cource) {
		System.out.println("Cource Name"+ Cource);
		System.out.println("Parent Parameter Constructor");
	}

}
