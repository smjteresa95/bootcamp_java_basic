package day02;

public class IntegerFloatExample {
	public static void main(String[] args) {
		intExample();
		floatExample();
		
	}
	
	public static void intExample() {
		//최댓값 언저리에서 값을 넣어보며 테스트 하는 것을 경계값 테스트라고 한다. 
			//int의 최댓값
			//01111111 11111111 11111111 11111111
			int maxInt = 2147483647;
			int minInt = -2147483648;
			
			//int의 최댓값에 10을 더하는 것은  
			//01111111 11111111 11111111 11111111
			//00000000 00000000 00000000 00001010
			System.out.println(maxInt+10); //음수가 나온다. 
			//표현 할 수 있는 범위를 넘어간 경우를 overflow라고 한다. 
			
			//최저에서 1을 빼면 최댓갓으로 바뀐다. 이런 현상을 overflow라고 한다. 
			System.out.println(minInt-1);
			
			byte a =127;
			short b = 32767;
			int c = 2147483647;
			//2147483647은 int 최대범위를 넘어가므로 오류가 뜬다.
			//int 최대범위를 넘어가는 수는 뒤에 L을 붙여서 long 자료형 매직넘버로 바꿔줘야 에러가 사라짐. 
			//d라는 변수에 8바이트의 공간을 설정하겠다 정의하고, 들어가는 값의 default는 int이다.
			long d = 2147483648L;
			
			//2진수 저장시에는 매직넘버앞에 접두어로 0b를 붙인다. 
			int bin = 0b10;
			
			//8진수 저장시에는 정수앞에 접두어로 0을 붙인다.
			int oct = 064;
			System.out.println(oct);
			
			//16진수 저장시에는 정수앞에 접두어로 0x를 붙인다. 
			int hex = 0x3a4c; //hexadecimal
			System.out.println(hex);
		
	}
	
	public static void floatExample() {
		//매직넘버 실수는 double이기 때문에 floa에 저장할 때는 뒤에 f를 붙여서 float으로 바꿔준다. 
		float f1 = 7.12345f;
		double d1 = 7.12345;
		
		System.out.println(f1);
		System.out.println(d1);
		System.out.println("---------------------------");
		
		float f2 = 1.2345678918f;
		double d2 = 1.234567899;
		
		System.out.println(f2); // float 자료형 표현범위가 좁아서 뒷자리가 잘림.
		System.out.println(d2);
		
		
	}
	
	public static void TypeDifferenceExample() {
		
		//정수와 실수 간 연산은 언뜻보기에는 당연한 진행이 될 것 같지만
		//실제로는  저장받는 자료형에 따라 다른 결과가 나옵니다. 
		
		//정수 + 실수를 정수에 저장하는 경우 연산 불가. 컴퓨터 입장에서는 비트 구조가 다르다.
//		int result = 1 + 2.5;
		
		//실수에 정수+실수에 저장하는 경우에는 가능하다. 
		double result2 = 1 + 2.5;
		
		
		
	}
	
	

}
