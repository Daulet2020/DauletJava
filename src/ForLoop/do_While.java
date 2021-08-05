package ForLoop;

import java.util.Iterator;
import java.util.Scanner;

public class do_While {
	
	public static void main(String[] args) {

		boolean A = false;
		while (A) {
			System.out.println();
		}
		do {
			System.out.println("Hello");
		} while (A);
		
		/*
		 int x = 1;
		while(x<=200) {
			if (x%2==0) {
				System.out.print(x+" ");
			}
			x++;
		}
		 */
		
		int x = 1;
		do {
			if (x%2==0) {
				System.out.print(x+" ");
			}
			x++;
		} while (x<=100);
		
		System.out.println();
		
		do {
			System.out.println("Hello world");
			break;
		} while (true); 
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("enter second number");
		int b = scan.nextInt();
		
		System.out.println("addition is: "+(a+b));
		System.out.println("Do you wnat continue?");
		String answer = scan.next();
		
		if (answer.equalsIgnoreCase("No")) {
			break;
		 } 
	}
	
		
		
		
		
		
		
		
		
	}

}
