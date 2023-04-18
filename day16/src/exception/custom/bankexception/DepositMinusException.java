package exception.custom.bankexception;

public class DepositMinusException extends RuntimeException {

	public DepositMinusException(){}
	public DepositMinusException(String message) {
		super(message);
	}

	
}
