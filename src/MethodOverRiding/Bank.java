package MethodOverRiding;

/*
 	super class: Bankactions: InterestRate()  ==>   9%
 		sub classes: BankOfAmerica  ==> 7% 
 					 PNC	        ==> 6% 
 					 Chase		    ==> 8%
 */

public class Bank {
	
	public void InterestRate() {
		System.out.println("9% of interest");
	}
	public static void main(String[] args) {
		BoA bank1 = new BoA();
		bank1.InterestRate(); 		//9%
				
		PNC bank2 = new PNC();		
		bank2.InterestRate(); 		//9%
		
		Chase bank3 = new Chase();		
		bank3.InterestRate(); 		//9%
		
		}
	}

	class BoA extends Bank{
		public void InterestRate () {
			System.out.println("7$ of interest");
		}
		
	}
	
	class PNC extends Bank {
		@Override    										 //Verification 
		public void InterestRate () {
			System.out.println("6$ of interest");
		}
		
	}
	
	class Chase extends Bank {
		public void InterestRate () {
			System.out.println("8$ of interest");
		}
		
	}

