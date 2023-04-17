package Animal;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DogActivities extends Dog{
	
	LocalTime now = LocalTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH/mm/ss");
	String formatedNow = now.format(formatter);
	
	String currentTime = formatedNow;
	
	
	public DogActivities() {
		super();
	}
	
	public void playTime() {
		System.out.printf("%s, time to play!", getDogName());
	}
	
	public void napTime() {
		System.out.println("time to take a nap");
	}
	
	public void napTime(String currentTime) {
		System.out.println("currentTime is "+ this.currentTime);
	}

}
