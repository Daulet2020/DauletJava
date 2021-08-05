package Protected_vs_Default;

class A {
	public static void MethodA() {
		System.out.println("A");
	}
}

class B extends A {
/*	public static void MethodA() {
		System.out.println("A");
	*/
	public static void MethodB() {
		System.out.println("B");
		} 
	public static void main(String[] args) {
		MethodA();
		MethodB();
	}
}

public class InheritanceReview extends B{

	public static void MethodC() {
	/*	public static void MethodA() {
			System.out.println("A");
		*/
		
		System.out.println("C");
   }
	
	public static void main(String[] args) {
		MethodA();
		MethodB();
		MethodC();
		
	}
}
