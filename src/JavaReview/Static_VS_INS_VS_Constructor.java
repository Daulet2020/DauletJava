package JavaReview;

public class Static_VS_INS_VS_Constructor {
	
	static {
		System.out.println("Static block");
		// executed asap the class is loaded
		
	}

	//________________________________________________________
	
	{
		System.out.println("Instance block");
		//executed when the object created
	}

	//_________________________________________________________
	
	
		public Static_VS_INS_VS_Constructor() {
			System.out.println("Constructor");
		//executed when the object created, runs after the instance block
	}
	
	//_________________________________________________________
	
	public static void main(String[] args) {
		
		Static_VS_INS_VS_Constructor obj = new Static_VS_INS_VS_Constructor();
		Static_VS_INS_VS_Constructor obj2 = new Static_VS_INS_VS_Constructor();
	
		// number of execution and instance block depends on the number of objects
	}
	
}
