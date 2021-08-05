package Arrays;

import java.util.Scanner;

public class PracticeMaxNum {
	public static void main(String[] args) {
		
		int[] arr = {12, 24, 56, 5, 6, 8, 9, 10, 51};
		int max = 0;
		int min = 100000;
		for (int i=0; i<arr.length; i++) {
				if (arr[i]>max) {
					max = arr[i];
				}
				if (arr[i]<min) {
					min = arr[i];
				}
			}
		int secMax = 0;
		int secMin = 100000;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j]>secMax && arr[j]!=max) {
				secMax = arr[j];
			}
			if (arr[j]<secMin && arr[j]!=min) {
				secMin=arr[j];
			}
		}
		System.out.println("Max number is: "+max);
		System.out.println("Second max is: "+secMax);
		System.out.println("Min number is: "+min);
		System.out.println("Second min number is: "+secMin);
	
		
	
		}
}


