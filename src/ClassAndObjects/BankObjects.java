package ClassAndObjects;

public class BankObjects {
	public static void main(String[] args) {
		
		
	
		BankAccount Holder1 = new BankAccount();
		
		Holder1.AccountHolder = "Daulet Baisabayev";
		Holder1.AccountNumber = 1234_5665_6515_1225l;
		Holder1.Balance = 1_000;
		
		
		Holder1.ShowBalance();
		System.out.println("------------------------------  ---------------------");
		Holder1.Deposit(125);
		System.out.println("---------------------------------------------------");
		Holder1.Deposit(6532);
		System.out.println("---------------------------------------------------");
		Holder1.Withdraw(7658);
		System.out.println("-------------------------------------------------------");
		Holder1.Withdraw(635);
		System.out.println("-------------------------------------------------------");
		Holder1.Deposit(3265);
		System.out.println("-------------------------------------------------------");
		Holder1.Withdraw(10288);
		System.out.println("-----------------------------------------------------------");
		BankAccount Holder2 = new BankAccount();
		Holder2.AccountSetUp("Miras Marat", 1111222233334444l);
		Holder2.ShowBalance();
		System.out.println("-----------------------------------------------------------");
		Holder2.Deposit(5620);
		System.out.println("-----------------------------------------------------------");
		Holder2.Withdraw(3256);
		
		BankAccount Holder3 = new BankAccount("Assel Kass", 1111222233334445l);
		Holder3.ShowBalance();
		Holder3.Deposit(7953);
		
		Holder3.Withdraw(7953);
		Holder3.Deposit(98652);
		
}
	
}
