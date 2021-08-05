package Custom_Methods;

import java.util.Arrays;


public class returnMethodsPractice {
	
	public static void main(String[] args) {
		sum(5, 6);
		// int max = sum(5, 6); // does not return ane value
			
		addition(8, 6);
		System.out.println(addition(9, 8));
		
		long num = addition(5, 8);
		System.out.println(num);
		
		int greater = (int) max (50, 90, 5000);
		System.out.println(greater);
		
		int [] arr = {20,30,50,89,9};
		int maxNum = maximum(arr);
		System.out.println(maxNum);
		
		int [] arr1 = {5468, 48614, 687816, 684891};
		System.out.println(maximum (arr1));
		//System.out.println(max2);
		
		
		System.out.println(addition(8, 5));
		
		String[] names = {"Daulet", "Tomikosha", "Abdulla", "Michail"};
		System.out.println(LongName(names));
		
		
		int [] array = {8,9,7,5,6};
		array = Sort(array);
		System.out.println(Arrays.toString(array));
		
	}
	
	public static int maximum (int[] arr) {
	Arrays.sort(arr);
	return arr[arr.length-1];
	}
	
	
	public static void sum (int a, int b) {
		System.out.println(a+b);
	}

	public static int addition (int a, int b) {
		return a+b;
	}
	
	public static int max(int a, int b, int c) {
		int [] arr = {a, b, c};
		Arrays.sort(arr);
		
		return arr[arr.length-1];
	}
		
		/*
		  accept String array. and return longest String value
		 */
		
	public static String LongName(String [] arr) {
		String LongName = "";
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length()>max) {
				max = arr[i].length();
				LongName= arr[i];
			}
		}
		return LongName;
	
	}
	
		public static int[] Sort (int [] arr) {
		Arrays.sort(arr);
		int [] numbers = new int [arr.length]; // numbers array has same length with first one
		
		int z = 0;
		for (int i = arr.length-1; i>=0; i--) {
		numbers[z] = arr[i];
		z++;
		}
		return numbers;
		}
		
		
		
		
		
		
		
		}
			
	
	
	
	
	
	

