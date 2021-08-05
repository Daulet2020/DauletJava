package JavaReview;

public class Test {
	
	public Test () {
		System.out.println("A "); 
	}
	
	public Test (int a) {						//AC B
		this(2.5);       						//AC
		System.out.println("B ");				//B
	}
	
	public Test (double c) {					// AC
		this();									// default 		A		
		System.out.println("C ");				// additional 	C
	}
	public static void main(String[] args) {
		Test obj = new Test(35);
		}

}
