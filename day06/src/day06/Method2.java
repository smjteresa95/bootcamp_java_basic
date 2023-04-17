package day06;
/**
 * 
 * @author msong
 * 매개변수 (parameter)
 * 1. 매개변수는 메서드 호출 시 불완전한 문장을 채워주기 위해 사용되는 변수입니다.
 * 2. 매개변수에 어떤 값이 전달되는 지에 따라 메서드의 실행 결과가 달라집니다.
 * 3. 어떤 매개변수를 이용해 문장을 완성시킬지는 선언부에 작성합니다.
 * 4. 매개변수가 필요없는 경우 비울 수 있습니다.
 *
 */

public class Method2 {
	
	public static void greet(String name) {
		System.out.println(name + "님, 안녕하세요");
	}
	
	public static void getThaiNumber() {
		System.out.println("능 : 1");
		System.out.println("썽 : 2");
		System.out.println("쌈 : 3");
		System.out.println("씨 : 4");
	}
	
	public static void main(String[] args) {
		
		//위의 메서드는 return 구문이 없으므로 
		//System.out.println(); 사이에 넣을 수 없습니다.
		// 메서드 종료 후 호출 위치로 전달 될 값이 없기 때문입니다.
		greet("송민지");
		//System.out.println(greet("송민지")); <- 이게 될 수가 없다. 
		getThaiNumber();
		
	}

}
