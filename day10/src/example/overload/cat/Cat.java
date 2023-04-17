package example.overload.cat;

public class Cat {
	
	String breed;
	String catName;
	
	public Cat() {
		this.catName = "야옹";
		this.breed = "default";
		
	}
	public Cat(String catName, String breed) {
		this.catName = catName;
		this.breed =breed;
	}
	
	public void call() {
		System.out.printf("%s, 이리와\n", catName);
	}
	
	public void call(String catName) {
		System.out.printf("%s, 이리와\n", catName);
	}
}
