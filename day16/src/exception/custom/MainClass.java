package exception.custom;

import exception.custom.bankexception.DepositMinusException;
import exception.custom.bankexception.InsufficientBalanceException;

public class MainClass {
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		System.out.println(new StringBuffer("Your currnet balance is $")
				.append(ba.getBalance())
				);
		
		try {
			ba.withdraw(100000);
		} catch(InsufficientBalanceException e) {
			/*
			 * 예외 클래스가 제공하는 getMessage()메서드는 
			 * 예외의 원인 메시지를 Stirng 타입으로 리턴합니다.
			 * 자바 표주 API에서 제공하는 다양한 예외 클래스들은 
			 * 각가의 예외원인 메시지가 기본적으로 객체안에 
			 * 저장되어 있습니다.
			 */
			System.err.println(e.getMessage());
		}
		
		try {
			ba.deposit(-100);
		} catch(DepositMinusException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(new StringBuffer("Your current balance is $")
				.append(ba.getBalance())
				);
	}

}
