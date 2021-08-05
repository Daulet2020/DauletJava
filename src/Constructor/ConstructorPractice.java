package Constructor;

public class ConstructorPractice {
	
	// public sort (){ } in constructor, the method name MUST be same with class name
	
	// default constructor
	public ConstructorPractice (int a) {
		System.out.println("Hi I am constructor with parameter of int: " + a);
		
	}

	public static void main(String[] args) {
		
		ConstructorPractice obj = new ConstructorPractice(100);
		
		method();
		method2();
		
	}
	
	public static void method() {
		System.out.println("Regular method");
	}
	
	public static void method2() {
		ConstructorPractice obj = new ConstructorPractice(10);
		
	}
	
}
