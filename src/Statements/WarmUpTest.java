package Statements;

public class WarmUpTest {
	public static void main(String[] args) {
		
		/*
		  declare 3 numbers
		  if n1 and n2 are equal ==> n1 & n2 are equal
		  if n2  and n3 are equal  ==> n2 & n3 are equal
		  if n1  and n3 are equal  ==> n1 & n3 are equal
		  
		  if all equal ==> all equal
		   
		   if none of them equal ==> none of them equal
		  
		 */
		
		int n1 = 51651, n2 = 515465, n3 = 511565;
		
		if (n1 == n2 &&  n2==n3 ) {
			System.out.println("all equal");
		} else if ( n1 == n2 ) {
			System.out.println("n1 & n2 are equal");			
		} else if (n1 == n3 ) {
			System.out.println("n1 & n3 are equal");
		} else if (n2 == n3) {
			System.out.println("n2 & n3 are equal");
		} else {
			System.out.println("none of them equal");
		}
		
		
		
	}

}
