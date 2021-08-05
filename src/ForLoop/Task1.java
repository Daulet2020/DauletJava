package ForLoop;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
	/*	Scanner scan = new Scanner(System.in);
			int Max = 0;
			
			for (int i=1; i<=5; i++) {
			System.out.println("Enter number");
			int inNum = scan.nextInt();
			if (inNum>Max) {
				Max = inNum;
			}
		}
			System.out.println("Max num is "+Max);
			
			*/
			
			Scanner scan1 = new Scanner(System.in);
			int min = 100000;
			int Max = 0;
			
			for (int i=1; i<=5; i++) {
			System.out.println("Enter number");
			int inNum1 = scan1.nextInt();
			if (inNum1>Max) {
				Max = inNum1;
			}
			if (inNum1<min) {
				min = inNum1;
			}
			
		}
			System.out.println("Max num is "+Max);
			System.out.println("Min num is "+min);
			System.out.println("All good");

	}

}
