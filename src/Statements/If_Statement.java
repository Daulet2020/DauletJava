package Statements;

public class If_Statement {
	
	/*
		if statement:
			
			single if statement:
				if (boolean expression) {
						some codes to run
				}
		      		if block only gets executed of the condition is true 
		
	 */
	
	
	public static void main(String[] args) {
		
		if (10>9) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off"+"\n");
		}
		
		int a = 1000;  //1001
		
		if (true) {
			//1000 == 1001 ==> false
			a=2000;
			System.out.println("a is increased");
			
		}
		
		System.out.println(a+"\n");
		
		int x= 987654321;
		if (x%2==0) {
			System.out.println(x);
			System.out.println(" it`s an even number");
		}
		
		if (x%2!=0) {
			//false
			System.out.println(x);
			System.out.println("it`s an odd number"+"\n");
		}
	
		int y = 2345678;
		if (y%5 ==0) {
			System.out.println(y+" can be devided by 5");
		}
		
		if (y%5 !=0) {
			System.out.println(y+ " can not be devided by 5"+"\n");
		}
		
		String CEO = "Main Boss";
		String Kuzzat = "Main Boss";
		
		System.out.println(CEO == Kuzzat); // true
		
		if (Kuzzat == CEO) {
			//true
			System.out.println("Great person");
			System.out.println("First if block"+"\n");
		}
		
		if (Kuzzat !=CEO) {
			//false
			System.out.println("Great person");
			System.out.println("Second if block"+"\n");

		}
		
		double TotalNumber = 100;
		boolean Cybertek = true;
		boolean BestSchool = true;
		
		if (Cybertek == BestSchool) {
			//true
			TotalNumber +=500;
		}
		if (Cybertek != BestSchool) {
			//false
			TotalNumber -=50;
		}
		
		System.out.println(TotalNumber+"\n");
		
		/*
		 1. declare a variable, and initialize user age
		 2. write program if the user eligible to vote for Trump
		 	vote age: 18
		 	
		 */
		
		byte PersonAage = 6;
		byte VoteAge = 18;
		if (PersonAage>=VoteAge) {
			//true 
			System.out.println("Yes you are eligible to vote");
			System.out.println("have fun with building the wall");
			System.out.println("Maga");
		}
		if (PersonAage <= VoteAge) {
			//false
			System.out.println("You are not eligible to vote");
			
		}
		
	}

}
