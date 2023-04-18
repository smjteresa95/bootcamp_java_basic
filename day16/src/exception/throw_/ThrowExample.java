package exception.throw_;

public class ThrowExample {
	//여기의 Exception은 checked exception이다. 
	public static int calcSum(int n) throws Exception{
		/*
		 * 프로그램이 throw구문을 만나는 순간 즉시 예외를 발생시키고 
		 * 해당 예외처리해줄 catch블록이 있는 지 검색한다. 
		 */
		if(n<=0) {
			//예외는 나지 않았지만 먼저 선수를 친 거. 
			throw new Exception();//예외도 클래스로 정의되기 때문에 인스턴스 생성
			
			//문법적으로는 틀린게 없지만 논리적으로 말이 맞지 않는 경우 
			//예외를 친다.
		}
		int sum = 0;
		for(int i=0; i<=n; i++){
			sum+= i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		try {
			int result1 = calcSum(100);
			System.out.println(new StringBuffer("1~100까지의 누적 합")
					.append(result1));
			int result2 = calcSum(-100);
			System.out.println(new StringBuffer("1~-100까지의 누적 합")
					.append(result2));
		} catch(Exception e) {
			System.out.println(new StringBuffer("매개값을 양수로 전달 해주세요"));
		}
	}

}
