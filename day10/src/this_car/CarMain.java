package this_car;

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car("Tesla");
		Car yourCar = new Car("Honda");
		
		for(int i=0;i<10;i++) {
			myCar.accel();
		}
		
		System.out.println(myCar.getSpeed(0));
	}
	
	
}
