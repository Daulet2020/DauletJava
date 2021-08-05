package Statements;

public class If_without_CurlyBrace {
	
	public static void main(String[] args) {
	
		/*
		 
		 single if statement:
		 if (condition) {
		 // single line os statement  only
		 }
		 
		 */
		
		
		if (false)
		{
			System.out.println("Today is friday");
			System.out.println("Tomorrow is day off");
			System.out.println("there is no java class tomorrow");
		}
		
		if (false)
			System.out.println("Today is friday");
		
		if (true)
			System.out.println("Hello");
		
		
		
		/*
		 Multi-branch if statement:
		 	if (condition1)
		 	// single line of statement
		 	else if (condition2)
		 	// single line of statement
		 	else (condition3)
		 	// single line of statement
		 
		  */
		
		if (true)
			System.out.println("Hello");
		else if (true)
			System.out.println("else if block");
		else
			System.out.println("else block");
		
		// else block not mandatory
		// after if without curly braces only 1 line statement
		 if (true)
			 System.out.println("Merry Christmas");
		 
		 else System.out.println("New Year");
		
		int grade = 70;
		if (grade <= 100 && grade >=0) {
			if (grade >= 90) {
				System.out.println("A");
			}
			else if (grade >=80) {
				System.out.println("B");
			}
			else if (grade >=70) {
				System.out.println("C");
			}
		}
		else {
			System.out.println("Invalid Entry");
		}
		
		if (grade <= 100 && grade >=0)
			if (grade >=90) System.out.println("A");
			else if (grade >=80) System.out.println("B");
			else if (grade >=70) System.out.println("C");
			else System.out.println();
		else System.out.println("Invalid entry");
			
	}

}
