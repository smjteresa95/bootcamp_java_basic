package exception.custom.bankexception;

/*
 * 사용자 정의 예외 클래스를 만들려면 Exception클래스나 
 * 혹은 RuntimeException클래스를 상속받습니다.
 */
public class InsufficientBalanceException extends RuntimeException{
	
	/*
	 * 일반적으로 사용자 정의 예외 클래스를 만들때는 
	 * 기본생성자와 예외 원인 메시지를 받는 생성자를 
	 * 두개 오버로딩해서 선언만 해준다.
	 */
	
	public InsufficientBalanceException() {}
	
	public InsufficientBalanceException(String message) {
		super(message);
	}
	

}
