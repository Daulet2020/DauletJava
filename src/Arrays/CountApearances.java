package Arrays;

import java.util.ArrayList;

public class CountApearances {
	
		public static void main(String[] args) {


		System.out.println(RemoveDup("abcabcabb"));

		int num=count("aabbca","a");
		System.out.println(num);

		System.out.println(frequency("abcabcabb"));
		
		//task04:
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(20);
		list.add(30);
		list.add(40);
		
		int num1 = maximum(list);
		System.out.println(num1);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(126251);
		list1.add(24545);
		list1.add(34454);
		list1.add(5444);
		
		int num2 = minimum(list1);
		System.out.println(num2);
		
		
		}
		public static String RemoveDup(String str) {
		String result ="";
		for (int i = 0; i < str.length(); i++) {
		if(!result.contains(str.substring(i, i+1))) {
		result+=str.substring(i, i+1);
		}
		}

		return result;
		}
		
		public static int count(String a, String b) {
		int count =0;
		while(a.contains(b)) {
		count++;
		a=a.replaceFirst(b, "");
		}
		return count;
		}
				//task#3, frequency of letter
		public static String frequency(String str) {

		String nonDup  =RemoveDup(str);
		String result ="";

		for (int i = 0; i < nonDup.length(); i++) {
		int count =count(str, ""+nonDup.charAt(i));
		result +=""+nonDup.charAt(i)+count;
		}

		return result;
		}
		

		//task #4, maximum number without sorting
		public static int maximum(ArrayList<Integer> list) {
			int max = Integer.MIN_VALUE;
			for (int each : list) {
				if (each > max ) {
					max = each;
				}
			}
		return max;
		}
		
		//task #5, minimum number
		public static int minimum(ArrayList<Integer> list) {
			int min = Integer.MAX_VALUE;
			for (int each : list) {
				if (each < min ) {
					min = each;
				}
			}
		return min;
		}










		}