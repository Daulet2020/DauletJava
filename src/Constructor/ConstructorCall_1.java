package Constructor;

public class ConstructorCall_1 {
	
	
	public ConstructorCall_1 () {
		 System.out.println("A");
		}
	public ConstructorCall_1 (int a ) {
		this();
		System.out.println("B");   // A B
	}
	
	public ConstructorCall_1 (double a) {
		this (10); // 
		System.out.println("C");
	}
	
	
	public static void main(String[] args) {
		method1();
		ConstructorCall_1 obj = new ConstructorCall_1 (125.25   );
		}
	public static void method1() {
		
	}
		}
