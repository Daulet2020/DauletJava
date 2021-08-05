package ArrayList;

import java.util.Arrays;

public class DiscendingOrder {
	
	public static void main(String[] args) {
		
		int []arr = {85, 76, 956, 127, 976, 288};
		arr = Sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public static int [] Sort(int[] arr) {
		Arrays.sort(arr);
		int [] arr2 = new int[arr.length];
		int j = 0;
		for (int i = arr.length-1; i>= 0; i--) {
			arr2[j] = arr[i];
		//  arr2[arr2.length-1-i] = arr[i];
			j++;
	}
		return arr2;
	}
	
}
