
/**
 * 3-30-2023
 * @author msong
 * 난수만들기 여기서 참고해서 보면 된다. 
 */
package day03;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		switchExample1();

	}
	
	
	public static void ternaryOperatorQuiz() {
		//난수 발생 명령어 Math.random() 은 
		//0보다 크고 1보다 작은 난수를 호출위치에 가져다 둡니다.
		//난수에 10을 곱하고 그 값을 정수로 형변환 시켜주면 0-9까지의 난수가 발생
//		System.out.println((int)(Math.random()*10));
		
		int randomNumber = (int) (Math.random()*10);
		
		//삼항연산자를 이용하여 난수로 얻은 값이 
		//7 보다 크면 "당첨", 작으면 "낙점"을 result 에 저장 후 프린트하세요. 
		
		String result = randomNumber>7 ? "당첨": "낙첨";
		System.out.println(result);
	}
	

	public static void ifQuiz1() {
		
		//if문은 우선순위가 위에서부터 내려온다. 
		//해결 될 수 있는 범위가 좁은 것을 먼저 쓰고 넓은 것을 나중에 써라.
		
		int score = 85; 
		
		if(score >= 90) {
			System.out.println("A학점입니다.");
		} else if(score >= 80) {
			System.out.println("B학점입니다.");
		} else if(score >=70) {
			System.out.println("C학점입니다.");
		} else if(score >=60) {
			System.out.println("D학점입니다.");
		} else 
			System.out.println("F학점입니다.");
		
	}
	
	public static void ifQuiz2() {
		int number = -4;
		
		if(number>0) {
			if (number%2==0)
				System.out.println("짝수입니다.");
			else
				System.out.println("홀수입니다.");
		} else if (number<0) {
			System.out.println("음수입니다.");
		} else
			System.out.println("0 입니다.");
	}
	
	
	public static void switchExample1() {
		String[] foods = {"햄버거", "짜장면", "파스타", "곱창구이", "케이크"};
		
		//0~4 범위 난수를 얻게 해주세요
		int idx = (int)(Math.random()*5);
		
		switch(foods[idx]) {
			case "햄버거": System.out.println(foods[0]+"는 양식입니다.");
				break;
			case "짜장면": System.out.println(foods[1]+"은 중식입니다.");
				break;
			case "파스타": System.out.println(foods[2]+"는 이탈리안입니다.");
				break;
			default:
				System.out.println("기타요리입니다.");
			
		}
		
	}


}
