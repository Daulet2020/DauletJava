package Protected_vs_Default;

import OOP_Inheritance.ProtectedVSDefault;

public class Test extends ProtectedVSDefault {
//				sub				Super
	
	
	
	public static void main(String[] args) {
	/*ProtectedVSDefault obj = new ProtectedVSDefault();
	obj.printHello(); 	// protected access modifier is not visible outside of the package
	obj.printSalam();	// default access modifier is not visible outside of the package
	
	System.out.println(obj.name); // protected access modifier is not visible outside of the package
	System.out.println(obj.id);
	*/
	
	// Test obj = new Test();
	 System.out.println(name);
//	 System.out.println(id); // default access modifier is not visible outside of the package
	
	printHello();
	
	
	
	}
}
