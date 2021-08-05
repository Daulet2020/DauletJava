package Custom_Methods;

public class CustomMethodReview {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 2; i++) {
		method1();
		}
		
		oneTo100Even();
		
		RevertStr("Daulet");
		
		largestNumber(90, 80);
		
		System.out.println(largestNumber(62, 93));
		
		String Tomiris = Reverse("Tomiris");
		System.out.println(Tomiris);
	}

	public static void method1() {
		System.out.println("Hello world");
		System.out.println("Hello Dake");
		
	}
	
	public static void oneTo100Even () {
		for (int i = 1; i <=100; i++) {
			if (i%2==0) {
				continue;
			}System.out.print(i+" ");
		} System.out.println(); 
	} 
	
	public static void RevertStr (String str) {
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			}
			System.out.println();
		}
		
	public static int largestNumber (int a, int b) {
		int max = 0;
		if (a>b)
			max = a;
		else 
			max = b;
		System.out.println(max);
		return max;
		
	}
		
	public static String Reverse (String str) {
		String result = "";
		for (int i = str.length()-1; i>=0;  i--) {
			result +=str.substring(i, i+1);
		}
		return result;
	}
	
	
	}
	
	

