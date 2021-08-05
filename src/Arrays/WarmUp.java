package Arrays;

import java.util.Arrays;

public class WarmUp {
	
	public static void main(String[] args) {
		
		
		String [] ar = {"A", "B", "C", "C", "D" };
		
		for (int a = 0; a < ar.length; a++) {
		int coun = 0;
			for (int k = 0; k < ar.length; k++) {
			if (ar[k].equals(ar[a])) {
				coun++;				
				}
		}
			if(coun==1) {
				System.out.print(ar[a]+" ");
			}
		} System.out.println();

	/*
	 1. assign int array with length 100
	 2. assign 1~100 to the array` indexes
	 3. use loop to print even numbers
	 */
	
	  int [] nums;
	  nums = new int[100];
	  for (int i = 0; i < 100; i++) {
		  nums [i]=i+1;
	
	  }
	  System.out.print(Arrays.toString (nums));
	  System.out.println();
	  
	  for (int i : nums) {
		if (i%2!=0) {
			continue;
			
		}System.out.print(i+" ");
	}
	
	
	
	
	
	
	
	
	}
}
