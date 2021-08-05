package ForLoop;

public class WarmUp {
	public static void main(String[] args) {
		
		String str = "";
		int x = 1;
		while (x<=30) {
			
			if (x%3==0 && x%5==0) {
				str+="FINRA1 "; 
			}	else if (x%3==0) {
				str +="FIN ";
			} else if (x%5==0){
				str+="RA "; 
			} else 	{
				str +=x +" ";
				}
			x++;
		} System.out.println(str); 
		
			String str1 = "";
			int y = 1;
			while (y<=30) {
			str1 += (y%3 == 0 && y%5==0)? "FINRA":
				(y % 3== 0 )? "FIN ": (y%5==0)? "RA " : y+" ";
			
			} System.out.println(str1);
	
		
		}
}
