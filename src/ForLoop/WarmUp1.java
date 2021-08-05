package ForLoop;

import java.util.Scanner;

public class WarmUp1 {
	public static void main(String[] args) {
		
		//Polidrome
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String original = scan.nextLine();
		String Reverse = "";     
		//for (int i = original.length()-1; i>=0; i--) {
		//	Reverse +=original.substring(i, i+1);
		//	Reverse += original.charAt(i);
		int i = original.length()-1;
		while (i>=0) {
			i--;
		}
		boolean result = original.equals(Reverse)? true: false;
		System.out.println(result);
		
		
		
	}

}
