package day05;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {

		breakExample();
	}
	
	public static void whileBreak() {
		/*
		 * 무한루프는 보통 break와 조합해 사용합니다.
		 */
		
		int i =0;
		while(true) {
			if(i==15) {
				break;
			}
			System.out.println(i);
			i++;
		}
	}
	
	public static void breakExample() {
		// 1. 난수 2개를 발생시켜주세요. 범위는 1-10로 두개 만들어주세요
		
		// 2. while 문을 무한루프로, 위에서 발생된 난수 2개를
		// a*b의 답은? 이라고 질문해서 문제를 제출
		
		// 3. if문으러 비교해 정답시 break문으로 빠져나오고
		//오답인 경우"오답입니다" 라는 멘트와 답을 재입력 받게 해주세요.
		
		int a = (int) (Math.random() * 10)+1;
		int b = (int) (Math.random() * 10)+1;
		int x = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%d * %d 의 답은?", a, b);
		
		while(true) {
			x = input.nextInt();
			if (x == a*b) {
				System.out.println("정답입니다."); 
				break;
			}else {
			System.out.println("오답입니다.");
			}
			
			x = input.nextInt();
		}
		input.close();
	}
}
