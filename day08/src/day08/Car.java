package day08;

public class Car {
	public String modelName;
	public int maxPassenger;
	public int currentSpeed;
	public String owner;
	public String fuel;
	
	//상수 선언은 final static으로 선언하면 된다. 매직넘버 대신에 쓸 수 
	public final static int BOOST_SPEED = 10;
	public final static int BREAK_SPEED = 10;
	
	public Car(String carModel, int velocity, int maxPassengerNum, String carOwner) {
		modelName = carModel;
		currentSpeed = velocity;
		maxPassenger = maxPassengerNum;
		owner = carOwner;
	}
	
	//가속기능
	public void accelerate() {
		currentSpeed += BOOST_SPEED;
	}
	
	//감속기능
	public void breakSpeed() {
		currentSpeed -= BREAK_SPEED;
	}
	
	//계기판 조회
	public void showStatus() {
		System.out.println("차종: " + modelName);
		System.out.println("속도: " + currentSpeed);
		System.out.println("최대승차인원: " + maxPassenger);
		System.out.println("차주: " + owner);
		System.out.println("연료량: " + fuel);
		
	}
	


}
