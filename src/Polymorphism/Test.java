package Polymorphism;

abstract class AbstarctClass{
	
	//By 
	public static void ByLinkText() {
		System.out.println("Link text super");
	}
	
	public void get() {
		System.out.println("Chrome");
	}
}

public class Test extends AbstarctClass {
	public void get() {
		System.out.println("Firefox");
	}
	public static void ByLinkText (int a) {
		System.out.println("Link text sub");
		
		
	}
	 
	public static void Test() {
		
	}
	
	public static void main(String[] args) {
		
			
	//	AbstractClass obj = new AbstractClass();  we cannot create object from abstract class
		
		AbstarctClass obj2 = new Test();
		obj2.ByLinkText();  //super because it`s static
		
		
		obj2.get(); // Firefox, because it`s   instance
		Test obj3 = new Test(); 
		obj3.ByLinkText(10); // have changed using obj3
	}

}
 