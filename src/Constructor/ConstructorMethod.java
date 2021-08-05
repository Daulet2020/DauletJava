package Constructor;

public class ConstructorMethod {
	
	public ConstructorMethod(int a) {
		System.out.println("Constructor with args: "+a);
	}
	
	public ConstructorMethod (double a) {
		this (10695);
		System.out.println("Constructor with args: "+a);
	}
	
	public ConstructorMethod (boolean a) {
		this(1099848.15);
		System.out.println("Boolean with args of: "+a);
	}
	
	  
	public static void main(String[] args) {
		ConstructorMethod obj = new ConstructorMethod(100);    // 1
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		ConstructorMethod obj2 = new ConstructorMethod(10.35); //2
		
		System.out.println("+++++++++++++++++++++++++++++++");
		ConstructorMethod obj1 = new ConstructorMethod(false);  //3
		
		System.out.println("================================");
		ConstructorMethod obj3 = new ConstructorMethod(1658.357);
		  
	}
	

}
