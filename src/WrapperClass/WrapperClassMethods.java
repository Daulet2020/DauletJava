package WrapperClass;

public class WrapperClassMethods {
	/*
	 usefull methods of Wrapper class:
	 		Max_Value
	 		Min_Value
	 		parse methods
	 		ValueOf methods
	  */
	public static void main(String[] args) {
		// max Value: returns the maximum value of the primitive
		int maximum = Integer.MAX_VALUE;
		System.out.println(maximum);
		
		int minimum = Integer.MIN_VALUE;
		System.out.println(minimum);
	
		char minimum1 = Character.MIN_VALUE;
		System.out.println(minimum1);
		
		// parse methods: converts String values to primitives
		
		Integer num1 = Integer.parseInt("123");    // auto-boxing
		System.out.println(num1+1);
		
		int num2= Integer.parseInt("125");
		System.out.println(num2);
		
		int num3 = Byte.parseByte("12");
		System.out.println(num3+1);
		
		Byte num4 = Byte.parseByte("13");
		System.out.println(num4+1);
		
		//parseShort ("strValue"): takes the string and converts to short primitive value
		short bnum = Short.parseShort("200");
		System.out.println(bnum+1);
		
		//parseLong (str.Value)
		long num5 = Long.parseLong("1222222");
		System.out.println(num5+1);
		
		boolean A = Boolean.parseBoolean("Cybertek");
		System.out.println(A);    // false
		
		boolean B = Boolean.parseBoolean("True");
		System.out.println(B); // true
		
		
		//ValueOf method: converts String value to Wrapper class values
		
		int z = Integer.valueOf("1234");			// unboxing
		Integer z1 = Integer.valueOf("1234");		// none
		Integer z2 = (int)Integer.valueOf("2115");	//auto-boxing
		System.out.println(z);
		System.out.println(z1);
		
		
	}
	
	
	
	

}
