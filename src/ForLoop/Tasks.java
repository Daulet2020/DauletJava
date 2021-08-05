package ForLoop;

import java.util.Scanner;

public class Tasks {
	public static void main(String[] args) {
		
		/*
		 
		 for (initialization; condition; iterator){
		 	statements that we want to repeat
		 
		 }
		  
		 
		 */
		
		for (int i =1; i<=10; i+=2 ) {
			System.out.println("Value if i is: "+i);
		}
		
		/*
		 Task 01
		 */
	
		for (int i = 1; i<=10; i++) {
			System.out.println("the square of " + i + " is: "+(i*i) );
		}
		
		
		/*
		 Task 02
		 Write a program that displays each even numbers between 1 to 32
		 */
		
		for (int i =32; i>=0; i-=2) {
			System.out.println("Even number is " + i);
		}
		
		/*
		 Task 03
		 Write a program that displays each odd numbers between 1 to 32
		 */
		for (int i = 1; i <=32; i++) {
			if (i%2 !=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		String str = "Java is fun";
		String Rev = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
		System.out.println(Rev);
		
		
		
		String Reverced = "";
		for (int i =str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println(Reverced);
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		
		int n = scan.nextInt();
		
		for (int b = 30; b <=n; b *=n) {
			System.out.println(b);
			
		//System.out.println("Multiplication of " + n + " is "+n*n);
		
		}
	}

}
