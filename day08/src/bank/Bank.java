package bank;

public class Bank {
	//Field 
	private BankAccount accountOne;
	private BankAccount accountTwo;
	
	//Constructor
	public Bank() {
		accountOne = new BankAccount("Bori", 5000, "b1");
		accountTwo = new BankAccount("Dodam", 3000, "b2");
	}
	
	public static void main(String[] args) {
		//create object
		Bank BankOfAmerica = new Bank();
		
		System.out.println(BankOfAmerica.accountOne.getBalance());
		System.out.println(BankOfAmerica.accountOne.getMonthlyInterest());
		
	}

}
