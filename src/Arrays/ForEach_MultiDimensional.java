package Arrays;

public class ForEach_MultiDimensional {
	
	public static void main(String[] args) {
		
	int [] arr1D = {1,2,3};
	
	int [][] arr2D = { {1,2,3}, {4,5,6,7,8}, {9,10,11}, {12,13,14}    };
		//  			  0			 1			2			3
	for (int i = 0; i < arr2D.length; i++) {
		for (int j = 0; j < arr2D[i].length; j++) {
			System.out.print(arr2D[i][j]+" ");
		}		
	} System.out.println();
	
	for (int[] each1 : arr2D) {
		for (int each2 : each1) {
			System.out.print(each2+" ");
		}
	}
	System.out.println();
	
	String [] [] str2D = { {"Daulet", "Assel"}, { "Tomiris", "Aigerim" }  };
		for (String[] str : str2D) {
			for (String strings2 : str) {
				System.out.print(strings2+" ");
			}
		}
	System.out.println();
	
		int [][] num2D = { {1,2,3}, {4,5,6,7,8}, {9,10,11}, {12,13,14}    };
		int [][][] num3D = { { {1,2,3}, {4,5,6,7,8}}, {{9,10,11}, {12,13,14}}    };
		for (int[][] each2Darray : num3D) {
			for (int[] each1DArray : each2Darray) {
				for (int EachValues : each1DArray) {
					System.out.print(EachValues+" ");
				}
				
			}
			
			
		}
	
	
	
	
	
	
	
	}

}
