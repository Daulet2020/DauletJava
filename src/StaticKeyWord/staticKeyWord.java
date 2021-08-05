package StaticKeyWord;

import java.util.Scanner;

public class staticKeyWord {
	
	/*
	 static members belongs to the class, also called class members
	 
	 what can be static in Java:
	 	1. static variables
	 	2. static methods
	 	3. static initializer block
	 	4. static inner class (nested class)
	 	
	 	*/

	int a;
	static int b;
	static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		 
		staticKeyWord obj1 = new staticKeyWord();
		obj1.a = 100;
		
		staticKeyWord obj2 = new staticKeyWord();
		obj2.a = 200;
		
		System.out.println(obj1.a);    			//100
		// each object has its own copy of instance variables
		
		System.out.println(obj2.a); 			//200
		
		double num = 100.5;
		
		System.out.println(staticKeyWord.b);
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		System.out.println("----------------------------------------------------");
		
		staticKeyWord obj3 = new staticKeyWord();
 		obj3.a=100;
 		System.out.println(obj3.a);
 		
 		staticKeyWord obj4 = new staticKeyWord();
 		System.out.println(obj4.a);
 		
 		obj3.b=400;
 		System.out.println(obj4.b);  			//400
 		
 		System.out.println(obj4.b);				//400
 		
	}
	
	public static void method1() {
	 int a = staticKeyWord.scan.nextInt();
	}
	
	public static void printHello() {
		int a = scan.nextInt();
		System.out.println("Hello Daulet ");
	}
		
		
		
		
	}
	
	
	

