package org.Exception;

public class PrintStackTree {
	
	public static void main(String[] args) {
		
		try
		{
		String s1="java";
		char charAt = s1.charAt(6);
		System.out.println(charAt);
		}
		catch(ArithmeticException e)
		{
		   e.printStackTrace();
			System.out.println("Comanally Exception Handled");
		}
//		
		
	}

}
