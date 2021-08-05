package Scanner;

import java.util.Scanner;

public class Tasks {
	public static void main(String[] args) {
		
		/*
		 1. Wrire a program that calculates the sum of two numbers entered by user
		 2. Write a program that asks user enter three numbers and returns largest one
		 
		 */
		
/*	
 	Task 01
 	Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1");
		byte n1 = input.nextByte();
		System.out.println("Enter number 2");
		byte n2 = input.nextByte();
		
		System.out.println("Summ: " + (n1+n2));
	*/	
	
	/*
	 Task02
	 	Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers");
		byte num1 = scan.nextByte();
		
		byte num2 = scan.nextByte();
				
		byte num3 = scan.nextByte();
		
		byte max = 0;
		max = num1>num2 && num1>num3? num1 
				: num2>num1 && num2>num3 ? num2
						:num3;
		
		System.out.println("Max number is " + max);
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = input.nextLine();
		
		System.out.println("Enter last name");
		String lastName = input.nextLine();
		
		System.out.println("Full name: " + firstName+" " +lastName);
		
		input.close();  // gets rid off warning of the scanner class
		
			
		
	}

}
