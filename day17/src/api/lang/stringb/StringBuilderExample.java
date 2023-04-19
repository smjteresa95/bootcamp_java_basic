package api.lang.stringb;

/*
 * 이 작업하는 내내 heap에서 garbage collection 이 일어나지 않았다.
 * 
 * StringBuffer는 여러개의 쓰레드가 들어올 때 하나씩만 받아서 처리해주기 때문에 쓰레드 안전을 보장한다.
 * ex) 자기가 소화할 수 있는 만큼만 받아서 처리하고 다 처리하면 다음 것을 받아서 한다. 성능이 떨어지는 편이다. 
 * 
 *  StringBuilder 는 쓰레드 안전을 보장하지 않는다. 
 *  한꺼번에 처리한다. 지역변수/메서드안에서만 쓴다. 
 *  
 *  안정성을 위해서는 StringBuffer 를 쓴다. 
 * 
 * 
 */
public class StringBuilderExample {
	public static void main(String[] args) {
		//StringBuffer로 대체가능
		StringBuilder sb = new StringBuilder("Java");
		
		//문자열을 끝에 추가하는 메서드
		sb.append(" program study");
		
		System.out.println(sb.charAt(sb.length()-1));
		
		//문자열을 특정 인덱스 위치에 삽입하는 메서드 insert()
		sb.insert(12, "ming");
		
		//특정 인덱스 범위 문자열을 교체하는 메서드 replace()
		sb.replace(5, 16, "book");
		
		//문자열을 삭제하는 메서드 delete(begin, end)
		//Java study
		sb.delete(4, 9);
		
	}

}
