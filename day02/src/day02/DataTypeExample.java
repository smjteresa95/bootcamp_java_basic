package day02;

public class DataTypeExample {
	
	public static void main(String[] args) {
		
	
	}
	
	public static void charExample() {
		
		//단일문자를 저장하는 데이터 타입 char
		char c1 = 'A';
		char c2 = 66; 
		//문자는 숫자와 교환가능. ascii code상 65는 A, 66은 B.
		//알파벳에 32을 더하면 소문자가 되고, 32를 빼면 대문자가 된다.
		
		/*
		 * 한글 '가'를 유니코드로 표현할때는 AC00인데
		 * 직접 코드값을 char에 저장할 때는 탈출문자 \(역슬래시)u를 왼쪽에 붙입니다.
		 */
		char c3 = '\uAC00' ;
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
		
	}
	
	

	public static void stringExample() {
		//문자열을 저장할 수 있는 데이터 타입 String
		
		//s1이 스택에서 번지수를 들고 있는 것이고 실질적인 데이터 "my dream은 힙에 저장 되어있다. 
		//s1 이 들고 있는 번지수를 따라가면 힙에 저장 되어있는 데이터를 받아올 수 있는 것이다.
		String s1 = "my dream";
		String s2 = "is a developer";
		
	}
	
}
