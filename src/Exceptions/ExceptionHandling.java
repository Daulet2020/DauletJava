package Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

/* Exception Handling:
		1. try & catch:
		 	try {
		 		exception statement/code
		 	} catch(ExceptionClass name) {
		 		statements
		 	}
		 	
		 	similar as if && else block, only one of those blocks gets executed
		 	
		 	try block: only gets executed if the exception is checked
		 	
		 	catch block: only gets executed if the exception is unchecked (RuntimeException)
		
		*/	
	

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		int [] num = {100, 200, 300};
	
		try {
			System.out.println(num [5]);
			System.out.println("Checked exception  ");
		
		} catch (ArrayIndexOutOfBoundsException anyname){
			System.out.println("Unchecked exception");
		}
		
		System.out.println("___________________________________________________________________________");
		
		try {
			Thread.sleep(2000);
			System.out.println("Try block, Checked Exception");
			
		} catch (InterruptedException e) {
			System.out.println("Catch block, Unchecked Exception");
			
		}
		
		System.out.println("Work Done");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
			list.addAll(Arrays.asList(1,2,3));
			
			try {
			System.out.println(list.get(10));
			System.out.println("checked Exception occured in ArrayList");
			
			} catch(IndexOutOfBoundsException e) {  //RuntimeException can handle any unchecked exception
			
				System.out.println("unchecked Exception occured in ArrayList");				
			}
			
			System.out.println("__________________________________________________________");
			System.out.println("Done");
			
			try {
				Thread.sleep(2000);
				System.out.println("Try block, Checked Exception");
				
			} catch (Exception e) {
				System.out.println("Catch block, Unchecked Exception");
				
			}
		
	}
	
	public static void method(String KFC) {
		
	}

}
