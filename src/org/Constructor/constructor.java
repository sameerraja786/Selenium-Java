package org.Constructor;

public class constructor extends Company {
	//Non-parameter Constructor (or) Default Parameter Constructor
	 public constructor() {
		 this(111);
		System.out.println("Default Non-Parametic Constructor");
	}
	 //Parametic Constructor
	 public constructor(int EmpId) {
		    this("sameer");
		    System.out.println("Employee id is "+ EmpId);
			System.out.println("Int Parameter-Constructor");
		}
	 
	 public constructor(String EmpName ) {
		    super();
		    System.out.println("Employee Name is "+ EmpName);
			System.out.println("String Parameter Constructor");
		}
	
	
	
	public static void main(String[] args) {
		
		constructor emp = new constructor();
		
	}

}
