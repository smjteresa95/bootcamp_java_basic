package inheritance1;

public class Children extends Human {
	
	String resident;
	
	public Children(String name, int age, String resident) {
		
		this.resident = resident; 
	}
	
	public void printResident() {
		System.out.println(resident);
	}

}
