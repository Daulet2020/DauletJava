package Arrays;

import java.util.Arrays;

public class ReviewMultiDimensionalArray {
	
	public static void main(String[] args) {
	
		int []   arr1D = {1,2,3};
		int [][] arr2D = { {1,2,3}, {4,5,6} };
		System.out.println(Arrays.deepToString(arr2D));
		
		char [] ch = {'a', 'b', 'c', 'd', 'c', 'e'};
		for (char each : ch) {
			if (each =='c') {
				continue;
			}
			System.out.print(each + " ");
		}
		System.out.println();
		
		
		String [][] names = {{"Erhan", "Holy", "Denis"}, {"Muhtar", "Mike", "Aliya"}};
		
		for (String[] each1D: names) {
		//	System.out.print(Arrays.toString(each1D));
			for (String eachValue:each1D) {
				System.out.print(eachValue+" ");
				
			}
		}
		
		
		
		
		
		
			
		}
		
	}


