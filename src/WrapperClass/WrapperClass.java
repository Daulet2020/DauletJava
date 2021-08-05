package WrapperClass;

import java.util.Arrays;

public class WrapperClass {
	
	public static void main(String[] args) {
		int numInt = 10;
		Integer numInteger = 10;
		
		double numdouble = 5.5;
		Double numDouble = 5.5;
		
		long longnum = 20l;
		Long Longnum = longnum;   // Auto-boxing
		
		System.out.println(longnum);
		System.out.println(Longnum);
		
		Boolean Booleanresult = false;
		boolean booleanResult = Booleanresult;
		
		double [] arr = new double [3];
		System.out.println(Arrays.toString(arr));
		
		int num1 = 10;
	//   num1.method ();
		
		Integer num2 = 2;
		int x = num2.MAX_VALUE;
		System.out.println(x);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
