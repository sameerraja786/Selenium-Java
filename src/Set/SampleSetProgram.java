package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SampleSetProgram {

	public static void main(String[] args) {

//		Set<Integer> Se1 = new LinkedHashSet<>();  
//		
//		Se1.add(10);
//		Se1.add(23);
//		Se1.add(45);
//		Se1.add(10);
//		Se1.add(456);
//		Se1.add(87);
//		Se1.add(32);
//		Se1.add(87);
//		
//	    System.out.println(Se1);	//[10, 23, 45, 456, 87, 32]
//		Usernme ankitkumar12oct@gmail.com
		//Pass
//	}
		// Random Order
//		Set<Integer> Se1 = new HashSet<>();  
//		
//		Se1.add(10);
//		Se1.add(23);
//		Se1.add(45);
//		Se1.add(10);
//		Se1.add(456);
//		Se1.add(87);
//		Se1.add(32);
//		Se1.add(87);
//		
//	    System.out.println(Se1);	//[32, 23, 87, 456, 10, 45]
//	
//		
//	}
		// Assending Order
//		Set<Integer> Se1 = new TreeSet<>();
//		Se1.add(10);
//		Se1.add(23);
//		Se1.add(45);
//		Se1.add(10);
//		Se1.add(456);
//		Se1.add(87);
//		Se1.add(32);
//		Se1.add(87);

//		System.out.println(Se1); // [10, 23, 32, 45, 87, 456]
//
//	}
//	
	
	Set<Integer> Se3 = new LinkedHashSet<>();
	Se3.add(10);
	Se3.add(23);
	Se3.add(45);
	Se3.add(10);
	Se3.add(456);
	Se3.add(87);
	Se3.add(32);
	Se3.add(87);
//
//	System.out.println(Se3); // [10, 23, 45, 456, 87, 32]
	
	Set<Integer> Se4 = new LinkedHashSet<>();
	Se4.add(10);
	Se4.add(23);
	Se4.add(45);
	
    Se4.addAll(Se3);  // AddAll Method
	//System.out.println(Se4); // initial Valua [10, 23, 45]
	                            //After       [10, 23, 45, 456, 87, 32]
	
	
	Se3.retainAll(Se4);  // Print the Common Value in Set
	//System.out.println(Se3);  //[10, 23, 45, 456, 87, 32]
	
	//Remove All
	
	System.out.println(Se4);  //[10, 23, 45, 456, 87, 32]
	Se3.removeAll(Se4);
	System.out.println(Se3);
	System.out.println(Se4);
	Se4.removeAll(Se3);
	System.out.println(Se4);
	
}
}