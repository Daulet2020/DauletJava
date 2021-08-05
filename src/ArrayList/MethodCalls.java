package ArrayList;

import Custom_Methods.returnMethodsPractice;

public class MethodCalls {
	public static void main(String[] args) {
		method3();
		int max2 = max(10, 20); 	  		//20
		System.out.println(max2);
		
		int max3 = max(400, 3560, 6); 		//3560
		System.out.println(max3);
		
		maximum(521, 397, 915);				//915
		
		String str = print(10, 20, 30);    // 30
		System.out.println(str);
		
		System.out.println(max(98, 865, 795, 258));
		System.out.println(max(258, 986, 25900, 92, 123));
		
		String str1 = "AAABBBCDEEE"; 
		System.out.println(Dublicate(str1));
		
	}
	public static void method1() {
		System.out.println("A");
	}
	
	public static void method2() {
		method1();
		System.out.println("B");
	}
	
	public static void method3() {
		method2();
		System.out.println("C");
	}
	
	public static int max (int a, int b) {
		return (a>b)? a:b;
	}
	
	
	public static int max (int a, int b, int c) {
		return (max(a, b) >c)? max(a, b) : c;
	}
	
	public static int max (int a, int b, int c, int d) {
	/*	int result = max(a, b, c);
		if (result>d) { 
		return result;
		} return d;
			}
	*/
		return max ( max(a, b), max (c,d) );
	}
	
	public static void maximum (int a, int b, int c) {
		System.out.println(max(a, b, c));
	}
	
	public static String print (int a, int b, int c) {
		maximum(a, b, c);
		return "900";
	}
	
	public static int max (int a, int b, int c, int d, int e) {
	return max (max(a,b,c,d), e);
	}


	public static String Dublicate (String str) {
		String input = "ZXXXYYYZZZZ";	// expected result: Z5X3Y3
		String NonDupl = "";
		for (int i = 0; i < input.length(); i++) {
			if(!NonDupl.contains(""+input.charAt(i))) {
			NonDupl+=""+input.charAt(i);
				}
			} 
		String res = "";
		for (int i = 0; i < NonDupl.length(); i++) {
			int b =0;
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j)== NonDupl.charAt(i)) {
			b++;		
				}
				
			} res+=""+NonDupl.charAt(i)+b;
		}	
			return res;
	}

}
