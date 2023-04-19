package api.lang.string_class;

public class StringReplace {
	public static void main(String[] args) {
		//자바는 15버전부터 멀티라인 문자열을 지원한다.
		//여닫는 따옴표를 여러줄에 걸쳐서 작성할 때는  """ 세개를 이용한다.
		String a = """		
				Provides the management interfaces for monitoring and management 
				of the Java virtual machine 
				and other components in the Java runtime.
				""";
		
		String newA = a.replace("Java", "Python");
		System.out.println(newA);
	}

}
