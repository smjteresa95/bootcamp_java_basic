package day05;

public class NestedLoop {
	
	public static void main(String[] args) {
		
//		quiz();
		star2();
	}
	
	public static void quiz() {
		/*
		 * 중첩반복문을이용해서 4x + 5y = 60 이 방정식의 양수 해를 모두 구하는 반복문을 작성해주세요.
		 */
		
		for (int i =0; i < 10; i++) {
			for (int j =0; j< 10; j++) {
				if( 4*i + 5*j == 60)
					System.out.printf("x=%d, y=%d", i,j);
					
			}
			
		}
	}
	
	public static void star2() {
		//중첩반복문을 쓰되 if-else 구문 이용해서 "*" 와 " " 통제
		// ex) n=4 일 때,
		//     *
		//    **
		//   ***
		//  ****
		int n = 5;
		
		for(int i=1; i<=n; i++) { //4줄 출력 - 열 
			for(int j=1; j<=n ; j++) {  // 행 Column
				
				 // i 값은 고정,n-j로 1 부터 4까지 돌렸을 때, 처음 줄에 4개가 나오게 한다.
				// 4-3-2-1(n-j)or(n-i)
				if(j<=n-i) { 
					System.out.print(" ");
				} else {
					System.out.print("*");
				}		
			}	
			System.out.println();
		}
	}
	
	public static void star1() {
		int n = 4;
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) { //j=1 j<4 3번 | j=2 j<4 2번  | j=3 j<4 1번
				System.out.print(" ");
			}
			for(int j=0; j<=i ; j++) { // j=n-1(3) j<4 1번 | j=3-1 j<4 2번 | j=3번
				System.out.print('*');
			}
			System.out.println();
			
		}
	}
}