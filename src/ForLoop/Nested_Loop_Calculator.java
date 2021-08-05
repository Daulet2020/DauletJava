 package ForLoop;

import java.util.Scanner;

public class Nested_Loop_Calculator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to do multiplication");
		String str = scan.next().toLowerCase();
		
		if(str.equals("yes")) {
		while(true) {
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Result is: "+(a*b));
		System.out.println("Do you want to continue");
		scan.nextLine();
		String answer = scan.nextLine().toLowerCase();
		while (!(answer.equals("no")|| answer.equals("yes"))) {
			System.out.println("Please make up your mind");
			System.out.println("Do you wanna continue");
				answer = scan.nextLine();
		}
	}
				
	}
		if (str.equals("no")) {
			System.out.println("Please make up your mind");
		//	break;
			
		
		}	
	
	
	
	
	}
		}

