package static_method.atm;

public class ATM {
	
	//static variable
	//여러 ATM의 총합 보유금액, ATM의 총 갯수
	public static int totalMoney=0;
	public static int numATMs=0;
	
	public int money;
	public int atmId;
	
	public ATM(int atmId, int money) {
		this.atmId=atmId;
		this.money+=money;
		numATMs+=1;
		totalMoney+=money;
	}
	
	public void getATMCurrent(int atmId){
		System.out.println(this.atmId + " : Current Total Amount is $"+money);
	}
	
	public void withdraw(int amountToWithdraw) {
		if(this.money>=amountToWithdraw) {
			this.money-=amountToWithdraw;
			totalMoney+=amountToWithdraw;
		} else
			System.out.println("not enough to withdraw money");
	}
	
	public void deposit(int amountToDeposit) {
		this.money+=amountToDeposit;
		totalMoney+=amountToDeposit;
		
	}
	
	public void showAllATMsMoneyTotal() {
		System.out.println("total money of all ATMs: $"+totalMoney);
	}
	
	public void showAllATMsAvgMoneyTotal() {
		System.out.println("Average money of all ATMs: $" + totalMoney/numATMs);
	}
	
	public void showTotalATMsNum() {
		System.out.println("Total Number of ATMs is "+ numATMs);
	}

}
