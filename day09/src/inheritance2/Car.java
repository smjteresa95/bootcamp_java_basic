package inheritance2;

public class Car extends Vehicle{
	int numWheels;
	
	public Car(String color, int numWheels) {
		super(color);
		this.numWheels = numWheels;
	}

	public void drive() {
		System.out.println("Driving a car.");
	}
}
