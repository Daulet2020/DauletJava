package Scanner;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
			
	Scanner input = new Scanner(System.in);
	/*System.out.println(" Enter your first name and last name");
	String firstName = input.nextLine().toUpperCase();
	String lastName = input.nextLine().toUpperCase();
	
	System.out.println(firstName+ " "+lastName);
	
	String fullname = firstName.concat(" " +lastName);
	String name = fullname.toUpperCase();
	System.out.println(name);
	*/
	
	System.out.println("Please enter your email and password");
	String email = input.nextLine().toLowerCase();
	String pass = input.nextLine();
	
	String userEmail = "daulet2020@gmail.com";
	String password = "Javengers";
	
	if (email.contains("@gmail.com")) {
		if (email.equalsIgnoreCase(userEmail) &&  pass.equals(password)) {
			System.out.println("Logged successfuly");
		} else {
			if (!email.equalsIgnoreCase(userEmail) &&  !pass.equals(password)) {
				System.out.println("Invalid user name and password");
		} else if (!email.equalsIgnoreCase(userEmail)) {
			System.out.println("Invalid email");
		} else { 
			System.out.println("Invalid password");
			
			}		
		}
	} 
	else {
		System.out.println("Is not valid email");
	}
	
			String str = "ABC";
			String str2 = "abc";
			
			if (str.equalsIgnoreCase(str2)) {
				System.out.println("Equal");
			} else {
				System.out.println("Not equal");
			}
				
	
}
	}
