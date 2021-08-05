package Arrays;

import java.util.Arrays;

public class Arrays_Review {
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		for (int i : arr) {
			if (i ==20) {
				continue;
			}
			System.out.print(i+" ");
			break;
		} System.out.println();
		System.out.println(Arrays.toString(arr)); 
		
		
	}

}
