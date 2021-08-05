package ClassAndObjects;

public class BankAccount {
	/*
	 WarmUp:create a custom class for BankAccount
	 attributes/data that can have are:
	 	1.  AccountHolder, 2. AccountNumber, 3.	 Balance
	 	
	 	Actions: deposit, withdraw, showBalance
	 	
	 	requiremnts:
	 	1.  user should be able to deposit money into their account
	 	2.  user should be able to withdraw money from their account
	 		2.1. if the withdrawing account is greater than available balance, 35$ penalty charge will be added
	 		2.2. if the balance is less than or equal to 0, user should not be able to withdraw money
	 	3.  user should be able to see their balance
	 */
	
	String AccountHolder;
	long AccountNumber;
	double Balance;
	
	   public BankAccount () {
		
	}
	public BankAccount (String AccountHolder, long AccountNumber) {
		this.AccountHolder = AccountHolder;
		this.AccountNumber = AccountNumber;
	}
	
	public void ShowBalance() {
		String acct = ""+AccountNumber;
		String AccountNumber = "**** **** **** "+acct.substring(12);
		System.out.println("Accaunt Holder: "+AccountHolder);
		System.out.println("Balance is: "+Balance+" dollars");
		System.out.println("Account Number: "+AccountNumber);
		System.out.println("Available Balance: $"+Balance);
		System.out.println("--------------------------------------");
	}
	 
	public void Deposit(double amount) {
		String acct = ""+AccountNumber;
		String AccountNumber = "**** **** **** "+acct.substring(12);
		System.out.println("Depositing $"+amount+" to the account "+AccountNumber);
		Balance += amount;
		System.out.println("New current balance is: $"+Balance);
		System.out.println("--------------------------------------");
	}
	
	public void Withdraw (double amount) {
		if (Balance<amount ) {
			System.out.println("Withdraw "+amount+ " not possible");
			System.out.println("New current balance is: $"+Balance);
			return; // exits the method withdraw
		}
		String acct = ""+AccountNumber;
		String AccountNumber = "**** **** **** "+acct.substring(12);
		System.out.println("Withdrawing $"+amount+" from the account "+AccountNumber);
		Balance -= amount;
			if (Balance<0) {
				Balance-=35;
			}
		System.out.println("New current balance is: $"+Balance);
		System.out.println("--------------------------------------");
		
		
		
	}
	
	public void AccountSetUp(String name, long AcctNum) {
		AccountHolder = name;
		AccountNumber = AcctNum;
		
		
		
		
	}
	
}
