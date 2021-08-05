package SuperKeyword;

import OOP_Inheritance.ProtectedVars;

class Data {
	
	public  int num1 = 10;
	protected  int num2 = 20;
	private  int num3 = 30;
	 int num4 = 40;
	
}

public class InheritanceReview extends Data {
	//				sub					super
	
	/*
	public static  int num1 = 10;
	protected static int num2 = 20;
	private static int num3 = 30;
	 static int num4 = 40;
	 */
	
	static 	int staticNum;
			int insNum;
			
	public static void main(String[] args) {
		
		InheritanceReview obj1 = new InheritanceReview();
		
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
//		System.out.println(num3); // private 
		System.out.println(obj1.num4);
		
		Data obj2 = new Data();
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		System.out.println(obj2.num4);
		
		ProtectedVars obj3 = new ProtectedVars();
//		System.out.println(obj3.nameProtected);    // protected is not visible
		System.out.println(obj3.namePublic);
		
		InheritanceReview objA = new InheritanceReview();
		objA.staticNum = 100;
		objA.insNum = 200;
		
		InheritanceReview objB = new InheritanceReview();
			objA.staticNum = 300;
			objB.insNum = 400;
		System.out.println(objB.insNum);  	// 400
		System.out.println(objA.insNum); 	//  200
		
		System.out.println(objA.staticNum);		// 300
		System.out.println(objB.staticNum);     // 300
		

		
	}
	
	

}
