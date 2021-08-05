package Arrays;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
	
	public static void main(String[] args) {
		/*
		 String build out the same letters
		 inpit a = "aabbbc", b="cabbbccaaab";
		 output true
		 
		 */
		
		String a = "aabbbc", b="bcabbbbccccaaaa";
		//            "abc"    "cab"
		String a1 = "";
		
		for (int j = 0; j < a.length(); j++) {
			for (int i = 0; i < a.length(); i++) {
			if (!a1.contains(a.substring(j, j+1))) {
				a1 +=a.substring(j, j+1);
				}
			}
		}
		System.out.println(a1);
		
	String b1 = "";
		for (int i = 0; i < b.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (!b1.contains(""+b.charAt(i))) {
					b1+=""+b.charAt(i);
				}
			}
		}
		
		System.out.println(b1);
		
		char [] ch1 = a1.toCharArray();
		System.out.println(Arrays.toString(ch1));
		
		char [] ch2 = b1.toCharArray();
		System.out.println(Arrays.toString(ch2));
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println("========================");
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		
		String str1= Arrays.toString(ch1);
		String str2= Arrays.toString(ch2);
		if (str1.equals(str2)) {
			System.out.println("True, they are build out the same letters");
		} else {
			System.out.println("False, different letters");
		}
		
		// solution 2
		String Str1 = "aaaaabbbbbccccc", Str2 = "ccccaaaabbbbcccc";
		Str1 = new TreeSet<String>(Arrays.asList(Str1.split(""))).toString();
		Str2 = new TreeSet<String>(Arrays.asList(Str2.split(""))).toString();

		System.out.println(Str1.equals(Str2));
		
		
		
		
		
		
		
		
	}

}
