package Interface;

interface B {
	void method3();
}

public interface Extends_VS_Implement extends   B         {
					//subtype				  supertype
	/*
	 extends keyword: 	a class can be extended by multiple classes
	 					a class can extend only class
	 					
	 					class extends class
	 					interface extends interface
	 
	 implements: 		only used for interface to be implemented to the class
	 					can implement as many interfaces as we want
	 					
	 					 class implements interface
	 					 
	 we can use extends and implements keyword at the same time
	 
	 class extends class and then implements interface (S)
	 
	 */
	
	void method1();
	void method2();

}

class A implements Extends_VS_Implement {

	@Override
	public void method3() {
		
		
	}

	@Override
	public void method1() {
		
		
	}

	@Override
	public void method2() {
		
		
	}
	
}

class C extends A implements Extends_VS_Implement{
	
	 
}
