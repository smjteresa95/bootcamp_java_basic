package api.lang.string_class;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72,101,108,35,45,67,88};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 3, 4); // 인덱스 위치, 갯수
		System.out.println(str2);
	}

}
