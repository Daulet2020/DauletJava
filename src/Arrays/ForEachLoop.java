 package Arrays;

import java.util.Arrays;

public class ForEachLoop {
	
	public static void main(String[] args) {
	
		/*
		 syntax: 
		 	for (DataType each: ArrayName
		 */
		
		int [] arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			arr [i] = i+1;
			System.out.print(arr[i]);
		}
		System.out.println();
		
		System.out.println("==========================");
		for (int each: arr) {
			System.out.print(each);
		}
		System.out.println();
		
		String [] str = {"A", "B", "C", "D"};
		for (String each : str) {						// "each" could any word or letter and represents values of array
			System.out.print(each);
		}
		System.out.println();
		
		char [] ch = {'z', 'x', 'y', 'c', 'a', 'b'};
		Arrays.sort(ch);
		for (char charz : ch) 
		System.out.print(charz);
		
		System.out.println();
		
		int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
		for (int i : arr1) {
			if (i%2!=0) {
				System.out.print(i);
			}
		} System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
