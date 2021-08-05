package Practice;

public class Reverse {
	public static void main(String[] args) {
		 String str = "Amugscd";
		 String str1 = "";
		 for (int i = str.length()-1; i >=0;  i--) {
			 //str1+=""+str.charAt(i);
			 str1+=str.substring(i, i+1);
			
		}
		 System.out.println(str1);
		
		 
		 int [][] arr = new int [][] {{1,2},{3,4}};
			
			arr[1] = arr [0];
			System.out.println(arr[1]);
			
	}
	
	

}
