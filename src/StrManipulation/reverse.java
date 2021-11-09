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
		
	}
		

}  
