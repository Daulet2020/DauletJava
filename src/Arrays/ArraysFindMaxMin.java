package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFindMaxMin {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter 3 numbers");
		int a  = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int numbers[] = {a, b, c};
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("Min number is: "+numbers[0] );
		System.out.println("Max number is: "+numbers[numbers.length-1]);
		
		
		System.out.println("How many numbers you like to add");
		int nums = scan.nextInt();
		int [] arr1 = new int [nums];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter number ");
		arr1[i] = scan.nextInt();
		}
		Arrays.sort(arr1);
		System.out.println("Min number is: "+arr1[0] );
		System.out.println("Max number is: "+arr1[arr1.length-1]);
		
		
	}

	
	}

