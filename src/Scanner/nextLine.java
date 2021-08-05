package Scanner;

import java.util.Scanner;

public class nextLine {
	public static void main(String[] args) {
		
	//	Scanner scan = new Scanner(System.in);
	/*	System.out.println("Enter your phone number and name");
		int phonnumber = scan.nextInt();
		
		scan.nextLine();
		String name = scan.nextLine();
		
		System.out.println("Thanks");
		
		scan.nextLine();
		
		System.out.println("Call to Sergei");
		String question = scan.next();
				
		
		System.out.println(question); */
	
		/*
		 nextLine() method will take everything in Scanner memory up-to the new Line
		 
		 
		 */
		
		/*
		 write a program that accept zips, city, state, phone number
		 then displayed all info
		 */
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = input.nextLine();
		
		System.out.println("Enter your Zipcode");
		int zip = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter city");
		String city = input.nextLine();
	
		System.out.println("Enter your state");
		String state = input.nextLine();
		
		
		System.out.println("Phone number");
		int number = input.nextInt();
		
		System.out.println("Name: "+name + ",\nZip: "+zip+ ",\nCity: "+city+ ",\nState: "+state+",\nPhone number: "+number+"\nIs it correct?");
		*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your first name and last name");
		String firstName = scan.nextLine();
		String lastName = scan.nextLine();
		
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		String fullname1 = firstName.concat(" " + lastName); 
		
		System.out.println(fullname1);
		
		//int n = fullName.length();
		
		System.out.println(fullName.length());
		
		System.out.println(fullName.charAt(6));
		
		
		
		
		
		
	} 

}
