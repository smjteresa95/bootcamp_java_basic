package quiz;

import java.util.Scanner;

public class SwitchExample {
	
	/*
	 * 직급을 입력하세요.
	 * [사원,대리,과장,차장,부장] - > 200, 300, 400, 500, 600
	 * 대리의 급여는 300만원입니다.
	 * or 
	 * 사워는(은)없는 직급입니다. 직급을 다시 입력해 주세요.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("직급을 입력하세요.");
		String inputRole = scan.next();

		switch(inputRole) {
			case "사원": System.out.println("사원의 급여는 200만원입니다.");
				break;
			case "대리": System.out.println("대리의 급여는 300만원입니다.");
				break;
			case "과장": System.out.println("과장의 급여는 400만원입니다.");
				break;
			case "차장": System.out.println("차장의 급여는 500만원입니다.");
				break;
			case "부장": System.out.println("부장의 급여는 600만원입니다.");
				break;
			default:
				System.out.println(inputRole+" 은(는) 없는 직급입니다.");
				System.out.println("직급을 다시 입력해주세요.");
		} //switch~case 닫는 부분

	}
}
