package Object;

public class Dog {
	
	//instance field
	String breed;
	boolean hasOwner;
	int age;
	
	//Constructor
	public Dog(String dogBreed, boolean dogOwned, int dogYear) {
		System.out.println("constructor invoked.");
		breed = dogBreed;
		hasOwner = dogOwned;
		age = dogYear;
	}
	
	public static void main(String[] args) {
		
		//create instance
		//'new'operator invokes constructor
		Dog dodam = new Dog("poodle", false, 9);
		System.out.println("dodam instance created");
		Dog bori = new Dog("Shiba inu", true, 3);
		System.out.println("bori instance created");
		
		//access to field
		//using: instanceName.fieldName
		
		boolean isBoriOlder = bori.age > dodam.age;
		int totalAge = bori.age+dodam.age;
		
		System.out.println(isBoriOlder);
		System.out.println(totalAge);
	}

}
