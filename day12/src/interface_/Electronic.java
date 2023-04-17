package interface_;

public interface Electronic {
	
	//Constant variable
	String LED = "LED";
	
	//Abstract method
	int getElectricityUse();
	
	
	//Static method
	static boolean isEnergyEffcient(String electronicType) {
		if(electronicType.equals(LED)) {
			return true;
		}else
			return false;
	}
	
	//default method
	default void printDescription() {
		System.out.println("Electronic Description");
	}
	

}
