package AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
	
	public static void main(String[] args) {
		
		BankAccount Daulet = new BankAccount();
		Daulet.setAccountHolder("Daulet Bais");
		Daulet.setAccountNumber(123456789l);
		
		Daulet.getAccountInfo();
		
		Daulet.Deposit(5400);
		Daulet.ShowBalance();
		Daulet.WithDraw(5401);
		Daulet.ShowBalance();
		
				
		BankAccount Sergei = new BankAccount();
		Sergei.setAccountHolder("Sergei Min");
		Sergei.setAccountNumber(987654321l);
		
		Sergei.getAccountInfo();
		
		BankAccount[] accounts = {Daulet, Sergei};
		
		ArrayList<BankAccount> Accounts = new ArrayList<>();
			// Accounts.add(Daulet);
			// Accounts.add(Sergei);
		Accounts.addAll(Arrays.asList(Daulet, Sergei));
	
	// 	System.out.println(Arrays.asList(accounts));
		
		
		
	}

}
