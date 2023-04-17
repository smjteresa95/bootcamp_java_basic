package static_method.atm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ATMTest {

	@Test
	void testWithdraw() {
		ATM atm = new ATM(1, 1000);
		atm.withdraw(500);
		assertEquals(atm.money, 500);
	}
	
	@Test
	void testDeposit() {
		ATM atm = new ATM(2, 1000);
		atm.deposit(500);
		assertEquals(atm.money, 1500);
		assertEquals(ATM.totalMoney, 2000);
	}

}
