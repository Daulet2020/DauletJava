package OOP_Inheritance;

class Daulet{
	public Daulet() {
		System.out.println("Daulet");
	}
	
}

class Sergei extends Daulet{
	public Sergei() {
		System.out.println("Sergei");
		
	}
	
}

class Dana extends Sergei{
	public Dana() {
		super();		
		System.out.println("Dana");
	}
	
}

public class Constructor1 {
	public static void main(String[] args) {
		Sergei obj = new Sergei();
		System.out.println("_______________________________");
		Dana obj1 = new Dana();
	}
}
