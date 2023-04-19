package api.lang.string_class;

public class StringCharAt {
	public static void main(String[] args) {
		//일반 배열은 아래와 같이 인덱싱이 가능하다
		int[] iArr = {1,2,3,4};
		System.out.println(iArr[2]);
		
		//문자열은 일반 인덱싱이 불가능([]을 활용하는 인덱싱)
		String str = "ABC";
		System.out.println(str.charAt(2));

	}

}
