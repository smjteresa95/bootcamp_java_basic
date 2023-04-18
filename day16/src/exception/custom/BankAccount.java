package exception.custom;

import exception.custom.bankexception.DepositMinusException;
import exception.custom.bankexception.InsufficientBalanceException;

public class BankAccount {
	
	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(long amountToDeposit) throws DepositMinusException {
		if(amountToDeposit<0) {
			throw new DepositMinusException("Invalid deposit amount");
		}
		this.balance+=amountToDeposit;
	}
	
	public void withdraw(long amountToWithdraw) throws InsufficientBalanceException {
		if(this.balance<amountToWithdraw) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		this.balance-=amountToWithdraw;
	}
	
	//생성자도 돌리다가 중지시켜야 하는 일이 생길 수 있다. 이럴 때 custom exception을 만들어 쓰면 된다. 
}
