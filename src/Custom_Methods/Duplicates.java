package Custom_Methods;

public class Duplicates {
	public static void main(String[] args) {
		String str = "aaabbbcccdddddHHH";
		//              a3b3c3d5H3
		String RemoveDup = "";   // to store the non duplicates
		for (int i = 0; i < str.length(); i++) {
			if (!RemoveDup.contains(str.substring(i, i+1))) {
				RemoveDup+=str.substring(i, i+1);
			}
		}
		System.out.println(RemoveDup);
		
		
		String result = "";     // to store expected result
		for (int j = 0; j < RemoveDup.length(); j++) {
			int count = 0;			// count the numbers of appearances
			for (int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).equals(RemoveDup.substring(j, j+1))) {
				count++;
			}
			}
			result +=RemoveDup.substring(j, j+1)+count;
		} System.out.println(result);
		
		//==================================================================================================
		
		String input = "ZXXXYYYZZZZ";	// expected result: Z5X3Y3
		String NonDupl = "";
		for (int i = 0; i < input.length(); i++) {
			if(!NonDupl.contains(""+input.charAt(i))) {
			NonDupl+=""+input.charAt(i);
				}
			} System.out.print(NonDupl+" ");
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			String res = "";
		for (int i = 0; i < NonDupl.length(); i++) {
			int b =0;
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j)== NonDupl.charAt(i)) {
			b++;		
				}
				
			} res+=""+NonDupl.charAt(i)+b;
		}	
			System.out.println(res);
			
			
		

		
		
		
		
		
}		
	}


