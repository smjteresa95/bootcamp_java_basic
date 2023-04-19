package api.lang.string_class;

public class StringIndexOf {
	public static void main(String[] args) {
		//특정 문자열의 시작 인덱스값을 반환
		String to = "tomato";
		
		//단일 파라미터로 조회만 할 경우 0번에서 제일 가까운 단어 하나만 조회된다.
		System.out.println(to.indexOf("to"));
		
		//두번째 파라미터로 조회시작하는 파라미터를 지정할 수 있다.
		//조회를 시작할 인덱스를 지정해줄 수 있다.
		System.out.println(to.indexOf("to",1));
		
		//없는 단어 조회시 -1이 나온다.
		System.out.println(to.indexOf("na"));
	}
	
	

}
