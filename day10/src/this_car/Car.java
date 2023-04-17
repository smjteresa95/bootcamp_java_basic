package this_car;

public class Car {
	public String model;
	public int speed;
	
	public Car(String model) {
		this.model = model;
		speed =0;
	}
	
	public int getSpeed(int speed) {
		return this.speed;
	}
	
	public void accel() {
		
		if(speed +10 >= 150) {
			speed =150;
		} else {
			speed += 10;
		}
	}
	

}
