package ArrayList;

import java.util.ArrayList;

public class data {

	public static void main(String[] args) {
		// create an ArrayList which going to
        // contains a list of Student names which is actually
        // string values
//        ArrayList<String> students = new ArrayList<String>();
//  
//        // Add Strings to list
//        // each string represents student name
//        students.add("Ram");
//        students.add("Mohan");
//        students.add("Sohan");
//        students.add("Rabi");
//  
//        // print result
//        System.out.println("list of Students:");
//  
//        // forEach method of ArrayList and
//        // print student names
//        students.forEach(s -> System.out.println(s));
		
		 ArrayList<Integer> Numbers = new ArrayList<Integer>();
		  
	        // Add Number to list
	        Numbers.add(23);
	        Numbers.add(32);
	        Numbers.add(45);
	        Numbers.add(63);
	  
	        // forEach method of ArrayList and
	        // print numbers
//	        Numbers.forEach((n) -> System.out.println(n));
	        
	        //Enhanced  loop
//	        for(int number:Numbers)
//	        {
//	        	System.out.println(Numbers);
//	        }
	        
	        for(int i=0; i<Numbers.size() ;i++)
	        {
	        	System.out.println(Numbers.get(i));
	        }
	}

}
