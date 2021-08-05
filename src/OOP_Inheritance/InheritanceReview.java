package OOP_Inheritance;

class First {
	public String name1 = "Ermek";
	
}

class Sec extends First {
	// incl. not visible name1
	public String name1 = "Baisal";
	public String name2 = "Aziz";
	public String name3 = "Ruslan";

	public void method1() {
		this.name1 = "Sergei";
		super.name1 = "Petya";
		System.out.println(name1);
		
	}
}


public class InheritanceReview extends Sec {
	public String name4 = "Talgat";
	public String name5 = "Berik";
	
	public static void main(String[] args) {
		InheritanceReview obj = new InheritanceReview();
		System.out.println(obj.name1);
		System.out.println(obj.name2);
		System.out.println(obj.name3);
		System.out.println(obj.name4);
		System.out.println(obj.name5);
		
		System.out.println("_______________________________________________________");
		Sec obj2 = new Sec();
		System.out.println(obj2.name1);
		System.out.println(obj2.name2);
		System.out.println(obj2.name3);
	//	System.out.println(obj2.name4);  			SuperClass cannot inherit features from SubClass
	//	System.out.println(obj2.name5);				SuperClass cannot inherit features from SubClass
		
		System.out.println("_______________________________________________________");
		First obj3 = new First();
		System.out.println(obj3.name1);
	//	System.out.println(obj3.name2);				SuperClass cannot inherit features from SubClass
	//	System.out.println(obj3.name3);				SuperClass cannot inherit features from SubClass
	//	System.out.println(obj3.name4);				SuperClass cannot inherit features from SubClass
	//	System.out.println(obj3.name5);				SuperClass cannot inherit features from SubClass
		
		
		// super.: used for calling instances from the super class to use super  
		// this.: used for calling instances from the class itself, we do not need inheritance
		
		// super(): used for calling the constructors from the super class MUST be used in the sub class
		// this(): used for calling the contructors from the class itself
		
		
		
		
	}


}
