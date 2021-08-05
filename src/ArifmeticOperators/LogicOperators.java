package ArifmeticOperators;

public class LogicOperators {
	
	public static void main(String[] args) {
		
		
		
		
		
		boolean C = !(8>5)  || !("Today" != "Friday");
		//            true  || !true
		//            false || false
		System.out.println(C);
		
		
		boolean D = true && true || false;
		//              true     || false
		//                      true
		System.out.println(D);
		
		boolean E = !(7>5 && 6!=5)  && (9> 5  || 10>4);
		//          !(true && true) && (true || true)
		//                 false    && true
		//                         false
		
		System.out.println(E);   // false
		
		
		
		
		
	}

}
