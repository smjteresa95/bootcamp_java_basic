package singleton_example;

public class Car {
	
	//최초 한 번만 객체를 생성
	private static Car car = new Car();
	
	private Car() {
	}
	
	//getInstance() 메서드 외에는 Car 객체를 생성 및 사용할 수 없다.
	public static Car getInstance() {
		return car;
	}
	
	private static boolean isUse = false;
	
	//차 사용 시작
	public static void drive() {
		isUse = true;
		System.out.println("start driving");
	}
	
	//차 사용 종료
	public static void parking() {
		isUse = false;
		System.out.println("parking");
	}
	
	public static boolean isEnableUseCar() {
		return !isUse;
	}
	
	
	
	

}
