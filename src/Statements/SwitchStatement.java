package Statements;

public class SwitchStatement {
	public static void main(String[] args) {
		
		
		/*
		 Switch statement does the similar thing like multi-branch if_statement
		  	switch (Expression) {
		  	case CaseVale1:
		  		statements 1
		 		statements 2
		 		break;
		 	case CaseVale2:
		  		statements 1
		 		statements 2
		 		break;
		 	default:
		 		statement
		 		break;
		 		
		 	break: exit the switch statement
		 	
		 	
		 */
		
		int score = 2;
		if (score ==1) {
			System.out.println("1");
		}
		else if (score ==2) {
			System.out.println("2");
		} else {
			System.out.println("Invalid");
		}
		
		
		switch (score) 	{ // MUST give Expression: data 
				case 1:
					System.out.println("1");
					break;
				case 2:
					System.out.println("2");
					break;
					
				default:
					System.out.println("Invalid");
					break;
		}
		
		String str = "Java";
		switch (str) {
			
			default: 
				System.out.println("Invalid");
				
			case "C#":
				System.out.println("C# programming language");
				
			case "Python":
				System.out.println("Python programming language");
		}
		
		
		char grade = 'A';
		
		switch (grade) {
			
			default: 
				System.out.println("Failed");
			case 'B': 
				System.out.println("Passed with B");
			case 'C':
				System.out.println("Passed with C");
				
			
		}
		
		String days = "Fiday";
		
		switch (days) {
		case "Tuesday":
			System.out.println("Tuesday is great day");
			break;
			
		case "Monday":
			System.out.println("Monday is great day");
			break;
			
		case "Wednsday":
			System.out.println("Wednsday is great day");
			break;
			
		default:
				System.out.println("Invalid");
		break;
			
			
		}
		
		String US = "USA";
		if (US == "USA" || US == "America") {
			System.out.println("American");
		} else {
			System.out.println("Not American");
		}
		
		switch (US) {
		case "US":
		case "USA":
		case "American":
			System.out.println("American");
		break;
		
		default:
				System.out.println("Not American");
		}
		
		/*
		 write a program that can display the days 
		 	if the day is Monday or Tusday:Java c lass
		 	if the day is Thursday or Friday: Selenium class
		 	if the day is Wednesday or Saturday: SQL class
		 	
		 	otherwise: day off
		 
		 */
				
			String Days = "Monday";
				switch (Days) {
				case "Monday":
				case "Tuesday":
					System.out.println("Monday or Tuesday:Java class");
					break;
				case "Thursday":
				case "Friday":
					System.out.println("Thursday or Friday: Selenium class");
					break;
					
					case "Wednesday":
					case "Saturday":
						System.out.println("Wednesday or Saturday: SQL class");
					break;
					
					default:
						System.out.println("Day off");
						
				
				}
			
			
	}

}
