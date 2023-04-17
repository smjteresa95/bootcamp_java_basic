package day03;

import java.util.Scanner;

/**
 * @author msong
 * 반복문 if, switch 문
 * Scanner 
 *
 */

public class ControlStatement {

	public static void main(String[] args) {
		
		//if문
//		ifStatement();
		
		//switch문
		switchCaseStatement();
		
		//스캐너 입력값 받기
//		scanner();

		
	}
	
	public static void ifStatement() {
		
		//Math.random()*100를 괄호()로 감싸지 않으면 
		//우선적으로 Math.random()을 정수로 형변환을 하게 된다. 
		//Math.random()은 0과 1사이의 수를 랜덤하게 내놓는데 정수형으로 바꾸게되면 0이 된다. 
		//이 이후에 10을 곱하게 되는 것이므로 출력하는 숫자마다 0 이 나오게 된다.
		
		
		//0에서 100까지의 난수
		int score = (int)(Math.random()*101);
		
		if(score >= 60) {
			System.out.println(score + "점입니다. 합격을 축하합니다.");
		} else
			System.out.println(score + "점입니다. 불합격입니다. ");
		
	}
	
	//scanner
	public static void scanner() {
		//스캐너란 프로그램 실행 후 사용자에게 입력을 받는 기능을 가졌습니다.
		//자바 안에서만 쓰고 웹으로 넘어가면 쓸 일이 없다.
		
		//1.스캐너 객체 생성
		//java.util에서 import 해와야 한다. 
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너 클래스가 가진 입력기능을 이용해 값을 입력받는다.
		System.out.println("Fill out your name: ");
		String userName = scan.next();
		
		System.out.println("Hello, "+userName+".");
		
		//3. 사용한 스캐너는 종료시킵니다.
		scan.close();
		
	}
	
	//switch 문
	public static void switchCaseStatement() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메뉴를 번호로 입력해주세요");
		System.out.println("1. 아메리카노, 2. 카페라떼, 3. 녹차프라푸치노");
		int order = scan.nextInt();
		
		//switch ()괄호 안에는 변수 이름을 삽입. case 옆에 있는 값이 case 와 일치하면 해당 작업을 수행.
		//if와 다르게 순번의 영향을 받지 않는다. 
		
		//case마다 break를 달아줘야 코드가 흘러내리지 않는다. 
		//마지막 case는 break문이 필요하지 않지만 가독성을 위해 그냥 쓰곤 한다.
		
		switch(order) {
			case 1: System.out.println("주문하신 아메리카노가 나왔습니다.");
				break;
			case 2: System.out.println("주문하신 카페라떼가 나왔습니다.");
				break;
			case 3: System.out.println("주문하신 녹차프라푸치노가 나왔습니다.");
				break;
			default: System.out.println("주문하신 상품은 없는 상품입니다."); 
		};
		
	}
	
	
	
}
