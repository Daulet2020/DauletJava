package Arrays;

import java.util.Arrays;

public class Multi_Dimensional_Array {
	
	/*
	 n dimensional array contain (n-1) dimensional array
	 */
	
	public static void main(String[] args) {
		
	//	int [] arr1D= {1, 2, 3};
		// 2 dimensional array: array that contains (2-1) dimensional array
		int [] [] arr2D = { {1, 2, 3}, {4, 5, 6 }};
				//				0	 ,		1
		String [] arr = {"A", "B"};
		
				//			  0    1      0    1	
		String [][]str2D = {{"A", "B"}, {"C", "D", "E"}};
				//				0			1
		// [represents the index number of first dim array][represents the index number of values]
		System.out.println(str2D[0][0]);	// A
		System.out.println(str2D[1][1]);	// D
		System.out.println(str2D[1][2]);	// E
		
		System.out.println(Arrays.toString (str2D [0]));
		System.out.println(Arrays.toString (str2D [1]));

		
		System.out.println(Arrays.toString(arr2D[1]));
		
		// print [[A,B], [C, D, E]]
		System.out.println(Arrays.toString(str2D));      // Hash code
		System.out.println(Arrays.deepToString(str2D));  // Arrays.deepToString(VariableName): converts multi-Dimensional Array
		
		//                      0 1     0   1   0  1  2  3  4   5
		int [][] Numbers2D = { {1,2}, { 3, 4}, {5, 6, 7, 8, 9, 10} }; 
		//						 0 		  1		  2
		System.out.println(Numbers2D[2][1]); // 6
		System.out.println(Numbers2D[2][5]); // 10
		
		System.out.println(Arrays.toString(Numbers2D[2]));
		System.out.println(Arrays.deepToString(Numbers2D));
		
		
		int [][] Array2D = {{1,2}, {3,4}};
		
		//                          0		 1        2					   0     1
		int [][][] Array3D = {  {{1,2,3}, {3,4,5}, {6,7,8}},           {{9,10}, {11,12}}       };
		//                                 0                                 1
		System.out.println(Array3D[1][0][1]);
		System.out.println(Array3D[0][2][1]);
		System.out.println(Array3D[0][2][0]);
		
		System.out.println(Arrays.toString(Array3D[0][2]));     // [6,7,8]
		System.out.println(Arrays.deepToString(Array3D[0]));    // [1,2,3], [3, 4,5], [6,7,8]
		System.out.println(Arrays.deepToString(Array3D));		// [  [[1,2,3], [3,4,5], [6,7,8]],  [[9,10], [11,12]] ]
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
