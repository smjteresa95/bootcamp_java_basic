package Object;

public class Droid {
	
	//Field instance
	public String name;
	public int batteryLevel;
	
	//Constructor
	public Droid(String droidName) {
		name=droidName;
		batteryLevel = 100;
	}
	
	//method
	public void helloString() {
		System.out.println("Hello, I'm the droid "+ name);
	}
	
	public void performTask(int value) {
		System.out.println(name + " is performing task: "+value);
		batteryLevel -= 10;
	}
	public void chargeBattery() {
		System.out.println("Battery level 10 is up");
		batteryLevel += 20;
	}
	
	public void energyReport() {
		System.out.println("Current battery level is "+batteryLevel);
	}
	
	public static void main(String[] args) {
		Droid Bori = new Droid("Bori");
		
		Bori.helloString();
		Bori.performTask(20);
		Bori.chargeBattery();
		Bori.energyReport();
	}
}
