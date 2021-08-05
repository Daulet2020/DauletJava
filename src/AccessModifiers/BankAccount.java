package AccessModifiers;

public class BankAccount {
	/*
	 WarmUp: create a custom class for bank account
	 The attributes/data that the class can have are:
	 		AccountHolder, AccountNumber, AvailableBalance
	 		
	 Actions the class can do are:
	 		deposit, withdraw, checking balance 
	
	 Requirements:
	 	1. Apply encapsulation
	 	2. User should be able to deposit, withdraw and check the balance
	 		2.1 if the withdrawing amount is greater than available balance, 35$ penalty fee will be charger from the account
	 		2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money
	 */

	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
	
	//getter(read only): instance return method, return-type MUST match with variables
	public String getAccountHolder() {
		return AccountHolder;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	
	public double getAvailableBalance() {
		return AvailableBalance;
	}
	
	//setter (Modify): instance void method, passes a parameter data-type MUST match with the instance variable
	public void setAccountHolder (String AccountHolder) {
		this.AccountHolder=AccountHolder;
	}
	 public void setAccountNumber (long AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	public void setAvailableMalance (double AvailableBAlance) {
		this.AvailableBalance = AvailableBalance;
	}
	
	// Actions:
		// deposit
	public void Deposit (double amount) {
		AvailableBalance += amount;
	}
		// withdraw:
	public void WithDraw (double amount) {
		if (AvailableBalance<=0) {
			System.out.println("Your account balance is less or equal to 0");
			System.out.println("------------------------------------");
			return;
		}
		if(amount>AvailableBalance) {
			AvailableBalance -= 35;
		}
			AvailableBalance -= amount;
		}
		// checking balance:
		
		public void ShowBalance () {
			System.out.println("Available balance is " + AvailableBalance);
			System.out.println("------------------------------------");
		}
		
	// get account info:
		public void getAccountInfo() {
			System.out.println("Name: "+getAccountHolder());
			System.out.println("Account Number: "+getAccountNumber());
			System.out.println("Avalable balance: "+AvailableBalance);
			System.out.println("------------------------------------");
			
		}
	
	
	
	
}
