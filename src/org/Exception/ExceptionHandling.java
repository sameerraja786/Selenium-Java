package org.Exception;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		 System.out.println(1);
		 System.out.println(2);
		 System.out.println(3);
		 
		 try
		 {
			 //Arithmetic exp
			 System.out.println(4/0);
			 
			 //StringIndexoutofboundary
			 String s1="Java";
			 char charAt = s1.charAt(8);
			 System.out.println(charAt);
					 
		 }
		 catch(ArithmeticException ex1)
		 {
			 System.out.println("Dont try to devide a number by 0");
		 }
		 catch(StringIndexOutOfBoundsException ex2)
		 {
			 System.out.println("Dont try to fetch the beyond String length");
		 }
		 finally
		 {
			 System.out.println("Exception Handaling Successfully");
		 }
	}

}
