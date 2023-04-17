package day03;

/**
 * 비트캠프
 * 3-30-2023
 * @author msong
 * 비트연산자, 논리연산자, 대입연산자에, 3항연산자 대해 알아보았다.
 */


public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		bitOperator(); //비트연산자
//		logicalOperator(); //논리연산자
//		assignmentOperator(); //대입연산자
//		conditionalOperator(); // 3항연산자

	}
	
	//Bitwise Operator(비트연산자)
	public static void bitOperator() {
		// 비트연산자(&, |, ^)
		// &(비트곱)두 조건을 만족 할 때 1, 아니면 0 : 두 비트가 1 일 때, 나머지는 0
		// |(비트합)조건 중 하나만 만족해도 1, 모두 만족하지 않으면 0: 두 비트 중 하나 이상이 1이면 1, 두 비트 모두 0이면 0
		// ^(xor 배타적 논리합) 두 비트가 다르면 1, 같으면 0 : 두 비트가 다르면 1, 같으면 0
		
		byte a = 5; // 00000101
		byte b = 3;	// 00000011
		
		//비트곱(and, &)
		//0001
		System.out.println(a & b);
		
		//비트합 (or. |)
		//0111
		System.out.println(a | b);
		
		//배타적 논리합(xor, ^)
		//0110
		System.out.println(a ^ b);
		
		//비트이동연산자(<< , >>)
		//왼쪽 항의 값을 2진수로 변환하여, 오른쪽 항의 값만큼 비트를 왼쪽(<<), 오른쪽(>>) 으로 이동시킨다.
		System.out.println(a << 2);  //0001 0100
		System.out.println(a >> 2);  //0000 0001
		
	}

	//Logical Operator (논리연산자)
	public static void logicalOperator() {
		//short circuit operator
		//&, | 은 모든 결과를 확인하고 넘어가기 때문에 
		//연산효율이 떨어지므로 일반적인 상황에서는 잘 사용하지 않는다. 
		
		//False & 3/0의 몫은 1이다 라는 명제(false & (3/0==1))
		//이미 false가 왼쪽에 와서 false가 확정이지만, 3/0을 수행해 에러가 발생함.
//		System.out.print(false & (3/0==1));
		
//		System.out.print(false && (3/0==1));
		System.out.print(true ||(1!=3));
		
	}
	
	//Assignment Operator(대입연산자)
	public static void assignmentOperator() {
		//+=, -=, *=, /=, %=
		//선언
		int a = 5;
		int b = 5;
		
		b /= 4;
		System.out.println(b); //2
		
		a %= 1;
		System.out.println(a); //1	

	}
	
	//Conditional Operator(삼항연산자)
	public static void conditionalOperator() {
		
		//삼항연산지는 (조건식? 결과1 : 결과 2)형식으로 작성하며
		//해당 위치에 조건이 참이면 결과 1이, 거짓이면 결과 2가 남습니다. 
		int age = 29;
		System.out.println(age<12?"Free meal":"$50 per person");
		
	}
	

}
