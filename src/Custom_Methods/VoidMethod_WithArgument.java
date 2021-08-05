package Custom_Methods;

public class VoidMethod_WithArgument {
	
	/*
	 Method with argument: access-modifier specifier return-type(parameter) {
	 
	 }
	 
	 parameters: any data-type
	 
	 */
	
	public static void main(String[] args) {
		oddOrEven(5648413);
		
		int z =100;
		
		oddOrEven(z);   
		
		Sum(510, 156);
		
		RemoveDublicats("carcarcar");
	}
	
	public static void oddOrEven(int a) {
		if (a%2==0) {
			System.out.println(a+ " is even number");
		} else {
			System.out.println(a+ " is odd number");
		}
		
	}
	 
	public static void Sum (int x, int y) {
		System.out.println("Summ of " + x + " and "+y + " is: "+ (x+y));
		
	}
	
	public static void RemoveDublicats(String a) {
	// String a = "carcarcar";
	//            "car"   
	String a1 = "";
		for (int i = 0; i < a.length(); i++) {
		if (!a1.contains(a.substring(i, i+1))) {
			a1 +=a.substring(i, i+1);
		}
	}
	System.out.println(a1);
	
	
	}
	
}
