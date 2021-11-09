package Exceptions;

public class ExceptionClass {
	
	// Exceptions:
			//unchecked (unexpected) occurs during runtime
			//checked occurs compile time, NEEDS to be handle immediately
	
	// all the RuntimeExceptions are unchecked exceptions
	
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
			System.out.println( arr [100] ); // unchecked
			
	//		Thread.sleep(1000);                 checked
			
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
			
			
			
	
	}

}
