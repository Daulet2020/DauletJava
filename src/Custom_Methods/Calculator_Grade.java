package Custom_Methods;

public class Calculator_Grade {
	
	public static void main(String[] args) {
		
		Grade(8, 7, "*");
		
		Grade(57);
	}
	
	public static void Grade (int score) {
		
	char Grade = (score>=90 && score <=100)? 'A'
			: (score>=80 && score <=89)? 'B'
			: (score>=70 && score <=79)? 'C'
			: (score>=60 && score <=69)? 'D'
			: (score>=0 && score <=59)? 'F'
			: 'I';
	if (Grade == 'F') {
		System.out.println("Failed");
	}else if (Grade == 'I'){
		System.out.println("Invalid");
	}else {
		System.out.println(Grade);
	}
	}
	
	
	public static void Grade (int a, int b, String Ope) {
	
		String result = "";
		if (Ope.equals("-")) {
			System.out.println();
			result += (a-b);
			} else if (Ope.equals("+")){
			result += (a+b);
			}else if (Ope.equals("*")){
				result += (a*b);
			} else if (Ope.equals("/")){
				result += (a/b);
			} else if (Ope.equals("%")){
				result += (a&b);
			} else {
				result = "Invalid";
			}
		
		String Result2 = "";
		Result2 += (Ope.equals("-"))? (a-b) : (Ope.equals("+"))? (a+b) :
				   (Ope.equals("*"))? (a*b) : (Ope.equals("/"))? (a/b):
				   (Ope.equals("%"))? (a%b): "Invalid operator";
				
				
		System.out.println(Result2);
		
		
	}

	
	
	
	
}
