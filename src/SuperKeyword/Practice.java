package SuperKeyword;

class parent {
	public parent(int a ) {
		this("A");
		System.out.println("A");
	}
	
	public parent (String b) {
		System.out.println("C");
	}
	
}

public class Practice extends parent {
	//			sub			   super
	
	public Practice () {
	super(10 );
	System.out.println("B");
	}
	
	
	public static void main(String[] args) {
	Practice obj = new Practice();
	 
	}

}
