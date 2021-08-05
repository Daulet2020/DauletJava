package Scanner;

public class Ternary {
	public static void main(String[] args) {
		
		int num= 1;
		/* if (true) {
			num = 100;
		} else {
				num = 50;
			}
		*/
		
		num = true? 100: 50;
				
		System.out.println(num);
		
		/*
		 if (condition) 		==>  (Condition)?
		 else           		==> :
		 else if (condition) 	==> :(Condition)?
		 
		 */
		
		double interestRate = 0;
		boolean GoodCredit = false;
		System.out.println(interestRate = GoodCredit ? 0.5: 0.9);
		System.out.println(interestRate);
		
		double interestRate1 = (true) ? 0.5:0.9;
		System.out.println(interestRate1);
		
		
		byte grade = 50;
		boolean Passed = grade >=60 ? true : false;
		System.out.println(Passed);
		
		char FinalGrade= 'D';
		String Team = "";
		System.out.println(Team = FinalGrade == 'A'? "Early Bird" 
				: FinalGrade == 'B'? "Group1" 
				: FinalGrade == 'C'? "Group2"
						: "Learn more");
		
		int score = 20;
		char Finals = ' ';
		
	//	if (score >=90 && score <=100) Finals = 'A';
	// else if (score >=80 && score <=89) Finals = 'B';
	//	else if (score >=70 && score <=79) Finals = 'C';
	//	else if (score >=60 && score <=69) Finals = 'D';
	//	else if (score >= 0 && score <=59) Finals = 'F';
	//	else 
	//		Finals = ' ';
		
		Finals = score >=90 && score <=100 ? 'A' 
				:  score >=80 && score <=89 ? 'B'
						:  score >=70 && score <=79 ? 'C'
								:  score >=60 && score <=69 ? 'D'
										:  score >=0 && score <=59 ? 'F'
												: ' ';
		System.out.println(Finals+"\n");
			
		
		int n = 4;
		String word = "";
		
		word = //n <0 && n>9? "Invalid"
			 n == 0? "Zero"
				: n==1? "One"
				: n==2? "Two" 
				: n==3? "Three"
				: n==4? "Four"
				: n==5? "Five"
				: n==6? "Six"
				: n==7? "Seven"
				: "Invalid";
		
		System.out.println(word);
		
		
		}
		
	}


