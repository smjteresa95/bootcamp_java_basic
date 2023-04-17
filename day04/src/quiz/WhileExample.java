package quiz;

import java.util.Scanner;

public class WhileExample {
	
	public static void main(String[] args) {
//		quiz2();
		rangeRan();
		
	}
	
	public static void quiz1() {
		//컴퓨터와 스무고개 수 맞추기
		int comValue = (int)(Math.random()*101); //0부터 100까지의 랜덤갯수 생성
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0-100까지 숫자를 입력해 주세요.");
		//사용자에게 숫자 입력받게 함.
		int userValue = scan.nextInt();
		
		//while() 괄호 안에 있는 조건이 유지되는 동안 루프를 돌린다.
		//컴퓨터의 값과 유저의 값이 일치해야만 종료하므로, 불일치시에는 계속 진행하도록 처리.
		while(userValue != comValue) {
			//불일치라면 먼저 업인지, 다운인지 알려주기
			if (comValue>userValue) {
				System.out.println("up");
			}else
				System.out.println("down");
			
			System.out.println("다시 입력해 주세요");
			userValue = scan.nextInt();
		}
		
		System.out.println("숫자가 일치합니다.");
		scan.close();
 		
	}
	
	//quiz1 응용문제
	/*
	 * 1. 0~100인 범위를 0~사용자가 입력한 값으로 설정할 수 있게 코드 바꿔주세요.(최솟값, 최댓값 정의하게 해도 됨)
	 * 2. 위에 적힌 범위를 벗어나는 숫자가 있으면 다시 입력받게 해주세요
	 * 3. 몇 번 시도끝에 맞췄는지 정답 확인시 알려주도록 해 주세요.
	 */
	public static void quiz2() {
		
		int cnt = 0; //시도 횟수 카운트 할 값.
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Set min num: 0-100까지 숫자 중 최소 범위를 설정해주세요.");
		int minValue = scan.nextInt(); //사용자에게 최대범위숫자 입력받게 함.
		
		//2-1/ 위에 적힌 범위(0-100)를 벗어나는 숫자가 있으면 다시 입력받게 해주세요
		while(minValue<0 || minValue>100) {
			System.out.println("error: 범위가 넘어가는 숫자를 입력했습니다. 다시 입력해주세요.");
			minValue = scan.nextInt();
		} 
		
		System.out.printf("Set max num: %d-100까지 숫자 중 최대 범위를 설정해주세요.",minValue);
		//사용자에게 최대범위숫자 입력받게 함.
		int maxValue = scan.nextInt();
		
		//2-2. 최초범위와 기본설정범위를 벗어나는 숫자가 있으면 다시 입력받게 해주세요
		while(maxValue<minValue || maxValue>100) {
			System.out.println("error: 범위가 아닌 숫자를 입력했습니다. 다시 입력해주세요.");
			maxValue = scan.nextInt();
		}
		
		int comValue = (int)(Math.random()*((maxValue+1)-minValue))+minValue; //사용자가 설정 한 minValue부터 maxValue까지의 랜덤갯수 생성
		

		System.out.printf("설정한 범위 안에서 숫자를 입력하세요. 설정한 범위는 %d - %d 입니다.", minValue, maxValue);
		//사용자에게 맞출 숫자 입력받게 함.
		int userValue = scan.nextInt();
		System.out.println(comValue);
		
		
		//유저가 선택한 값과 사용자가 설정한 범위안에서의 난수가 일치하지 않으면 while문을 돌린다.
		while(userValue != comValue) {
			//실행횟수 카운트
			cnt++;
			
			//불일치라면 먼저 업인지, 다운인지 알려주기
			if (comValue>userValue) {
				System.out.println("up");
			}else
				System.out.println("down");
			
			System.out.println("다시 입력해 주세요");
			userValue = scan.nextInt();
		}
		
		//3. 몇 번 시도끝에 맞췄는지 정답 확인시 알려주도록 해 주세요.
		System.out.println("숫자가 일치합니다."+ cnt + "번 만에 맞췄습니다.");
		scan.close();	
	}
	
	public static void rangeRan() {
		int minValue = 10;
		int maxValue = 30;
		
		//우선 0에서 20까지 나오게 한 다음에 최솟값을 더해서 범위를 맞춰준다. 
		int comValue = (int)(Math.random()*((maxValue+1)-minValue))+minValue;
		System.out.println(comValue);
	}

}
