package quiz;

public class ParseIntExample {
	public static void main(String[] args) {
		String str = "2002";
		
		//Integer.parseInt(교환 할 문자) 
		int year = Integer.parseInt(str);
		
		System.out.println(str + year);
		System.out.println(year+10);
		
		//str 값이 숫자의 형태를 띄고 있지 않기 때문에 에러가 뜬다.
		String str2 = "abc";
		System.out.println(Integer.parseInt(str2));
		
	}
}