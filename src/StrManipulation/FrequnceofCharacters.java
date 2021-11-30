package StrManipulation;

import java.util.Arrays;
import java.util.Collections;

public class FrequnceofCharacters {
	
	public static void main(String[] args) {
		System.out.println(frequency("AAABBCCC"));
			
	}
	
		
	public static String frequency(String str) {
		

		String result="";
		
		for(int i=0; i < str.length(); i++) {
			if(! str.contains(""+str.charAt(i)))
		result += ""+str.charAt(i);
		}
		
		for(int i=0; i < str.length(); i++) {
		int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+str.charAt( i ) );
		result += ""+str.charAt(i) + num;
		}
	 
		return result;
		
		}
	}


