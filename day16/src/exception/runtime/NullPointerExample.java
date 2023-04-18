package exception.runtime;
/*
 * 문법적으로 문제가 없지만 컴파일 하면 에러가 뜨는 경우를 runtime exception(Unchecked exception)이라고 한다.
 */
public class NullPointerExample {
	public static void main(String[] args) {
		String st = null;
		
		
		System.out.println(st.toLowerCase());
	}

}
