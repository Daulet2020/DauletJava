package Scanner;

import java.util.Scanner;

public class StringManipulations {
	
	public static void main(String[] args) {
		
	/*	
	 	String Input 
	 	Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		
		System.out.println("Enter last name");
		String  lastName = scan.nextLine();
	*/
		
	// charAt method
		 
		
			String str = "Cybertek";
			//            01234567
			
			char ch = str.charAt(4);
			System.out.println(str.charAt(4));
			System.out.println(ch);
			
			String str2 = "Dau let";
			// index       0123456
			System.out.println(str2.charAt(3));
		
	
	// length(): method
				
			String name = "Donald J Trump";
			int n = name.length();
			
			System.out.println(name.length());
		
	// concat method
			String s1 = "Cybertek";
				s1.concat (" School");
				
				System.out.println(s1);
				
				s1 = s1.concat (" School");
				
				System.out.println(s1); // Cybertek School
				
			
	// toUpperCase(): method
			String N = "cybertek";
			N = N.toUpperCase();
			
			System.out.println(N);
		
	// toLowerCase (): method
			String a = "oogle News is a news aggregator service developed by Google.the official app in January 2006. ";
			a = a.toUpperCase();
			System.out.println(a);
			

	// length(): method
			int Length = a.length();
			System.out.println(Length);
			
			int HighestInexNum = a.length()-1;
			System.out.println(HighestInexNum);
			
			String b = "Cybertek";
			b = b.concat(" Batch12 Javangers");
			// Cybertek Batch12 Javangers
			
		
	// trim (): method // it`s used for removing the unused spaces
			
			String s = "        hello world peace";
			s = s.trim();
			System.out.println(s);
			
	/*SUBSTRING (begining index): method: it creates sub value of the String from the beginning index till 
			the Last index and returns it as a NEW String value
	*/	
			String str1 = "Cybertek School";
			//    		   0123456789
			
			String str3 = str1.substring(6);
			System.out.println(str3);
			
			String Address = "2727 Commercial, Katy, TX, 77494";
			String zip  = Address.substring(27);
			System.out.println(zip);
			
	/* substring (beginning index, ending index): 
			it creates the sub value of the String from the beginning index till the ending index
			(ending index num will be excluded)
			then returns it as a NEW String value
	*/
			String Name = "Hello Cybertek school";
					//	   0123456789 .......
			      Name= Name.substring(6, 13+1);
			       System.out.println(Name);
	
			String fuulName = "Cybertek school batch12";
			String middleName = fuulName.substring(9, 15);   // school
			System.out.println(middleName);
			
			       
	/*
	 replace(old char, new char) method: replace all the old char values with the given new char value
	 									and returns it as a NEW String value
	 */
		String d = "Java is fun Programming language";
		   d = d.replace('a', 'A');
		   System.out.println(d);
	
		   
		   /*
		    replace (old str, new str): replace all the old str values with the given new string value
	 									and returns it as a NEW String value
		    */
		   
		   String w = "Today is great day to learn java java java";
		      w = w.replace("Today", "Tomorrow");
		      System.out.println(w); 
		      w = w.replace("java", "");
		      System.out.println(w);
		      
	/*
	 replaceFirst(): replaces the first occured old string with the new string 
	 				and returns it as a NEW String value
	 */
		    String p = "Java is fun, Java is cool";
		       p = p.replace("Java", "Python");
		           	System.out.println(p);
		
		           p = p.replace('P', 'p');
		           System.out.println(p);
		           
		     String p1 = "Java is programming language, Java is Java";
		       p1 = p1.replaceFirst("Java", "C#");
		       System.out.println(p1);
	
			
		/*
		 indexOf(str): returns to the index number of the first character in the given String
		 
		  */
		       String A1 = "Batch 12 is the great Batch";
		           
		          int num = A1.indexOf("at "); 
		          System.out.println(num);
		       
			String B = "Today is Tuesday, we have a class in the afternoon";
				  int n1 =  B.indexOf("ter");
				  System.out.println(n1);
				   
			String Address1 = " 2727 Commercial Center Blvd, Katy, TX, 77494";
			int begin = Address1.indexOf(", ")+2;
			int end = Address1.indexOf(", T");
			
			
			String cutiName = Address1.substring(begin, end);
			System.out.println(cutiName);
			
			String emailAddress = "randomEmails@gmail.com";
			
			int r = emailAddress.indexOf("");
			int c = emailAddress.indexOf("@");
			
			String z = emailAddress.substring(r, c);
			System.out.println(z);
			
			/*
			 last.IndexOf(): returns the last occured character index number as and Int value
			 
			 */
			
			String tr = "ABCDEFGHB";
			int y = tr.lastIndexOf("B");
			int x = tr.indexOf("B");
			System.out.println(x);
			
			String myEmail = "MyEmail.school@gmail.com";
			int Begin = myEmail.indexOf("@")+1;
			int End = myEmail.lastIndexOf(".");
			
			String myEmailType = myEmail.substring(Begin, End);
					
					System.out.println(myEmailType);
			
			/*
			 isEmpty (): checks if the String is empty returns boolean expression
			 */
			
			String strin="Cybertek";
			boolean r1 = strin.isEmpty();
			System.out.println(r1);        // false 
			
			String strin1 = "";
			if(strin1.isEmpty()) {
				System.out.println("strin1 is empty");
			} else {
				System.out.println("strin1 is not empty");
			}
			
			/*
			 equals(string): checks if the two String face values are equal or not, then returns boolean espression
			 				if equal true, if not false
			 */
										
			String S1 = "Cyberetek";
			String S2 = new String ("Cybertek");
			System.out.println(S1==S2);       // false
			
			
			boolean S = S1.equals(S2);
			System.out.println(S);

			System.out.println("java".equals("Java")); // false case sensitivity
			
			/*
			 equalIgnoreCase(string): 		checks if the two String face values are equal or not, then returns 
			 					boolean expression case sensitivity does not matter
			 */

			String sys = "JAVA";
			String sys1 = new String ("java");
			System.out.println(sys==sys1);  			 		// false
			System.out.println(sys.equals(sys1));   			// false
			System.out.println(sys.equalsIgnoreCase(sys1)); 	//true
			
			/*
			 contain (str): checks if str is contained in the String or not, then returns boolean expression
			 */
			
			String man  = "Daulet";
			 boolean result = man.contains("ABC");
			 System.out.println(result);    			// false
			
			 String man1 = "Sergei";
			 System.out.println(man1.contains("S"));
			
			 /*
			  startWith(str): checks if the String is started with the str or not, then returns boolean expression
			  */
			
			 String Today = "Java";
			 boolean resul= Today.startsWith("J");
			 System.out.println(resul);
			 
			 String names = "Cybertek school is great place to lean Java";
			 System.out.println(names.startsWith("Cybertek"));
			 
			 /*
			  endsWith(str): checks if the String is ended with the str or not, then returns boolean expression
			  */
			 
			 String D = "Daulet";
			 System.out.println(D.endsWith("t"));
			 
			 
	}

}
