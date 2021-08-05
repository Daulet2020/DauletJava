package Arrays;

import java.util.Scanner;

public class ArraysPatcice1 {
	
	public static void main(String[] args) {
	
	//	int [] numbers = new int[5];
		Scanner scan= new Scanner(System.in);
		
	/*	for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number");
			numbers[i] = scan.nextInt();
		}
		int sum= 0;
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println("Sum of numbers is: "+sum);
	*/	
		
		String [] names = {"Daulet", "Denis", "Sergei", "Muhamed"};
		int max = 0;
		String LongName = "";
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > max) {
				max = names[i].length(); 
				LongName=names[i];
			}
		}
		System.out.println(max);
		System.out.println(LongName);
		
		
		
		//appearance of unique number
		int [] arr = {1,1,1,2,3,3,4,1};
		for (int j = 0; j < arr.length; j++) {
		int count = 0;
		for (int  i = 0; i < arr.length; i++) {
			if (arr[i] ==arr[j]) {
				count++;
				}
		}
		if (count==1) {
			System.out.print(arr[j]+" ");
		}

		}
				System.out.println("\n");
				
	
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
