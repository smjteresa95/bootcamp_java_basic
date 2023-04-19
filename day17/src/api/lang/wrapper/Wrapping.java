package api.lang.wrapper;

import java.util.Arrays;

public class Wrapping {
	public static void main(String[] args) {
		int a =100;
		double b = 2.41;
		char c = 'H';
		boolean d= false;
		
		//Wrapping: 기본타입을 참조형 타입으로 만들기
		
		//취소선: deprecated(사용중지)
		//Integer val = new Integer(a);
		
		Integer val1 = a;
		Double val2 = b;
		Character val3 = c;
		Boolean val4 = d;
		Byte val5 = (byte)75;
		
		Object[] arr = {val1, val2, val3, val4, val5};
		System.out.println(Arrays.toString(arr));
		
		//Unwrapping: 래퍼클래스를 다시 기본형자료오 돌리기
		// .자료형Value() 메서드활용
		
		
	}

}
