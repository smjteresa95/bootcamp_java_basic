package final_.const_;

public class CountryMain {
	
	public static void main(String[] args) {
		//상수만 모아둔 클래스 특성상 클래스명이 곧 집합을 대표하는 이름이 된다.
		System.out.println(CountrySizes.KOREA_SIZE);
		System.out.println(CountrySizes.US_SIZE);
		System.out.println(CountrySizes.THAI_SIZE);
		
		//이를 잘 사용하는 예시는 자바의 Math 클래스이다.
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}
}
