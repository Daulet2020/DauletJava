package ForLoop;

import java.util.Iterator;

public class Task2 {
	
	public static void main(String[] args) {
	
		String sentence = "I like books, many books, love books, books is great, book, because of book, BOOK";
		int count = 0;
		for (int i =0; i < sentence.length()-3; i++) {
			if(sentence.substring(i, i+4).equals("book")) {
				count++;
			}
		} System.out.println(count);
		
		
		String words = "Cybertek is school, Cybertek is great, i love Cybertek";
		int nTimes = 0;
		for (int i = 0; i< words.length()-7; i++) {
			if(words.substring(i, i+8).equals("Cybertek")) {
				nTimes++;
			}
		}System.out.println(nTimes);
		
		/*
		 write the program that can remove duplicates 
		 input: aabbcc
		 output: abc
		 */
		
		String s = "aaabbbccc";
		String result = "";
		
		for (int i=0; i<s.length()-1; i++) {
			if (!result.contains(s.substring(i, i+1 ))) {
				result +=s.substring(i, i+1);
			}
		}
		System.out.println(result);
		
		/*
		 write the program that can find unique characters from String 
		 input: AAAABCDEEFF
		 output: BCD
		 */
		
		String str = "AAAABCDEEFF";
		String unigue = "";
				
		for (int j=0 ; j<str.length(); j++) {
			int count1 =0;
			
			for (int i = 0; i < str.length();
				i++) 
			{
				if (str.substring(i, i+1).equals(""+str.charAt(j))) {
				count1++;
			}
		}
		if (count1 ==1) {
			unigue +=str.charAt(j);
		}
	}
		
		System.out.println("Unique letters is: "+unigue);
		
		String str1 = "ALL THE LETTERS";
		String unique = "";
		
		for (int k = 0; k < str1.length(); k++) {
			
			int count2 =0;
			for (int a = 0; a < str1.length(); a++) {
				if (str1.substring(a, a+1).equalsIgnoreCase(""+str1.charAt(k))) {
					count2++;
				}
			}
			if (count2==1) {
				unique+=str1.charAt(k);
			}
	}
	
			System.out.println(unique);
			
		
		
		
		
		
		
		
		
	}
}

	

		
		
	