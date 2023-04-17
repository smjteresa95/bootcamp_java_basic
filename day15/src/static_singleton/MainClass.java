package static_singleton;

public class MainClass {
	public static void main(String[] args) {
		//singleton 객체는 생성자가 private이므로 인스턴스 생성불가
		//이쪽에서 객체 생성자체를 막아버리니까 두번째 줄이 실행자체가 안됨
//		Singleton s1 = new Singleton();
//		s1.getInstance();
	
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1의 주소: " +s1);
		
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2의 주소: " +s2);
		
	}

}
