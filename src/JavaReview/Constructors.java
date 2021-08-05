package JavaReview;

public class Constructors {
	
	public Constructors() {
		System.out.println("Daulet");
	}
	public Constructors(int a) {
		this();
		System.out.println("Sergei");
	}
	
	public Constructors(double a) {
		this(100);
		System.out.println("Danik");
	}
	public Constructors(boolean a) {
		this(2.5);
		System.out.println("Assel");
	}
	
	public Constructors(String str) {
		this(100);
		System.out.println("Saken");
	}
	public Constructors(byte a) {
		System.out.println("Alice");
	}
	
	public static void main(String[] args) {
		
		Constructors obj = new Constructors((byte)1);
		
		
	}

}
