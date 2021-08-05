package InitializerBlocks;

public class Static_VS_ins_VS_Cons {
	
	static {
		System.out.println("Static block");		// Static block does not depends on the object
	}												// executed asap the class is loaded, ONLY ONCE

	{
		System.out.println("Instance block"); 		// Instance block depends on the object 
														// when object is created, instance block runs first, then constructor
	}												
		
	public Static_VS_ins_VS_Cons() {	
		System.out.println("Constructor");		// Instance block execution depends on object
													// when object is created, constructor runs after the instance block
	}
	
	public static void main(String[] args) {
		Static_VS_ins_VS_Cons obj = new Static_VS_ins_VS_Cons();
		Static_VS_ins_VS_Cons obj2 = new Static_VS_ins_VS_Cons();
		Static_VS_ins_VS_Cons obj3   = new Static_VS_ins_VS_Cons();
		
	}


}
      