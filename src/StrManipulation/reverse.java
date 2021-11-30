package StrManipulation;

public class reverse {
	public static void main(String[] args) {
		 String a = "Amugscd";
		 String b = "";
		 for (int i = a.length()-1; i >=0;  i--) {
			
			 //str1+=""+str.charAt(i);
			 b+=a.substring(i, i+1);
			
		}
		 System.out.println(b);
		 
		 
		 System.out.println(reverse("daulet"));
		
	}
		
	public static String reverse(String str) {
		String reversed = "";
		for (int i = str.length()-1; i >=0; i--) {
			reversed +=str.charAt(i);
		}
		return reversed;
		
	}
	
}  
