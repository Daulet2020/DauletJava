package Arrays;

import java.util.Arrays;

public class StringSplitMethod {

	public static void main(String[] args) {
	/*
	 slpit(str): splits the String by given value, and returns it as String array
	 
	 toCharArray(): 
	 	
	 */
		
		String sentence = "Today is great and good day , to learn Java";
		
		String [] arr = sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String email = "FirstName_LastName";
		String [] arr2 = email.split("_");
		
		String str = Arrays.toString(arr2);
		System.out.println(str.replace("[", "").replace("]", "") );
		
		String fullName = "Cybertek school Batch12";
		String [] ar = fullName.split(" ");
		System.out.println(Arrays.toString(ar));
		
		String Java = " Java I love Java is fun, I love Java, Java is great";
		//             I love |    is fun, I love  | ,   | is great  
		String [] ar2 = Java.split("Java");
		System.out.println(Arrays.toString(ar2));
		System.out.println(ar2.length-1);
		
		String Python = " Python I love Python is fun, I love Python, Java is great";
		String [] ar3 = Python.split("Python");   // splited by Python
		System.out.println(Arrays.toString(ar3));
		System.out.println(ar3.length-1);
		
		String EmailAddress = "Cybertek.school.batch12@gmail.com";
		String fulName = EmailAddress.substring(0, EmailAddress.indexOf("@"));
		System.out.println(fulName);
		String [] name = fulName.split("\\.");
		System.out.println(Arrays.toString (name));
		
		String word = "ABCDEF";      // split by letters
		String [] w = word.split("");
		System.out.println(Arrays.toString(w));
		
		
		
		/*
		 toCharArray(): returns char array from String
		 
		 */
		
		String Str = "Java";
		char [] ch = Str.toCharArray();
		System.out.println(Arrays.toString(ch));   // {'J', 'a', 'v', 'a'}
		
		
		
		
		
		
		
		
	}

}
