package Object;

public class SavingsAccount {
	//create instance field 
	int balance;
	
	//constructor
	public SavingsAccount(int initialBalance) {
		balance=initialBalance;
	}
	
	//Defining a Method
	//Declare method's return type, name, parameters
	public void deposit(int amountToDeposit) {
		System.out.println("You just deposited $" + amountToDeposit);
		balance += amountToDeposit;
	}
	
	public void withdraw(int amountToWithdraw) {
		System.out.println("You just withdrew $" + amountToWithdraw);
		balance -= amountToWithdraw;
	}
	
	public void checkBalance() {
		System.out.println("Your balance is $" + balance);
	}
	
	public static void main(String[] args) {
		
		//create instance 
		//<Class> <Variable> = new <Class>()
		SavingsAccount savings = new SavingsAccount(1000);
		
		//Methods can change the value of an instance field
		savings.deposit(2000);
		
		savings.withdraw(500);
		
		savings.checkBalance();
		
		
	}
}
