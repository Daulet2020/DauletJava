package Custom_Methods;

import java.util.Arrays;


public class Method_Overloading {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6};
		sort(arr);
		
		char [] ch = {'a', 'b', 'c', 'd'};
		sort(ch);
		
		String [] str = {"A", "B", "C"};
		sort(str);
	}

	
	public static void sort (int [] arr) {
	Arrays.sort(arr);
	for (int i = arr.length-1; i>=0; i--) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}


	public static void sort (char[] ch) {
	Arrays.sort(ch);
	for (int i = ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
			
		}System.out.println();
	}
	public static void sort (String [] str) {
		Arrays.sort(str);
	for (int i = str.length-1; i>=0; i--) {
		//	System.out.println(Arrays.toString(str));
		System.out.print(str[i]);
	}		
		
			
	}
	
}
