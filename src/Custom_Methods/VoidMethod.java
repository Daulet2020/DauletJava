package Custom_Methods;

import java.util.Iterator;

public class VoidMethod {
	
	
	
	
	public static void main(String[] args) {
		
		MyFirstMethod();
		/* 	
		 	void: does not return any value
		 	
		 	the method grouping a series of statements to perform for specific task
			benefits: reusable, can avoid repeating same set of statements 
			
			
			
		*/
		even1To100();
			
		
		}
			
	public static void even1To100() {
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
	
	public static void MyFirstMethod() {
		
		System.out.println("Hello World");
		System.out.println("Hello Cybertek");
		System.out.println("Hello Daulet");
		
		
	}
	

}
