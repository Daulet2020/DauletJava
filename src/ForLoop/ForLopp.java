package ForLoop;

public class ForLopp {
	public static void main(String[] args) {
		/*
		 	 loop: repeating action
		 for loop: 
		 	(initialization; condition; iterator){
		 	statements that we want to repeat
		  }
		 
		  initialization: ussualy the times of the number that we wanna execute the loop
		   					starting point int i=10..... 
		  
		  condition: created based on the initialization i < 10 ....
		  iterator: co-related to the condition.
		  					needs to be capable to make the condition false
		  if the condition of loop is true, the loop will keep executed
		  
		 */
		
		for (byte i = 2; i <=19; i +=6) {
			System.out.println("Hello");
		}
	
		/*
		 Task 1
		 1  = 1
		 2	= 4
		 3	= 9
		 */
	for (byte d = 1; d <=10; d ++) {
	
		System.out.println("The square of "+ d + " is " +  d*d);
	}
		
		
		
	}

}
