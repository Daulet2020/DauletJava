package ForLoop;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i=1; i<=1000; i++) {   //i:1~1000
			sum +=i;
		}
		System.out.println(sum);
		
		
		
		int sum1 = 0;		
		for (int b=1; b <=1000; b++) {
			if (b%2 !=0) {             // odd numbers
				sum1+=b;
	} 
		}
		System.out.println(sum1);
		
		int sum2 = 0;		
		for (int a=1; a <=1000; a++) {
			if (a%2 ==0) {             // even numbers
				sum2+=a;
	} 
		}
		System.out.println(sum2);
	
		
		
		Scanner scan = new Scanner(System.in);
		int Sum = 0;
		
		for (int i=1; i<=5; i++) {
		System.out.println("Enter number");
		int inNum = scan.nextInt();
		sum+=inNum;
		} 
		System.out.println("Sum is "+sum);
		
		
		
		
		
	}

}


