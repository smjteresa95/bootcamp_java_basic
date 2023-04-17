package day07;

/*
 * 반환유형(return type)
 * 1. 반환값은 메서드를 호출한 곳으로 전달해주는 return구문 우측 값을 의미합니다.
 * 2. 매개변수는 여러개 입력 받을 수 있지만 반환값은 하나여야 합니다.
 * 3. return 키워드를 이용해 반환값을 지정할 수 있습니다.
 * 4. 전달할 반환값의 자료형을 반환유형이라고 부릅니다.
 * 5. 반환값이 있는 메서드는 호출문 위치에 하나의 값이 전달되기 때문에
 * 	  매직넘버 대신 사용할 수 있습니다. 
 * 6. 반환값이 없는 메서드는 void를 기입합니다 
 * 7. 모든 메서드 return을 만나는 순간 즉시 종료됩니다. 
 * 	  분기가 아닌 return 구문 하단에 추가코드를 작성하면 경고가 뜹니다.
 * 
 * void 반환값에 return; 을 break문 처럼 쓸 수도 있다. 
 */
public class Method1 {
	
	public static int add(int n1, int n2) {
		return n1+n2;
	}
	
	public static void callMyName(String name) {
		//문자열도 배열이므로 .length()로 문자갯수를 셀 수 있습니다.
		if(name.length()<2) {
			System.out.println("이름은 최소 2글자 이상 입력해야합니다.");
			//반환값이 void인 메서드에서 return은 메서드를 종료하는 break 문처럼 쓰인다. 
			return;
		} 
		System.out.println("내 이름은 "+name+"입니다.");
	}
	
	//배열 리턴시 자료형에도 배열임은 명시해야합니다.
	public static int[] totalOperate(int n1, int n2) {
		int[] total = {n1+n2, n1-n2, n1*n2, n1/n2};
		return total;
	}
	
	public static void main(String[] args) {
		int result1 = add(3,5);
		System.out.println(result1);
		
		//리턴자료가 있는 함수는 매직넘버 대신 사용할 수 있다.
		int result2 = add(add(2,4), add(5,6));
		System.out.println(result2);
		
	}

}
