package Statements;

public class Multi_Branch_If_Statement {
	
	/*
	 if-else if-else:
	 if (condition1) {
	  //A ==> if condition1 is true
	  }
	   else if (condition2) {
	  //B ==> if condition1 is false and condition2 is true
	  }
	   else {
	   //C ==> if condition1 and condition2 are both false
		 	 
	 */
	public static void main(String[] args) {
		if (false) {
			System.out.println("If block");
		}
		else if (false) {
			System.out.println("else if block");
		}
		else {
			System.out.println("else block");
		}
		
		/*
		 Task 01:
		 90 <= Grade 		==> A
		 80 <= Grade < 90 	==> B
		 70 <= Grade < 80 	==> C
		 60 <= Grade < 70 	==> D
		 	else ==>F
		 
		 
		 */
		
		int grade = 75;
		if (grade >=90) {
			System.out.println("You have made A, Great job");
		}
		else if (grade <90 && grade >=80) {
			System.out.println("You have made B, Good job");
		}
		else if (grade < 80 && grade >=70) {
			System.out.println("You made C, That`s OK");
		}
		else if (grade < 70 && grade >=60) {
			System.out.println("You made D, Really");
		}
		else {
			System.out.println("You made F, Study more");
		}
		
		
		
		// find a bug:
		
		int grade2 = 70;
		
		if (grade2 >=60) {
			System.out.println("D");
			}
		else if (grade2 >=70) {
			System.out.println("C");
		}
		else if (grade2 >=80) {
			System.out.println("B");
		}
		else if (grade2 >=90) {
			System.out.println("A");
		}
		else {
			System.out.println("F");
		}
		
		/*Task02:
		 1. Write a program that :
		 	1. 0 ~ 12 ==> good morning
		 	2. 12 ~ 15 ==> good afternoon
		 	3. 15~ 23 ==> good night
		 	4. 12 ==> good noon
		 
		  */
		
		int hour = -6;
		
		if (hour >=0 && hour <= 12) {
			System.out.println("Good morning");
		}
		else if (hour >=12 && hour <= 15) {
			System.out.println("Good afternoon");
		}
		else if (hour >=15 && hour <= 24) {
			System.out.println("Good night");
		}
		else if (hour > 24 || hour < 0) {
			System.out.println("Mistake");
		}
		else {
			System.out.println("Good noon");
		}
		
		/*
		 
		 	Task:
		 	int num1, num2, num3
		 	find the bigger number
		 	
		 */
		
		int num1=300, num2=300, num3=200;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is a bigger number");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is a bigger number");
		}
		else if (num3 > num2 && num3 > num1) {
				System.out.println(num3 + " is a bigger number");
		}
		else if (num3 == num2 && num3>num1) {
			System.out.println(num3 + " and "+ num2 +" is a bigger number");
		}
		else if (num3==num1 && num3 > num2) {
			System.out.println(num3 + " and "+ num1 +" is a bigger numbers");
		}
		else if (num1 == num2 && num2 > num3) {
			System.out.println(num2 + " and "+num1+" is a bigger numbers");
		}
		else {
			System.out.println("all of them are equal");
		}
	
	
	}
	
}
