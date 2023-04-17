package loop;

public class ForEach {
	public static void main(String[] args) {
		String[] weekDay = {"일","월","화","수","목","금"};
		
		//향상된 for문은 위와 같은 리스트 내부자료를 하나씩 소비해 반복문을 실행합니다.
		//Java 5에서 추가된 문법입니다. 
		
		//배열의 형을 따라가야 한다. 
		for(String day: weekDay) {
			System.out.printf("%s요일\n",day);
		}
	}

}
