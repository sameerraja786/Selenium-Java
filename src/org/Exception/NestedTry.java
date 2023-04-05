package org.Exception;

public class NestedTry {
	
	public static void main(String[] args) {
		
		
		try
		{
			
			System.out.println(4/0);
			
			String str = "Java";
			char charAt = str.charAt(8);
			System.out.println(charAt);
		}
		catch(ArithmeticException e)
		{
			
		}
	}

}
