package Custom_Methods;

public class Warm_Up_Method_Dublicates {
	
	public static void main(String[] args) {
			 
		String letters  = Duplicate("kkklllllnnnn");
		System.out.println(letters);// ==> kln
		
		String str1 = "AAABBBCDEEE"; // ==> CD
		System.out.println(Uniq(str1));
		
	}
	
	
	public static String Duplicate (String str) {
		String RemoveDup = "";   // to store the non duplicates
		for (int i = 0; i < str.length(); i++) {
			if (!RemoveDup.contains(""+str.charAt(i))) {
				RemoveDup+="" + str.substring(i, i+1);
			}
		}
		return RemoveDup;
	}
	
	public static Object Uniq (String str) {
		String result = "";
		for (int j = 0; j < str.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		if (count==1) {
			result +=""+str.charAt(j);
		}
	}
		return result;	
	}
}


