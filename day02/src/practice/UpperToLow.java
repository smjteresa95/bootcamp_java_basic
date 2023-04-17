package practice;

public class UpperToLow {

	public static void main(String[] args) {
		asciiChange();
		splitExample();
		
	}
	
	public static void asciiChange() {
		String str = "Example";
		
		//char 로 된 배열 result의 크기를 입력받은 str문자열의 길이와 같게 초기화 한다.
		char[] result = new char[str.length()];
		
		//입력받은 str 의 길이 만큼 동작을 수행한다
		for(int i=0; i<str.length() ; i++) {
			
			result[i] = (char) (str.charAt(i)-32);
		}
		
		System.out.println(result);	
	}
	
	public static void splitExample() {
		//문자열 str을 배열에 각각 나눠 담는다. 
		
		String str = "Apple";
		String[] result = str.split("");
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(result[i]);
		}
		
	
		
	}
	
	

}
