package Constructor;

public class ConstructorWithArgs {
	
	public ConstructorWithArgs() {
		System.out.println("Hello world");
		System.out.println("I am a default constructor");
	}
	public ConstructorWithArgs(int num) {
		System.out.println("Hello world");
		System.out.println("I am a constructor with an argument of int: "+num);
	}
	public static void main(String[] args) {
		
		/* Declaration of Constructor: access-modifier className (Parameter) {
							statements;
							}
		    
		 */
		ConstructorWithArgs obj = new ConstructorWithArgs(8);
		method();
	}
	public static void method() {
		ConstructorWithArgs obj = new ConstructorWithArgs(8);
	}
	

}
