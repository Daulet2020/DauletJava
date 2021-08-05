package OOP_Inheritance;

class Data {
	
	public String name;
	private String age;
	String ID;
	protected String  DOB;
	
	public void Hello () {
		// Salam();
		System.out.println("Hello");
	}
	
	private void Salam () {
		System.out.println("Salam");
	}
	
	void Aloha () {
		System.out.println("Aloha");
	}
	
}

public class MultiClassPractice {
	
	public static void main(String[] args) {
	
		Data obj = new Data();
		System.out.println(obj.name);   // public is visible at everywhere
	//	System.out.println(obj.age);    // private not visible
		System.out.println(obj.ID);		// default access modifier is visible to class 
		
		/*
		 if those classes were located in two different packages,
		 then the default access modifier is not gonna visible
		 */
		
		obj.Hello();
	//	obj.Salam();   // private
		obj.Aloha();
	
		
	}

}
