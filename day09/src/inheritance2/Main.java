package inheritance2;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car("white", 4);
		
		System.out.println(myCar.color);
		myCar.drive();
		myCar.drive();
	}
}
