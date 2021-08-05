package Arrays;

import java.util.Arrays;

public class ArraysMethods {
	
	public static void main(String[] args) {
	
		int num = 10;
		System.out.println(num);
		
		int[] arr = {1,2,3};
		System.out.println(arr);
		String str = Arrays.toString(arr);
		System.out.println(str);
	
		String[] names = {"Daulet", "Aisha", "Tarcan"};
		System.out.println(names[0]);
		System.out.println(Arrays.toString(names));   // converts array tp String value
		
		int [] Num = {8, 9, 59, 25, 1, 5};			  // sorts in ascending order 
		Arrays.sort(Num);
		System.out.println(Arrays.toString(Num));
		
		System.out.println("Maximum " + Num[Num.length-1]);
		System.out.println("Minimum " + Num[0]);
		
		String [] list = {"Daulet", "Alma", "Assel", "Sarah", "Daalet"};
		Arrays.sort(list);								// alphabetical order
		System.out.println(Arrays.toString(list));
		
		char[] ch= {'0', '9', '8', '7', '8', '0'};
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		int [] Nums = {200, 56, 598, 125, 2, 56, -56};
		Arrays.sort(Nums);
		System.out.println(Arrays.toString(Nums));
		System.out.println("Minimum number: "+Nums[0]);
		System.out.println("Maximum: " + Nums[Nums.length-1]);
		System.out.println("Minimum number: "+Nums[0]);
		
		// Print in descending order
		
		int [] Numb = {220, 58, 5498, 1125, 252, 6, -56};
		Arrays.sort(Numb);
		for (int i = Numb.length-1; i >= 0; i--) {
			System.out.print(Numb[i]+", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(Numb));

		int [] Num1 = {500, 508, 51498, 85125, 252, 6, -5};
		Arrays.sort(Num1);
		int [] Num2 = new int [Num1.length];
		int z = 0;
		for (int i = Num1.length-1; i >= 0; i--) {
			Num2[z]= Num1[i];
			z++;
		}
		System.out.println("Ascending order: "+Arrays.toString(Num1));
		System.out.println("Descending order: "+Arrays.toString(Num2));
		
		
		int [] ar1 = {5850, 508, 2359, 285125, 252, 6595, -75};
		Arrays.sort(ar1);
		int [] Descending = new int [ar1.length];
		int x = 0;
		for (int i = ar1.length-1; i >=0; i--) {
			Descending[x] = ar1[i];
			x++;
		}
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(Descending));
		
		
		
		
		
		
		
		
		
	}

}
