package JavaReview;

import Constructor.*; 
import JavaReview.Constructors; 

public class Practice {
	
	public static void main(String[] args) {
		
		ConstructorMethod.main(args);
		
		staticKeywords.printName();
		
		staticKeywords.printName(); 	// static can be called through the class name
		
//		staticKeywords.printName2();	// instance cannot be called through the class name
		
		Practice.printName();   		// Carrot
		printName(); 					// Carrot
		
		System.out.println(staticKeywords.StaName);
		
	}
	
	public static void printName () {
		System.out.println("Carrot");
	}

}
