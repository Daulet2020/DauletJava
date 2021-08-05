package Statements;

public class Nested_if {
	
	public static void main(String[] args) {
		
		/*
		 
		 if (condition1) {
		 	if (condotio2) {
		 	//some code to run
		 	 }
		 	}
		 
		 
		 */
		
		
		if (true) {
			System.out.println("Hello Daulet"); // printed
			if (false) {
				System.out.println("Hello world");
			} else {
				System.out.println("Hello Grand"); // printed
			}
		}
		
		/*
		60 <= grade <70  ==>D
		70 <= grade <80 ==> C
  		80 <= grade <90 ==> B
		90 <= grade <100 ==> A
		grade < 60 ==> F
		 
		 */
		
		double grade = 61;
		
		if (grade >=60 && grade <=100 ) {
			System.out.print("Passed");
			if (grade >=91 && grade <=100) {
				System.out.println("\tWith an A");
			} else if (grade >=81 && grade <= 90) {
				System.out.println("\tWith B");
			} else if (grade >=71 && grade <= 80) {
				System.out.println("\t With grade C");
			} else if (grade >= 60 && grade <= 70) {
				System.out.println(" With grade D");
			}
			
		} 
		else {
			if (grade >=0 && grade <59 ) { 
				System.out.println("Failed");
			}
			 else { // greater 100
				System.out.println("Invalid score, 404 ");
			}
			
		}
		
		
		/*
		 Declare a variable called Age 
		 age >= 18 => Cigra
		 age >= 21 => Hookah
		 age >= 25 => alcohol
		 
		 age < 18 => none
		 
		 */
		
		int age = 10000;
		boolean GoodPerson = false;
		
		if (age >= 18 && age <105) {
			System.out.println("You can buy milk");
			
			if (GoodPerson) {
			System.out.println("Alcohol is bad for you");
			} 
			else {
				System.out.println("You can buy cigra");
				if (age >= 21) {
			System.out.println("You can buy hookah");
		} 
				if (age >=25) {
					System.out.println("You can buy alcohol");
				}
			}		
				
		}  else {
			if (age<18 && age >0)
			System.out.println("Drink milk");
			else {
				System.out.println("Error");
			}
		}
		
		/*
		 write a program that can find number of days in a month
		 
		 Jan 31, Feb 28, March 31, Apr 30, May 31, Jun 30, Jul 31, Aug 31, Sep 30, Oct=31, Nov 30, Dec31
		  1       2       3         4       5		6		7		8		9		10		11		12
		 
		 
		 */
		
		String month = "January";
		
		if ( month == "January" ||  month == "March" || month == "May" || month == "July" || month == "August" || month == "October" || month == "December") {
				System.out.println("31 days");
			} else if (month ==  "April" || month == "June" || month == "September" || month == "November") {
				System.out.println("30 days");
			} else if (month == "February" ) {
				System.out.println("28 days");
			} else {
				System.out.println("Invalid month");
			}
	
		
		if (true) { //true
			System.out.println("hello");
		}
		else {     // false
			System.out.println("Batch 12");
		}
		
		if (true) { // true
			System.out.println("hello");
		}
		else if (false) { // false
			System.out.println("Batch 12");
		}
		else {  // NEVER GETS EXECUTED
			System.out.println("Cybertek");
		}
	

	
	}
}

			
	

