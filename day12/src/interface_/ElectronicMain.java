package interface_;

import interface_.electronics.Computer;

public class ElectronicMain {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		
		System.out.println(c1.getElectricityUse());
		
		c1.printDescription();
		
	}

}
