package Animal;

public class Dog extends Animal{
	
	private String dogName;
	private int dogYear;
	private String breed;

	
	public Dog() {
		super("Dog", "Woof");
	}
	
	public Dog(String dogName, int dogYear, String Breed) {
		this.dogName=dogName;
		this.dogYear=dogYear;
		this.breed=breed;
	}
	
	public Dog(String dogName) {
		this.dogName=dogName;
	}
	
	//getter
	public String getDogName() {
		return this.dogName;
	}
	
	public int getDogYear() {
		return this.dogYear;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	//setter
	public void setDogName(String dogName) {
		this.dogName=dogName;
	}
	
	public void setDogYear(int dogYear) {
		this.dogYear=dogYear;
	}
	
	public void setBreed(String breed) {
		this.breed=breed;
	}
	
	

}
