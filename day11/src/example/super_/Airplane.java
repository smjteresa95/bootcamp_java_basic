package example.super_;

public class Airplane {
	public String planeCode;
	public int speed;
	public int gas;
	
	public Airplane(String planeCode) {
//		this(planeCode, 0, 100);
		
		this.planeCode=planeCode;
		this.speed=0;
		this.gas=100;
	}
	
	public void fly() {
		
		if(this.gas-3<=0) {
			this.gas=0;
			System.out.println("low fuel");
			return;
		} 
		
		if(this.speed-100>=900) {
			this.speed=900;
			return;
		}
		
		this.gas-=3;
		this.speed+=100;
	}
	
	public void showStatus() {
		System.out.println("plane code = "+planeCode);
		System.out.println("current speed = "+speed);
		System.out.println("Current gas " +gas);
	}



}
