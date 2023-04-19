package api.lang.string_class;

public class StringTrim {
	public static void main(String[] args) {
		//Trim은 좌측, 우측에서 다른 단어가 나오기 직전까지 공백을 전부 제거합니다.
		String beforeTrim = "      ffr   0";
		System.err.println(beforeTrim);
		String afterTrim = beforeTrim.trim();
		System.out.println(afterTrim);
	}

}
