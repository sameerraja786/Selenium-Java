package Array;

public class onrDimentational {
	
	
	public static void main (String [] args)
	{
		int a[] = new int[4];
		
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		System.out.println(a[2]);
		System.out.println("Enhance For loop");
		//Enhance for loop
		for(int number:a)
		{
			System.out.println(number);
		}
		System.out.println("Simple for loop");
		//Simple for loop
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
			//System.out.println(",");
		}
		
		
		
		
	}

}
