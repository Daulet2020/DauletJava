package ArifmeticOperators;

public class UnaryOperators {
	
	public static void main(String[] args) {
		System.out.println(5);
		
		int a=50;
		a = --a + a++ + a-- + a++;
	//	     pre  post  post  post
	//	     49 + 49   + 50 + 49 = 197
          
		
		
		System.out.println(a);
		
		
	}

}
