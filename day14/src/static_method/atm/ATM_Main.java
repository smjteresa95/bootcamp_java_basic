package static_method.atm;

public class ATM_Main {
	public static void main(String[] args) {
		ATM a1 = new ATM(1, 5000);
		
		ATM a2 = new ATM(2, 10000);
		
		ATM a3 = new ATM(3, 2000);
		
	
		
		a1.deposit(8000);
		
		a1.showAllATMsMoneyTotal();
		a2.withdraw(5000);
		a1.showTotalATMsNum();
		a1.showAllATMsMoneyTotal();
	}

}
