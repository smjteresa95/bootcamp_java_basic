package day06;

//music player로 예를 들어보자, playlist를 꺼버리는 것을 break라고 한다면 skip 버튼은 Coninue이다.
//Break 만나면 해당 반복문(break와 가장 가까운)을 종료시켜버리고, 
//Continue 만나면 넘긴다.
public class Continue {
	public static void main(String[] args) {
		breakEx();
	}
	
	public static void continueEx() {
		//짝수만 출력하는 continue 예시
		for(int i=1; i<11; i++) {
			//짝수인 경우만 출력
			if(i%2!=0)
				continue; //해당 바퀴를 skip, 처음으로 돌아간다.
			System.out.println(i);
		}
	}
	
	public static void breakEx() {
		while(true) {
			int num = (int) (Math.random()*6)+1;
			System.out.println(num);
			//6이 나오면 while문 빠져나오기
			if(num==6) {
				break;
			}
		}
	}
	
	
}
