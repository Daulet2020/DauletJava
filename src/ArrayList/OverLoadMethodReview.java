package ArrayList;

public class OverLoadMethodReview {
	
	public static void main(String[] args) {
		sum(50.6, 65.3);
		
		sum(95, 65, 124);
		
		
	}
	
	public static void sum (int a, int b) {
		System.out.println("int sum is: "+(a+b));
	}
	public static void sum (double a, double b) {
		System.out.println("double sum is: "+(a+b));
	}	
	public static void sum (int a, int b, int c) {
		System.out.println("int sum is: "+(a+b+c));
	}
	public static void sum (double a, long b, boolean c) {
		System.out.println("You have entered "+a+ " "+b+" "+c);
	}
	public static int sum (int a, double b, byte c) {
		int sum = a + (short)b+c;
		return sum;
	}

}
