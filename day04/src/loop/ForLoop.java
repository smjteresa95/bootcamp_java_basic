package loop;
/*
 * for(int i=0; i < n; i++) 일 때, for loop 는 n만큼 돌아간다. 0부터 10까지 돌리는 경우 n은 11이다.
 */
public class ForLoop {
	
	public static void main(String[] args) {
		forQuiz1();
	}
	
	public static void forLoop() {
		int sum = 0;
			 //초기값	 조건식  증감값
		for (int i=0; i<5; i++) {
			sum +=i; //sum에 0,1,2,3,4를 순차적으로 누적해 더함.
		}
		System.out.println("0~4까지의 누적 합: "+ sum);
	}
	
	public static void forQuiz() {
		
		//0~100까지 돌리고 7의 배수만 출력
		
		for (int i=0; i<101 ; i++) {
			if(i%7==0 && i !=0) {
				System.out.println(i);
			}
		}
		
		System.out.println("---------------------");
		
		//7부터 시작해서 7씩 더하기
		for(int i=7; i<101; i+=7) {
			System.out.println(i);
		}
		
	}
	public static void forQuiz1() {
		//랜덤 구구단
		//구구단의 범위는 1~9까지.
		//Math.random()을 어떻게 활용하면 범위를 1~9로 할 수 있을 지, (0~8)
		//난수로 얻은 값에 1~9로 곱한 값을 for문 이용해 콘솔에 찍어주세요
		
		int ranNum = (int)(Math.random()*9)+1;
		
		for(int i=1; i<10; i++) {
			System.out.println(ranNum*i);
		}
	}
	
	
	

}
