package interface_.electronics;

import interface_.Electronic;
import interface_.HomeAppliance;

public class Computer extends HomeAppliance implements Electronic{
	
	public Computer() {
		super("Computer", "LED", 1000);
	}

}
