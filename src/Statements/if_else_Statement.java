package Statements;

public class if_else_Statement {
	public static void main(String[] args) {
		
		if (9>=8) {
			System.out.println("9 is greater or equal to 8");
		}
		else {
			System.out.println("9 is less than 8");
		}
		// if 9 is greater or equal to 8, then 9 is must be less than 8
		
		
		if (false ==!false) {
			System.out.println("if block");
		}
		else {
			System.out.println("else block");
		}
		
		/*
		 Task 01:
		 if score < 60                ==> failed
		 if score >=60 but score < 90 ==>90
		 if score >=90               ==> passed with Distinction
		 
		 */
		
		int score = 40;
		if(score >=60) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		/*
		 1. triangle: has three angles,
		 			and sum of three angles must be equal 180
		 		
		 		1. declare three variables angle1, angle2 , angle3
		 		2. write program to check if the trianlge is valid or not 
		 			
		 */
		
		int angle1 =75, angle2=30, angle3=75;
		boolean valid = (angle1+angle2+angle3)==180;
		
		if (valid) {
			System.out.println("it`s a valid triangle");
		} else {
			System.out.println("Invalid triangle, do some math");
		}
		
		
		
		
		
	}

}
