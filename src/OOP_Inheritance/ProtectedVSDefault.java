package OOP_Inheritance;

public class ProtectedVSDefault {
	
	protected static 	String name;
			static String id;
				
	protected static void printHello() {
		System.out.println("Hello");
	}
	
	 void printSalam () {
		System.out.println("Salam");
	}
}

class cybertek{
	public static void main(String[] args) {
		ProtectedVSDefault obj = new ProtectedVSDefault();
		obj.printHello();
		obj.printSalam();
		System.out.println(obj.name);
		System.out.println(obj.id);
	}
}
