package day06;

public class LabelOnNestedLoop {
	public static void main(String[] args) {
		Label();
	}

	public static void Label() {
		/*
		 * 내부 반복문에서 break를 사용하여 바깥쪽 반복문까지 
		 * 한번 종료시키고 싶다면 외부 반복문에 label을 붙입니다.
		 */
		
		//outer라는 이름의 label을 외부반복문에 붙이기
		outer: for (int i=1; i<5; i++) {
			for (int j=1; j<5;j++) {
				System.out.print("(" +i+", "+j+")"+" ");
				if (i == 2 && j==3) {
					
					//만일 label 이 없을 때, break의 타겟은 가장 가까운 for 문이다. 
					break outer;
				}
			} 
			System.out.println();
		}
	}
}

