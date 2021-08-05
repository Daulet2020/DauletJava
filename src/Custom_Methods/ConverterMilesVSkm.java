package Custom_Methods;

import java.util.Scanner;

public class ConverterMilesVSkm {
	
	public static void main(String[] args) {
		Converter();
		
		
		
	}
	
	public static void Converter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter km");
		double a = scan.nextDouble();
		double b = 0.6;
		double converter = a*b;
		System.out.println(a+" km in miles is: "+converter);
		
	}
	
	
	
	
	

}
