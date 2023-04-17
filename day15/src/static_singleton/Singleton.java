package static_singleton;

public class Singleton {
	
	/*
	 * 1. 외부에서 생성자를 사용할 수 없도록 생성자에 private 을 붙임
	 */
	private Singleton() {};
	
	
	/*
	 * 자신의 클래스 내부에서 객체 하나를 만든다.
	 */
	private static Singleton instance;
	
	
	/*
	 * 3. 외부에서 이 클래스의 객체를 필요로 하는 경우
	 * 2번에서 static으로 생성된 객체의 주소를 return합니다.
	 */
	static {
		instance = new Singleton();
	}
	
	
	public static Singleton getInstance() {
		return instance;
	}

}
