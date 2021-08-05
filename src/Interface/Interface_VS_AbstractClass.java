package Interface;

public interface Interface_VS_AbstractClass {
	
	/*
	 Interface_VS_AbstractClass:
	 				Both can have abstract methods, used for achieving abstraction
	 				cannot create object from them
	 				Both of them cannot be final
	 				
	 	Abstract class: meant to be extended to the regular class, extends keyword
	 			methods: abstract and all non-abstract methods
	 			
	 			variables: any variables
	 			
	 			blocks: both instance and static blocks 
	 			
	 		sub class can only extend one abstract class
	 	
	 	
	 	
	 	Interface: meant to be implemented to the regular class, implements keyword
	 			methods: abstract, static and default methods
	 			
	 			variables: public final static
	 			
	 			blocks: cannot have any blocks
	 			
	 		sub class can implement multiple interfaces
	 
	 
	 
	 */
	
	  public abstract void method1();
	  public abstract int method2();
	  
	  public void method3();    	// public is by default
	  public void method4();		// public is by default
	  
	  
}

class Test1 implements Interface_VS_AbstractClass {

	@Override
	public void method1() {
		
		
	}

	@Override
	public int method2() {
		
		return 0;
	}

	@Override
	public void method3() {
		
		
	}

	@Override
	public void method4() {
		
		
	}
	
}
