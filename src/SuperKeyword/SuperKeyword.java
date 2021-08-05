package SuperKeyword;

class A {
	
	String name = "Madina";
	
	public void methodA () {
		
	}
	
	public A(int a) {
		
	}


}

public class SuperKeyword extends   A  {
	//			sub				  super
	
	public SuperKeyword (double b ) {
		super(10);					// super(): used for calling the constructors from the super class MUST be used in the sub class
									// this(): used for calling the contructors from the class itself
	
	}			
	
	
	/*
	 has String name = "Madina"; 
	 */
	
	public void method() {
		super.name = "Sergei";  // super.: used for calling instances from the super class to use super  
		this.name = "Daulet"; 	// this.: used for calling instances from the class itself, we do not need inheritance
		
		super.methodA();
		this.methodA();
		
	}
	

}
