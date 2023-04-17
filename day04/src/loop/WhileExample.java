package loop;

public class WhileExample {
	//while문
	//몇바퀴 돌릴 지 정해지지 않고 조건만 만족시킬 경우에 반복동작을 하는 경우에 쓴다. 
	public static void main(String[] args) {
		
		//While 반복문 로직파악을 위한 예시
		//While()안에 있는 것이 False가 나오면 루프를 종료한다.
		//while 문을 실행하면 중괄호{} 까지 실행된다고 보면 됨. 
		int count =0;
		while (count<3) {
			count++;
			System.out.println("while이 실행중입니다. "+count);
		} 
	}
	
	public static void infiniteWhileLoop() {
		//무한루프는 어떻게 판단해도 "참"이 나올 수 밖에 없는
		//조건식을 while문 조건식에 집어넣으면 만들어진다. 
		//자연적으로 절대 종료되지 않으므로 강제로 종료버튼을 눌러야 해결된다. 
		while(true) {
			System.out.println("자연적으로 끝나지 않는 무한루프");
		}
	}
}

