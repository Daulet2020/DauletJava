package Statements;

public class single_IfStatement {

	public static void main(String[] args) {
		
		
		if (9>8) {
			// true
			System.out.println("9 is greater than 8");
		}
		 if (9<8) {
			 // false
			 System.out.println("8 is greater than 9");
		}
		
		System.out.println("Test complited");   // does not belongs to any 
		
		
		// Task 01:
		int num1 = 500;
		int num2 = 100;
		int max = 0;   // local variables needs to be initialized before 
		
		if (num1>num2) {  // means that num1 is greater than num2
			// false
			max = num1;
		}
		
		if (num2>num1) {
			max = num2;
		}
		
		if (num1==num2) {
			max = num2;
		}
		
		System.out.println("Maximum number between "+num1+" and "+num2+" is "+max);
		
		//Task02:
		
		int hours = 12;
		int minutes = 45;
		int seconds = 30;
		
		String amOrPm = "am";
		
		System.out.println(hours + ":" + minutes + ":"+seconds+" "+amOrPm);
		// hours:minutes:seconds am
		
		
		// Task03:
		// solution1
		int n1=20000, n2 =5050, n3 = 7000;
		int maximum = 0;
		
		/* in order to n1 be the maximum: n1>n2 && n1 >n3
		   in order to n1 be the maximum: n2>n1 && n2 >n3
		   in order to n1 be the maximum: n3>n1 && n3 >n2
		 
		 */
		
		if (n1>n2 && n1 >n3) {
			maximum = n1;
		}
		if (n2>n1 && n2 >n3) {
			maximum = n2;
		}
		if (n3>n1 && n3 >n2) {
			maximum = n3;
		}
		
		System.out.println("Maximum number between "+n1+", "+n2+ " and " +n3+" is "+ maximum);
		
		
		// solution 2:
		
		if (n1>n2 && n1 >n3) {
			System.out.println("Maximum number is: "+n1);
		}
		if (n2>n1 && n2 >n3) {
			System.out.println("Maximum number is: "+n2);
		}
		if (n3>n1 && n3 >n2) {
			System.out.println("Maximum number is: "+n3);
		}
		
		
		int A;
		if (true) {
			A = 12;
		}
			System.out.println(A);
			
		double B;
			if (true) {
				B = 100;
			}
		System.out.println(B);
		
		
		// Task 04:
		int statusCode = 405;    // can be different
		String finalResult = "";
		
		if (statusCode == 200) {
			finalResult = "ok";
		}
		if (statusCode == 201) {
			finalResult = "created";
		}
		if (statusCode == 404) {
			finalResult = "not found";
		}
		if (statusCode == 405) {
			finalResult = "not included"; 
		}
		System.out.println("status code "+statusCode+" is: "+finalResult);
		
		//Task 05:
		
		int a = 300-50;
		String str = "zero";
		/*
		 number to be positive: number >0
		 number to be negative number <0
		 number to be zero number ==0
		 */
		if (a>0) {
			str= "positive";
		//	System.out.println(a+ " is "+str);
		}
		if (a <0 ) {
			str = "negative";
		//	System.out.println(a+" is "+str);
		}
		if (a==0) {
			str = "zero";
		//	System.out.println(a+" is "+str);
		}
		 System.out.println(a+" is "+str);
		
	}
	
	
	
}
