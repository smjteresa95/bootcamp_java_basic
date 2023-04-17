package day02;

public class OperatorExample {
	
	public static void main(String[] args) {
		unaryOperator();
		binaryOperator();
	}
	
	//단항 연산자(Unary Operator)
	public static void unaryOperator() {
		//증감연산자 ++, --;
		int i = 1;
		int j = i++; //후위 연산자는 먼저 해당코드를 수행하고, 뒤늦게 연산자 로직을 수행합니다. 
		
		
		//int j = i를 먼저 수행하고 i=1
		//i++를 수행해 1을 더합니다. i=2
		//최종적으로 j는 1, i는 2를 저장 받습니다. 
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------------");
		
		/*
		 *반대로 연산자가 앞에 있을 경우 연산자 로직을 먼저 수행 한 후 해당코드를 실행한다.
		 */
		int x = 1;
		int y = ++x;
		
		//++x 이므로, x에 저장된 값에 1을 더하고 (x=1)
		//int y = x를 수행합니다. (x=2)
		//최종적으로 x는 1, y는 2을 저장받습니다.
		System.out.println(y);
		System.out.println("--------------------");
	}
	
	//이항연산자
	public static void binaryOperator() {
		/*
		 * 피연산자(Operand)가 두 개인 연산자를 의미한다. 
		 * 연산자가 int보다 작은 데이터 타입인 경우에 Boolean형을 제외하고 
		 * 모두 int형으로 자동형변환되어 연산을 수행한다. 
		 */
		
		//산술연산자(+,-,*,/,%)
		int i = 7 % 1; //나머지는 정수의 최대 몫을 구하고 남는 숫자만 구한다. 
		System.out.println("7/3의 나머지는 " +i); // 문자와 다른 자료형을 더하면 문자가 연장된다. 
		
		//비교연산자(<, <=, >, =>, ==, !=)
		//컴퓨터에게 특정 명제에 대한 참/거짓을 묻습니다.
		System.out.println(7<5); // false
		System.out.println(8!=9); //true
		
		
		
	}
	

}
