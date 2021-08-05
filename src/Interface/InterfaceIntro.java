package Interface;

public interface InterfaceIntro {
	
	// Why we need interface? 	A class can implement multiple interfaces
	//							A class can extend one class only
	
	
	// public InterfaceIntro () {} 		Interface CANNOT have Constructor
	// public void methodB(){} 			Interface CANNOT have 	Instance methods
					//					Interface CANNOT have 	Instance variables
					//											instance block
					//											static block
	
	
	public abstract void MethodA();
	
	public static void mm() {} 			// Interface CAN have: Abstract methods, static methods, default method
	
	int a = 100;						 //public static final by default
	public static final int b = 100;
		
	
	public static void main(String[] args) {
		InterfaceIntro.mm();
		System.out.println(a); 			// in Interface variables are public, final and static by default
	//									a = 200;
	}
	/*					Interface we have used:
							WebDriver
							WebElement
							
							List
							Set
							Map
	
	*/

}

interface Data {
	
}

class Test implements InterfaceIntro, Data { // class can implement multiple interfaces
	
	@Override
	public void MethodA() {
		
	}
	
	
	
}
