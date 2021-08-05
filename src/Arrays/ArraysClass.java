package Arrays;

public class ArraysClass {
	
	public static void main(String[] args) {
		
		
		
		int [] VarName = {1, 2};
		
		String[] names = {"Nigar", "Maya", "Madina", "Daulet"}; 
		// 					0		1			2		3
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		String str1 = names[2];
		String str2 = names[3];
		
		System.out.println(str1);
		System.out.println(str2);
		
		double[] myArray = {1,2,3,4,8,0,8,9};
		//					0 1 2 3 4 5 6 7	
		for (int i=0; i<8; i++)
			System.out.print(myArray[i]+" ");
		
		
		System.out.println();
		
		
		// length of Array
		String str = "ABC";
		int A = str.length();
		System.out.println(A);   //3
			
		int[] numbers = {12, 24, 56, 5, 6, 8, 9, 10, 51};
		
		int B = numbers.length; // 9
		System.out.println(B);
		
		int HighestIndexNum = numbers.length-1; //8
		System.out.println(HighestIndexNum);
		
		for (int i = 0; i < numbers.length; i++) {
			int s1 = numbers[i];
			System.out.print(s1+" ");
		}
		System.out.println();
		
		
		char[] myChar = {'A', 'B', 'C', 'D'};
		int HighestIndexNumber = myChar.length;
		System.out.println(HighestIndexNumber);
		
		
		
		
	}

}
