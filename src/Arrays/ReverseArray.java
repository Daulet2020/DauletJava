package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		
		int [] numbers = {200, 300, 20, -59, 9, -35};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		for (int i = numbers.length-1; i >=0; i--) {
			System.out.print(numbers[i]+" ");
			}
		
	
		
	}

}
