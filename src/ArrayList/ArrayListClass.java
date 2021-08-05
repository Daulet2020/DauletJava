package ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		/*
		 Declaration of ArrayList:
		 	ArrayList<ClassType> variableName = new ArrayList<>();
		
			ArrayList<ClassType> list2 = new ArrayList<ClassType>();
		 
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
						   list2.add(10);
						   list2.add(20);
						   list2.add(30);
				//		   [10, 20, 30]
				// index	0	1	2
		
		System.out.println(list2);
		
		System.out.println(list2.get(1)); 		// get method
		
		System.out.println(list2.size()); 		// size method
		
		list2.clear();							// removes all values from ArrayList
		System.out.println(list2.size());
		
		/* 
		  ArrayList vs Array:
		  	1. Array`s size is fixed. 								ArrayList size dynamic
		  	2. Array supports primitives and non-primitives.		ArrayList does not support
		  	3. Array can be multi-dimensional						ArrayList NOT
		  
		  
		  
		  
		 */
		
		
		
	}
	
}
