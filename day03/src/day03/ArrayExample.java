package day03;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		arrayExample();
	}
	
	public static void arrayExample() {
		//배열은 참조형 데이터타입이다.
		//선언, 생성, 초기화의 과정을 통하여 만들어진다.
		
		//배열언선: <데이터타입[]><배열이름>
		//배열생성: <배열이름> = new <데이터타입[배열의 크기]>
		//배열의 길이: <배열이름>.length
		
		//배열언선: Stack에 배열주소를 담을 변수생성.
		int[] score;
		
		//배열생성: heap에 실제 데이터가 저장될 공간을 생성. 스텍에는 변수가 데이터가 저장된 공간의 주소만 들고 있다. 
		score = new int[5];  //배열은 생성시 크기를 명시함. 한 번 크기 세팅시 조정불가.
		System.out.println(score);  //실제로 주소를 담고 있으므로 주소가 나온다.
		
		//배열값 초기화
		score[0] = 12;
		score[2] = 5;
		score[4] = 1;
		
		//배열값 참조(조회)
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		//배열내부에 저장된 값을 한눈에 문자열 형태로 확인하기 위해서는 Arrays.toString(배열변수); 를 사용한다.
		System.out.println(Arrays.toString(score));
		
		//배열길이를 알아보려면 변수명.length를 사용한다.
		System.out.println(score.length);
		
		//배열의 선언과 초기화를 동시에 하는 법 {};
		int[] ary1 = {1,3,5,7,9};
		System.out.println(Arrays.toString(ary1));
			
	}
	
	

}
