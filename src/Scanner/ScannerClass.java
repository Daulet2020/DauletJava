package Scanner;

import java.util.Scanner; 	// imports scanner class only
							// imports all the classes from java.util


public class ScannerClass {    
	
	public static void main(String[] args) {
//	 Scanner scan = new Scanner(System.in); 
//	 System.out.println("Enter a byte value");
//	 	byte byteNum = scan.nextByte();

//	 	System.out.println("You have entered: "+byteNum);
		
//	 	System.out.println("Enter a byte value 2");
//	 	byte byteNum2 = scan.nextByte();
	 	
//	 	System.out.println("You have enetered: " +byteNum2);
		
//		System.out.println("Addition is: "+ (byteNum + byteNum2));
		
		
	/*	Scanner input = new Scanner (System.in);
		System.out.println("Enter byte number");
		byte num = input.nextByte();
				
		System.out.println("Enter short number");
		short num2 = input.nextShort();
	
		System.out.println("Enter int number");
		int num3 = input.nextInt();
				
		input.nextLine();
		System.out.println("Enter the text");
		String name = input.nextLine();
	*/	
		Scanner scan = new Scanner (System.in);
	/*	System.out.println("Enter you first and last name ");
		String firstName = scan.nextLine(), lastName = scan.nextLine();
		String fullName = firstName+" "+lastName;
		
		String f = firstName.substring(0,1) + lastName.substring(0,1);
		f = f.toUpperCase();
		
		System.out.println(fullName);
		System.out.println("Initials are:" + f);
		
		String LastLetters = " "+firstName.charAt(firstName.length()-1)+ "."+ lastName.charAt(lastName.length()-1)+".";
		LastLetters = LastLetters.toUpperCase();
		
		System.out.println("Last letters are: " + LastLetters);
		*/
		
		System.out.println("Enter you first and last name");
		String firstName = scan.nextLine();
		String lastName = scan.nextLine();
		
		String f = firstName.substring(0, 1).toUpperCase()+ firstName.substring(1).toLowerCase();
		
		String l = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
		
		System.out.println(f+" "+l);
		
		
		
		
							
		
		
	}

}
