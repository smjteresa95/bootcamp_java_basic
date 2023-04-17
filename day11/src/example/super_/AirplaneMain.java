package example.super_;

public class AirplaneMain {
	public static void main(String[] args) {
		SupersonicPlane sp = new SupersonicPlane("AE3748");
		
		for (int i=0;i<7;i++){
			sp.fly();
		}
		sp.showStatus();
		
		System.out.println("---------------");
		
		for (int i =0; i<5; i++) {
			sp.fly();
		}
		sp.showStatus();
	}

}
