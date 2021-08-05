package OOP_Inheritance;

class Dina{
	public Dina (int a) {
		this(5.5);
	//	this("a");
		System.out.println("A");
		
	}
	
	public Dina (double a) {
		System.out.println("B");
		
	}
	public Dina (String str) {
		System.out.println("C");
		
	}
}

public class Constructor2 extends Dina{

	public Constructor2() {
		super(2);
		
	}
	public static void main(String[] args) {
		Constructor2 obj = new Constructor2();
		
	}
}
